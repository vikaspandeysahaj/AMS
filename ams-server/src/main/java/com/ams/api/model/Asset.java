package com.ams.api.model;

import com.ams.api.model.assetType.AssetType;

import java.util.UUID;

/**
 * Created by vikas on 13/01/16.
 */
public class Asset {

    private AssetType type;
    private String Name;
    private UUID id;

    public Asset(AssetType type){
        this.setType(type);
    }

    public AssetType getType() {
        return type;
    }

    public void setType(AssetType type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
