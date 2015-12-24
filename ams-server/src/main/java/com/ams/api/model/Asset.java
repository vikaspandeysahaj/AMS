package com.ams.api.model;

import java.util.Date;

/**
 * Created by vikas on 24/12/15.
 */
public class Asset {

    private int id;
    private String title;
    private AssetType assetType;
    private String brand;
    private Date purchasedDate;
    private AssetState state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public AssetState getState() {
        return state;
    }

    public void setState(AssetState state) {
        this.state = state;
    }
}
