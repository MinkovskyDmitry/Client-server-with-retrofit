package com.example.usercomp.retrofitexzample;

import android.app.Application;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by UserComp on 14.04.2017.
 */



public class Request extends Application {



    private static MyApi umoriliApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://fsfss.retailcrm.ru/") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        umoriliApi = retrofit.create(MyApi.class); //Создаем объект, при помощи которого будем выполнять запросы
    }

    public static MyApi getApi() {
        return umoriliApi;
    }
}

