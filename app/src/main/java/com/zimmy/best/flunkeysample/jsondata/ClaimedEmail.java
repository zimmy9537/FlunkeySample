
package com.zimmy.best.flunkeysample.jsondata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClaimedEmail {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("uid")
    @Expose
    private String uid;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
