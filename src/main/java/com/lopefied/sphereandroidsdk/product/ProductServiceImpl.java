package com.lopefied.sphereandroidsdk.product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.lopefied.sphereandroidsdk.client.SphereClient;
import com.lopefied.sphereandroidsdk.commons.LocalizedName;
import com.lopefied.sphereandroidsdk.commons.LocalizedSlug;
import com.lopefied.sphereandroidsdk.producttype.ProductType;

import java.lang.reflect.Type;

import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedString;
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

    @Override
    public Observable<Product> createProductObs(ProductDraft productDraft) {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalizedName.class, new JsonSerializer<LocalizedName>() {
            @Override
            public JsonElement serialize(LocalizedName src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.add(src.getLocale(), new JsonPrimitive(src.getName()));
                return jsonObject;
            }
        }).registerTypeAdapter(LocalizedSlug.class, new JsonSerializer<LocalizedSlug>() {
            @Override
            public JsonElement serialize(LocalizedSlug src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.add(src.getLocale(), new JsonPrimitive(src.getSlug()));
                return jsonObject;
            }
        }).registerTypeAdapter(ProductType.class, new JsonSerializer<ProductType>() {
            @Override
            public JsonElement serialize(ProductType src, Type typeOfSrc, JsonSerializationContext context) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.add("id", new JsonPrimitive(src.getId()));
                jsonObject.add("typeId", new JsonPrimitive("product-type"));
                return jsonObject;
            }
        }).create();
        return productAPIService.executeCreateProduct(new TypedString(gson.toJson(productDraft)));
    }

    @Override
    public Observable<Product> uploadImage(Product product, byte[] imageBytes) {
        return productAPIService.uploadProductImage("image/jpeg", product.getId(), new TypedByteArray("image/jpeg", imageBytes));
    }
}