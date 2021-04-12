package com.example.saudefacil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBuscarCep = findViewById(R.id.button);
        btnBuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<List<Pessoa>> call = new RetrofitConfig().getPessoasService().buscarPessoas();
                call.enqueue(new Callback<List<Pessoa>>() {
                    @Override
                    public void onResponse(Call<List<Pessoa>> call, Response<List<Pessoa>> response) {
                        List<Pessoa> pessoas = response.body();
                        //resposta.setText(cep.toString());
                    }

                    @Override
                    public void onFailure(Call<List<Pessoa>> call, Throwable t) {
                        Log.e("Pessoas   ", "Erro ao buscar pessoas:" + t.getMessage());
                    }
                });
            }
        });
    }
}