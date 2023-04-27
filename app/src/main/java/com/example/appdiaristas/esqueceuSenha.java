package com.example.appdiaristas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class esqueceuSenha extends AppCompatActivity {

    public Button atualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueceu_senha);

        atualizar = findViewById(R.id.atualizar);

        atualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(esqueceuSenha.this,TelaLogin.class);
                startActivity(intent);
            }
        });
    }
}