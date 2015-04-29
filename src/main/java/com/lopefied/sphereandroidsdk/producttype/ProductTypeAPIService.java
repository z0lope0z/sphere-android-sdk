package com.lopefied.sphereandroidsdk.producttype;

import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.mime.TypedString;
import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface ProductTypeAPIService {

    @POST("/product-types")
    public Observable<ProductType> executeCreateProductType(@Body TypedString jsonProductType);
}