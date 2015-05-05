package com.lopefied.sphereandroidsdk.attribute;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lope on 4/27/15.
 */
public abstract class AttributeTypeBase {
    @SerializedName("name")
    String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public abstract String getType();
}
