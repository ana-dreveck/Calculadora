package com.example.calculadora;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operação ="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.Display_calc);

    }
    private void atualizarDisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }

    private void numeroDigitado(String numero){
        if (operação.isEmpty()){
            primeiroNumero = primeiroNumero + numero;
        }
        else{
            segundoNumero = segundoNumero + numero;
        }
    }
    public void onClickBotao1(View v){
      numeroDigitado("1");
      atualizarDisplay( "1");
    }


    public void onClickBotao2(View v){
        numeroDigitado("2");
        atualizarDisplay("2");
    }
    public void onClickBotao3(View v){
       numeroDigitado("3");
        atualizarDisplay("3");
    }
    public void onClickBotao4(View v){
        numeroDigitado("4");
        atualizarDisplay("4");
    }
    public void onClickBotao5(View v){
        numeroDigitado("5");
       atualizarDisplay("5");
    }
    public void onClickBotao6(View v){
        numeroDigitado("6");
        atualizarDisplay("6");
    }
    public void onClickBotao7(View v){
       numeroDigitado("7");
        atualizarDisplay("7");
    }
    public void onClickBotao8(View v){
        numeroDigitado("8");
       atualizarDisplay("8");
    }
    public void onClickBotao9(View v){
       numeroDigitado("9");
       atualizarDisplay("9");
    }
    public void onClickBotao0(View v){
       numeroDigitado("0");
        atualizarDisplay("0");
    }
    public void onClickBotaoAdicao(View v){
       operação = "+";
        atualizarDisplay("+");
    }
    public void onClickBotaoSub(View v){
        operação = "-";
        atualizarDisplay("-");
    }
    public void onClickBotaoMulti(View v){
        operação = "*";
        atualizarDisplay("*");
    }
    public void onClickbotaoDiv(View V){
        operação = "/";
        atualizarDisplay("/");
    }
    public void onClickBotaoResult(View v){
        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()){
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        if (operação.equals("+")){
            int resultado = numero1+numero2;
            display.setText(String.valueOf(resultado));
        }
        if (operação.equals("-")){
            int resultado = numero1-numero2;
            display.setText(String.valueOf(resultado));
        }
        if (operação.equals("*")){
            int resultado = numero1*numero2;
            display.setText(String.valueOf(resultado));
        }
        if (operação.equals("/")){
            float numero01 = Integer.parseInt(primeiroNumero);
            float numero02 = Integer.parseInt(segundoNumero);
            if (!(numero01 == 0) && !(numero02 == 0)) {
            float resultado = numero01/numero02;
            display.setText(String.valueOf(resultado));}
            else { Toast.makeText(MainActivity.this, "Não é possível dividir por 0",
                    Toast.LENGTH_SHORT).show();}

        }
        }
        else { Toast.makeText(MainActivity.this, "Numeros não informados",
                Toast.LENGTH_SHORT).show();}

    }
    public void onClickLimpar(View v) {
     primeiroNumero = "";
     segundoNumero = "";
     operação = "";
     display.setText("");

    }
}