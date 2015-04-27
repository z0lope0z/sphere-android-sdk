package com.lopefied.sphereandroidsdk.product;

import com.google.gson.Gson;
import com.lopefied.sphereandroidsdk.client.SphereClient;
import com.lopefied.sphereandroidsdk.product.model.Product;
import com.lopefied.sphereandroidsdk.product.model.ProductDraft;

import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public class ProductServiceImpl implements ProductService {

    ProductAPIService productAPIService;
    String projectKey;

    public ProductServiceImpl(SphereClient sphereClient) {
        this.productAPIService = sphereClient.buildRestAdapter().create(ProductAPIService.class);
        this.projectKey = sphereClient.getSphereApiConfig().getProjectKey();
    }

    /**
     * {
     * "name": {
     * "en": "Some Product"
     * },
     * "productType": {
     * "id": "<productType-id>",
     * "typeId": "product-type"
     * },
     * "slug": {
     * "en": "product_slug_<random>"
     * }
     * }
     *
     * @param productDraft
     * @return Observable
     */
    @Override
    public Observable<Product> createProductObs(ProductDraft productDraft) {
        Gson gson = new Gson();
        String json = gson.toJson(productDraft);
        return productAPIService.executeCreateProduct(projectKey, json);
    }
}