package com.ams.api;

import com.ams.api.model.NonITAsset;
import com.ams.api.model.assetType.AssetType;
import com.ams.api.model.assetType.NonITAssetType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by vikas on 21/12/15.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

