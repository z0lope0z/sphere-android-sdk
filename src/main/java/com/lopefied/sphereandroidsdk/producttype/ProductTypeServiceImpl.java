package com.lopefied.sphereandroidsdk.producttype;

import com.google.gson.Gson;
import com.lopefied.sphereandroidsdk.client.SphereClient;

import retrofit.mime.TypedString;
import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public class ProductTypeServiceImpl implements ProductTypeService {

    ProductTypeAPIService productTypeAPIService;
    String projectKey;

    public ProductTypeServiceImpl(SphereClient sphereClient) {
        this.productTypeAPIService = sphereClient.buildRestAdapter().create(ProductTypeAPIService.class);
        this.projectKey = sphereClient.getSphereApiConfig().getAuthConfig().getProjectKey();
    }

    @Override
    public Observable<ProductType> createProductTypeObs(ProductTypeDraft productTypeDraft) {
        Gson gson = new Gson();
        String json = gson.toJson(productTypeDraft);
        return productTypeAPIService.executeCreateProductType(new TypedString(json));
    }
}