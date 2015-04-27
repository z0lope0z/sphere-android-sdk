package com.lopefied.sphereandroidsdk.product.model;

import com.google.gson.annotations.SerializedName;
import com.lopefied.sphereandroidsdk.attribute.AttributeDefinition;

import java.util.List;

/**
 * Created by lope on 4/27/15.
 */
public class ProductType {

    @SerializedName("name")
    private final String name;
    @SerializedName("description")
    private final String description;
    private final List<AttributeDefinition> attributes;

    ProductType(final String name, final String description, final List<AttributeDefinition> attributes) {
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<AttributeDefinition> getAttributes() {
        return attributes;
    }
}
