package com.lopefied.sphereandroidsdk.producttype;

import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface ProductTypeService {
    public Observable<ProductType> createProductTypeObs(ProductTypeDraft productTypeDraft);
}