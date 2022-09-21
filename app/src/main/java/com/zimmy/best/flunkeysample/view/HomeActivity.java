package com.zimmy.best.flunkeysample.view;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.zimmy.best.flunkeysample.Konstants;
import com.zimmy.best.flunkeysample.R;
import com.zimmy.best.flunkeysample.RestaurantAdapter;
import com.zimmy.best.flunkeysample.jsondata.Datum;
import com.zimmy.best.flunkeysample.viewmodel.RestaurantViewModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private RecyclerView restaurantRv;
    private RestaurantViewModel viewModel;
    private FloatingActionButton button;
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    private String user;
    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //shared preference
        sharedPreferences = getSharedPreferences(Konstants.personalPreference, Context.MODE_PRIVATE);
        user = sharedPreferences.getString(Konstants.user, "Flunkey");

        //ids
        progressBar = findViewById(R.id.progress);
        restaurantRv = findViewById(R.id.restaurantRv);
        button = findViewById(R.id.refresh);
        navigationView = findViewById(R.id.nav_view);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //drawer and navigation view
        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.nav_view);
        View headView = navigationView.getHeaderView(0);
        TextView userName = headView.findViewById(R.id.userName);
        userName.setText(user);


        //adapters
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        restaurantRv.setLayoutManager(linearLayoutManager);


        //viewModel
        viewModel = new ViewModelProvider(this).get(RestaurantViewModel.class);
        getData();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restaurantRv.setVisibility(View.GONE);
                progressBar.setVisibility(View.VISIBLE);
                viewModel.loadData(HomeActivity.this);
            }
        });
    }


    void getData() {
        viewModel.getRestaurantDetails(this).observe(this, new Observer<ArrayList<Datum>>() {
            @Override
            public void onChanged(ArrayList<Datum> data) {
                RestaurantAdapter restaurantAdapter = new RestaurantAdapter(HomeActivity.this, data);
                restaurantRv.setAdapter(restaurantAdapter);
                restaurantRv.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}