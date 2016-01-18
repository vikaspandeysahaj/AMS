package com.ams.api.model;

import com.ams.api.model.assetType.AssetType;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

/**
 * Created by vikas on 13/01/16.
 */

@Entity
@Repository
@Table(name="NonITAsset")
public class NonITAsset extends Asset {


    public NonITAsset() {
    }

    public NonITAsset(AssetType type) {
        super(type);
    }
}
