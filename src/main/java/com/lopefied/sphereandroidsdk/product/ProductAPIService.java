package com.lopefied.sphereandroidsdk.product;

import com.lopefied.sphereandroidsdk.product.model.Product;

import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface ProductAPIService {

    @POST("/{projectKey}/products")
    public Observable<Product> executeCreateProduct(@Path("projectKey") String projectKey,
                                                    @Body String productDraftJson);
}