package com.lopefied.sphereandroidsdk.auth;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Header;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by lope on 4/27/15.
 */
public interface AuthAPIService {

    @FormUrlEncoded
    @POST("/oauth/token")
    public Observable<Tokens> getAccessTokensObs(@Field("grant_type") String grantType,
                                                 @Field("scope") String manageProject,
                                                 @Header("Authorization") String authHeader);

}