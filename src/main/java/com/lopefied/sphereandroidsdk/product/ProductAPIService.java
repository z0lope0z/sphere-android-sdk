package com.lopefied.sphereandroidsdk.product;

import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedString;
import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface ProductAPIService {

    @POST("/products")
    public Observable<Product> executeCreateProduct(@Body TypedString productDraftJson);

    @POST("/products/{productId}/images")
    public Observable<Product> uploadProductImage(@Header("Content-Type") String contentType,
                                                  @Path("productId") String productId,
                                                  @Body TypedByteArray productDraftJson);
}