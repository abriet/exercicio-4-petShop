package br.com.fiap.desafio2.petshop76508;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        Intent it = getIntent();
        String valor = it.getStringExtra("valor");

        TextView tw = (TextView) findViewById(R.id.valor_carrinho);
        tw.setText(valor);

    }
}
