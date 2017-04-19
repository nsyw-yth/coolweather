package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 53226 on 2017/4/18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    @SerializedName("update")
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
