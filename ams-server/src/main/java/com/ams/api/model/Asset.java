package com.ams.api.model;

import com.ams.api.model.assetType.AssetType;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by vikas on 13/01/16.
 */

@Entity
@Repository
@Table(name="Asset")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ASSET_ID")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="FK_ASSET_TYPE_ID")
    private AssetType type;

    @Column(name = "ASSET_NAME")
    private String Name;

    public Asset() {
    }

    public Asset(AssetType type, String name) {
        this.type = type;
        Name = name;
    }

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
