package com.lopefied.sphereandroidsdk.product;

import com.lopefied.sphereandroidsdk.product.model.Product;
import com.lopefied.sphereandroidsdk.product.model.ProductDraft;

import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface ProductService {
    public Observable<Product> createProductObs(ProductDraft productDraft);
}