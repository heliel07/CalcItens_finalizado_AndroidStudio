package com.example.calcitens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double vmaca, vbanana, vpera, vuva, vtotal;
    CheckBox cb_maca, cb_banana, cb_pera, cb_uva;
    EditText edt_maca, edt_banana, edt_pera, edt_uva;
    TextView txtV_res;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_maca = (CheckBox) findViewById(R.id.cb_maca);
        cb_banana = (CheckBox) findViewById(R.id.cb_banana);
        cb_pera = (CheckBox) findViewById(R.id.cb_pera);
        cb_uva = (CheckBox) findViewById(R.id.cb_uva);

        edt_maca = (EditText) findViewById(R.id.edt_maca);
        edt_banana = (EditText) findViewById(R.id.edt_banana);
        edt_pera = (EditText) findViewById(R.id.edt_pera);
        edt_uva = (EditText) findViewById(R.id.edt_uva);

        btn_calcular = (Button) findViewById(R.id.btn_calcular);

        txtV_res = (TextView) findViewById(R.id.txtV_total);

        vmaca = 0.25;
        vbanana = 0.20;
        vpera = 0.15;
        vuva = 0.10;

        cb_maca.setText(cb_maca.getText().toString() + String.valueOf(vmaca));
        cb_banana.setText(cb_banana.getText().toString() + String.valueOf(vbanana));
        cb_pera.setText(cb_pera.getText().toString() + String.valueOf(vpera));
        cb_uva.setText(cb_uva.getText().toString() + String.valueOf(vuva));
    }

    public void calculo(View v) {

        vtotal = 0; //Para quando clicar em Calcular, zerar todos os valores e reiniciar a contagem

        if (cb_maca.isChecked()) {
            vtotal += vmaca * Double.parseDouble(edt_maca.getText().toString());
        }
        if (cb_banana.isChecked()) {
            vtotal += vbanana * Double.parseDouble(edt_banana.getText().toString());
        }
        if (cb_pera.isChecked()) {
            vtotal += vpera * Double.parseDouble(edt_pera.getText().toString());
        }
        if (cb_uva.isChecked()) {
            vtotal += vuva * Double.parseDouble(edt_uva.getText().toString());
        }

//        Outra forma de fazer em vez de setar em cima do metodo calculo:
        txtV_res.setText("Valor Total: R$ " + String.valueOf(vtotal));

        Toast.makeText(this, "Calculado", Toast.LENGTH_LONG).show();
    }
}