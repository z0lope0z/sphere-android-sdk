package com.lopefied.sphereandroidsdk.product;

import com.google.gson.annotations.SerializedName;
import com.lopefied.sphereandroidsdk.commons.LocalizedName;
import com.lopefied.sphereandroidsdk.commons.LocalizedSlug;
import com.lopefied.sphereandroidsdk.producttype.ProductType;

/**
 * Created by lope on 4/27/15.
 */
public class ProductDraft {
    @SerializedName("productType")
    private ProductType productType;
    @SerializedName("name")
    private LocalizedName name;
    @SerializedName("slug")
    private LocalizedSlug slug;
    @SerializedName("description")
    private String description;

    public ProductDraft(Builder builder) {
        this.productType = builder.productType;
        this.name = builder.name;
        this.slug = builder.slug;
        this.description = builder.description;
    }

    public ProductDraft(ProductType productType, LocalizedName name, LocalizedSlug slug, String description) {
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

    public LocalizedName getName() {
        return name;
    }

    public void setName(LocalizedName name) {
        this.name = name;
    }

    public LocalizedSlug getSlug() {
        return slug;
    }

    public void setSlug(LocalizedSlug slug) {
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
        private LocalizedName name;
        private LocalizedSlug slug;
        private String description;

        public Builder productType(ProductType productType) {
            this.productType = productType;
            return this;
        }

        public Builder name(LocalizedName name) {
            this.name = name;
            return this;
        }

        public Builder slug(LocalizedSlug slug) {
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