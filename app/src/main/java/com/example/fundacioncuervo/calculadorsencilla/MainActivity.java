package com.example.fundacioncuervo.calculadorsencilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum1 =(EditText) findViewById(R.id.edNum1);
        txtnum2 =(EditText) findViewById(R.id.edNum2);
        resultado =(TextView) findViewById(R.id.txtResultad);
    }
    //metodo onclick
    public void doSum(View v){
        int num1= Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado = num1 + num2;
        this.resultado.setText("" + resultado);

    }
    public void dores(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado = num1 - num2;
        this.resultado.setText("" + resultado);
    }

    public void domul(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado = num1 * num2;
        this.resultado.setText("" + resultado);
    }
    public void dodiv(View v) {
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        int resultado = num1 / num2;
        this.resultado.setText("" + resultado);
    }
}
