package com.example.appdiaristas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaLogin extends AppCompatActivity {

    public Button bt_cadastro;
    public Button entrar;
    public Button senhaEsqueceu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        bt_cadastro = findViewById(R.id.bt_cadastro);
        entrar = findViewById(R.id.entrar);
        senhaEsqueceu = findViewById(R.id.senhaEsqueceu);

        bt_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaLogin.this,TelaCadastro.class);
                startActivity(intent);
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaLogin.this,TelaPrincipal.class);
                startActivity(intent);
            }
        });

        senhaEsqueceu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaLogin.this,esqueceuSenha.class);
                startActivity(intent);
            }
        });
    }
}