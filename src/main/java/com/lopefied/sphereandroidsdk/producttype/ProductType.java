package com.lopefied.sphereandroidsdk.producttype;

import com.google.gson.annotations.SerializedName;
import com.lopefied.sphereandroidsdk.attribute.AttributeDefinition;

import java.util.List;

/**
 * Created by lope on 4/27/15.
 * <p/>
 * Example:
 * {
 * "id":"145a9e07-b52e-4a1e-91da-a29a514e06f3",
 * "version":1,
 * "name":"BarcodeProduct",
 * "description":"BarcodeProduct",
 * "classifier":"Complex",
 * "attributes":[
 * <p/>
 * ],
 * "createdAt":"2015-05-05T02:49:24.281Z",
 * "lastModifiedAt":"2015-05-05T02:49:24.281Z"
 * }
 */
public class ProductType {

    @SerializedName("id")
    private String id;
    @SerializedName("version")
    private Integer version;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("attributes")
    private List<AttributeDefinition> attributes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAttributes(List<AttributeDefinition> attributes) {
        this.attributes = attributes;
    }

    public String getDescription() {
        return description;
    }

    public List<AttributeDefinition> getAttributes() {
        return attributes;
    }
}
