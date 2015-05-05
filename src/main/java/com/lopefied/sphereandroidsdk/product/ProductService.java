package com.lopefied.sphereandroidsdk.product;

import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface ProductService {
    public Observable<Product> createProductObs(ProductDraft productDraft);

    public Observable<Product> uploadImage(Product product, byte[] imageBytes);
}