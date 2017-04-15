package com.example.usercomp.retrofitexzample;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static android.R.attr.path;

/**
 * Created by UserComp on 14.04.2017.
 */

public interface MyApi {

    @GET("/api/v4/customers")
    Call<MyCustomers> getData(@Query("apiKey") String password);

    @FormUrlEncoded
    @POST("/api/v4/customers/{id}/edit")
    Call<Customer> update(@Path("id" ) int id,
                          @FieldMap Map<String,String> reqBody);
}
