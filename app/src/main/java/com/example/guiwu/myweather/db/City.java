package com.example.guiwu.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 乔冠 on 2017/12/10. 市的javaBean
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityNum;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityNum() {
        return cityNum;
    }

    public void setCityNum(int cityNum) {
        this.cityNum = cityNum;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
