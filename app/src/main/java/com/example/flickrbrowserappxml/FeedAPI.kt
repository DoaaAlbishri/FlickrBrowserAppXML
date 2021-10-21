package com.example.flickrbrowserappxml

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface FeedAPI {
    //https://www.flickr.com/services/rest/?method=flickr.photos.search&api_key=9cf6eae618774b19d20c9c0d747c820a&tags=&format=rest
    //https://www.flickr.com/services/rest/
    // ?method=flickr.photos.search&api_key=9cf6eae618774b19d20c9c0d747c820a&tags=&format=rest
/*
    @get:GET("/rest/?method=flickr.photos.search&api_key=9cf6eae618774b19d20c9c0d747c820a&tags=&format=rest")
    val feed: Call<Feed?>?
*/
    //format=xml
    @GET("/services/rest/?method=flickr.photos.search&api_key=9cf6eae618774b19d20c9c0d747c820a&tags=&format=xml")
    fun feed(@Query("tags")tags: String): Call<Rsp?>?

    companion object {
        const val BASE_URL = "https://www.flickr.com"
    }
}
