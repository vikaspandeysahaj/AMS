package com.ams.api.model.assetType;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by vikas on 13/01/16.
 */

@Entity
@Repository
@Table(name="AssetType")
public class AssetType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ASSET_TYPE_ID")
    private int id;


    @Enumerated(EnumType.STRING)
    private TYPE_NON_IT type_non_it;

    @Enumerated(EnumType.STRING)
    private TYPE_IT type_it;



    public TYPE_NON_IT getType_non_it() {
        return type_non_it;
    }

    public void setType_non_it(TYPE_NON_IT type_non_it) {
        this.type_non_it = type_non_it;
    }

    public TYPE_IT getType_it() {
        return type_it;
    }

    public void setType_it(TYPE_IT type_it) {
        this.type_it = type_it;
    }



    public enum TYPE_NON_IT{
        AC;
    }

    public enum TYPE_IT{
        LAPTOPS;
    }



}
