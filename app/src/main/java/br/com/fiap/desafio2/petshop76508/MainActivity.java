package br.com.fiap.desafio2.petshop76508;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //Declaração dos itens necessarios para fazer a validação
    RadioGroup rdGroup;
    TextView txtV;
    CheckBox cbFemea;
    CheckBox cbAdestrado;
    CheckBox cbVacina;

    // Declaração do DecimalFormat para 'personalizar' a exibição dos valores
    DecimalFormat formato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RadioGroup - Chama o agrupamento de radios(opções);
        rdGroup = (RadioGroup) findViewById(R.id.rdGroup);

        //Text View - Chama o texto que será exibido na tela.
        txtV = (TextView) findViewById(R.id.text_resultado);

        //CheckBox - Chama cada checkbox das opções extras.
        cbFemea = (CheckBox) findViewById(R.id.femea);
        cbAdestrado = (CheckBox) findViewById(R.id.adestrado);
        cbVacina = (CheckBox) findViewById(R.id.vacina);

        //DecimalFormat - Usado para definir um padrão de exibição dos valores.
        formato = new DecimalFormat(getString(R.string.formato_valor_double));


        //Validação para verificar se ainda não tiver efetuado um calculo, para exibir um valor zerado, assim não deixando um espaço em branco.
        if (txtV.getText().toString().isEmpty()){
            txtV.setText(R.string.valor_sem_calcular);
        }
    }

    public void calcular(View v){

        //declaração de variaveis.
        int selected = rdGroup.getCheckedRadioButtonId();
        double valor = 0;

            //Verifica cada radio, e qual esta selecionado.
            if (selected == R.id.item1){
                valor = 800;
                txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
            }else if (selected == R.id.item2){
                valor = 750;
                txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
            }else if (selected == R.id.item3){
                valor = 700;
                txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
            }else if (selected == R.id.item4){
                valor = 800;
                txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
            }


        //Verificação se os checkbox esta marcado e adicição dos valores adicionais.
        if (cbFemea.isChecked()){
            valor = valor + 180;
            txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
        }
        if (cbAdestrado.isChecked()){
            valor = valor + 400;
            txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
        }
        if (cbVacina.isChecked()){
            valor = valor + 200;
            txtV.setText(getString(R.string.moeda_real)+formato.format(valor));
        }



    }
}
