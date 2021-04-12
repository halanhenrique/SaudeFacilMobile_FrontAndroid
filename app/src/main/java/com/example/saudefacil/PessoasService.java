package com.example.saudefacil;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PessoasService {

    @GET("pessoas")
    Call<List<Pessoa>> buscarPessoas();

}
