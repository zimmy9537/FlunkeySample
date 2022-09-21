
package com.zimmy.best.flunkeysample.jsondata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Createdate {

    @SerializedName("_seconds")
    @Expose
    private Integer seconds;
    @SerializedName("_nanoseconds")
    @Expose
    private Integer nanoseconds;

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public Integer getNanoseconds() {
        return nanoseconds;
    }

    public void setNanoseconds(Integer nanoseconds) {
        this.nanoseconds = nanoseconds;
    }

}
