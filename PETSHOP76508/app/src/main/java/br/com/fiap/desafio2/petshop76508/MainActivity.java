package br.com.fiap.desafio2.petshop76508;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGroup;
    TextView txtV;
    CheckBox cbFemea;
    CheckBox cbAdestrado;
    CheckBox cbVacina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGroup = (RadioGroup) findViewById(R.id.rdGroup);
        txtV = (TextView) findViewById(R.id.text_resultado);

        cbFemea = (CheckBox) findViewById(R.id.femea);
        cbAdestrado = (CheckBox) findViewById(R.id.adestrado);
        cbVacina = (CheckBox) findViewById(R.id.vacina);

    }

    public void calcular(View v){
        int selected = rdGroup.getCheckedRadioButtonId();
        double valor = 0;
            if (selected == R.id.item1){
                valor = 800;
                txtV.setText("R$ "+valor);
            }else if (selected == R.id.item2){
                valor = 750;
                txtV.setText("R$ "+valor);
            }else if (selected == R.id.item3){
                valor = 700;
                txtV.setText("R$ "+valor);
            }else if (selected == R.id.item4){
                valor = 800;
                txtV.setText("R$ "+valor);
            }

        if (cbFemea.isChecked()){
            valor = valor + 180;
            txtV.setText("R$ "+valor);
        }
        if (cbAdestrado.isChecked()){
            valor = valor + 400;
            txtV.setText("R$ "+valor);
        }
        if (cbVacina.isChecked()){
            valor = valor + 200;
            txtV.setText("R$ "+valor);
        }



    }
}
