package com.lopefied.sphereandroidsdk.product.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lope on 4/27/15.
 */
public class ProductDraft {
    private ProductType productType;
    @SerializedName("name")
    private String name;
    @SerializedName("slug")
    private String slug;
    @SerializedName("description")
    private String description;

    public ProductDraft(Builder builder) {
        this.productType = builder.productType;
        this.name = builder.name;
        this.slug = builder.slug;
        this.description = builder.description;
    }

    public ProductDraft(ProductType productType, String name, String slug, String description) {
        this.productType = productType;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {
        private ProductType productType;
        private String name;
        private String slug;
        private String description;

        public Builder productType(ProductType productType) {
            this.productType = productType;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public ProductDraft build() {
            return new ProductDraft(this);
        }
    }
}