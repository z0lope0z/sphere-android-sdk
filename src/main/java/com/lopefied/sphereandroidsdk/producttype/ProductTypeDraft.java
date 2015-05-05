package com.lopefied.sphereandroidsdk.producttype;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.lopefied.sphereandroidsdk.attribute.AttributeDefinition;

import java.util.List;

/**
 * Created by lope on 4/27/15.
 */
public class ProductTypeDraft {
    @Expose
    @SerializedName("name")
    private final String name;
    @Expose
    @SerializedName("description")
    private final String description;
    private final List<AttributeDefinition> attributes;

    ProductTypeDraft(final String name, final String description, final List<AttributeDefinition> attributes) {
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }

    ProductTypeDraft(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.attributes = builder.attributes;
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

    public static class Builder {
        private String name;
        private String description;
        private List<AttributeDefinition> attributes;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder attributes(List<AttributeDefinition> attributes) {
            this.attributes = attributes;
            return this;
        }

        public ProductTypeDraft build() {
            return new ProductTypeDraft(this);
        }
    }
}
