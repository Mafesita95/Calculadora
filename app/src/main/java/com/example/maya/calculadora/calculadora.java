package com.example.maya.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.View.OnClickListener;

public class calculadora extends AppCompatActivity {

     public Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSuma,btnResta,btnDivision,btnClear,btnMulti,btnIgual;
     public TextView text;
     EditText Proceso,Concatenar;
     double numero1,numero2,resultado;
     String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6= (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnSuma = (Button)findViewById(R.id.btnSuma);
        btnResta = (Button)findViewById(R.id.btnResta);
        btnDivision = (Button)findViewById(R.id.btnDivision);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        Proceso = (EditText)findViewById(R.id.Proceso);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                Proceso.setText(Concatenar.getText().toString() + "9");
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "+";
                Concatenar = (EditText)findViewById(R.id.Proceso);
                numero1 = Double.parseDouble(Concatenar.getText().toString());
                Proceso.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "-";
                Concatenar = (EditText)findViewById(R.id.Proceso);
                //Proceso.setText(Concatenar.getText().toString() + "operador");
                numero1 = Double.parseDouble(Concatenar.getText().toString());
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "*";
                Concatenar = (EditText)findViewById(R.id.Proceso);
                numero1 = Double.parseDouble(Concatenar.getText().toString());
                Proceso.setText("");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operador = "/";
                Concatenar = (EditText)findViewById(R.id.Proceso);
                numero1 = Double.parseDouble(Concatenar.getText().toString());
                Proceso.setText("");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 2;
                Proceso.setText("");
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Concatenar = (EditText)findViewById(R.id.Proceso);
                numero2 = Double.parseDouble(Concatenar.getText().toString() );
                Proceso.setText("");


                if(operador.equals("+")){
                    Proceso.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")) {
                    Proceso.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")) {
                    Proceso.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")) {
                    Proceso.setText("");
                    resultado = numero1 / numero2;
                }
                Proceso.setText(String.valueOf(resultado));



            }
        });











    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
