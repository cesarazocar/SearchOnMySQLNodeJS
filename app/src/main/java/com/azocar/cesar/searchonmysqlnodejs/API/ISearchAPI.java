package com.azocar.cesar.searchonmysqlnodejs.API;

import com.azocar.cesar.searchonmysqlnodejs.Model.Person;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ISearchAPI {

    @GET("person")
    Observable<List<Person>> getPersonList();

    @POST("search")
    @FormUrlEncoded
    Observable<List<Person>> searchPerson(@Field("search") String searchQuery);
}
