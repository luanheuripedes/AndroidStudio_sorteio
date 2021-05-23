package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Metodo principal 'Construtor'
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Função responsavel pela ação de click do botão
    // Class View: Responsavel por linkar os itens da tela com a classe java
    public void selecionarBotao(View view){

        //Variavel x vai receber um valor randomico de 0 a 10
        int x = new Random().nextInt(11);

        //Aponta para a o textView de id 'textoResultado'
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("O Número sorteado foi: " + x);
    }
}