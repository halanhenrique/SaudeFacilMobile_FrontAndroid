package com.example.saudefacil;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public PessoasService getPessoasService() {
        return this.retrofit.create(PessoasService.class);
    }

}
