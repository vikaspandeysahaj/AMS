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
@Table(name="ITAsset")
public class ITAsset extends Asset{

    public ITAsset() {
    }

    public ITAsset(AssetType type) {
        super(type);
    }
}
