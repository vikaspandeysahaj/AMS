package com.ams.api.model.assetType;

/**
 * Created by vikas on 13/01/16.
 */
public class AssetType {

    private TYPE_NON_IT type_non_it;
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
