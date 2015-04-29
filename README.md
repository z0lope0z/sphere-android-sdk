#SPHERE IO ANDROID SDK

Android SDK for Sphere API

The [sphere-jvm-sdk](https://github.com/sphereio/sphere-jvm-sdk) is built on Java 8. Android supports only up to Java 7.
This version was built with an Android app in mind.

### GETTING STARTED ###

This project connects with the [Sphere API](http://dev.sphere.io/dev) using [Retrofit](http://square.github.io/retrofit/) and [RxJava Observables](https://github.com/ReactiveX/RxJava).

----
##### Authentication #####
```java
// build auth config
SphereAuthConfig sphereAuthConfig = new SphereAuthConfig.Builder()
        .authUrl("<AUTH_URL>")
        .projectKey("<PROJECT_KEY>")
        .clientId("<CLIENT_ID>")
        .clientSecret("<CLIENT_SECRET>")
        .build();

// generate a Tokens object using the auth config
AuthService authService = new AuthServiceImpl(sphereAuthConfig);
Tokens tokens = authService.getAccessTokenObs().toBlocking().first();
```

##### Building the Client #####
```java
// build the API configuration object using the auth config and the tokens object
SphereApiConfig sphereApiConfig = new SphereApiConfig.Builder()
        .apiUrl("<API_ENDPOINT_URL>")
        .authConfig(sphereAuthConfig)
        .tokens(tokens)
        .build();

// build the client
SphereClient sphereClient = new SphereClient(sphereApiConfig);
```

##### Creating a Product #####
```java
// create a product type
ProductTypeService productTypeService = new ProductTypeServiceImpl(sphereClient);
ProductTypeDraft productTypeDraft = new ProductTypeDraft.Builder()
    .name("Cheap Product")
    .description("So cheap lol")
    .build();
ProductType productType = productTypeService.createProductTypeObs(productTypeDraft).toBlocking().first();

// create a product using the new product type
ProductService productService = new ProductServiceImpl(sphereClient);
Product product = productService.createProductObs(new ProductDraft.Builder()
    .name(new LocalizedName(Locale.ENGLISH.getLanguage(), "Sample Product"))
    .slug(new LocalizedSlug(Locale.ENGLISH.getLanguage(), new Slugify().slugify("Sample Product 1")))
    .productType(productType)
    .build()).toBlocking().first();
```
