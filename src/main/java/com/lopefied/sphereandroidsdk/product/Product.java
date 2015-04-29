package com.lopefied.sphereandroidsdk.product;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lope on 4/27/15.
 */
public class Product {
    @SerializedName("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
