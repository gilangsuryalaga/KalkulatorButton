package com.example.kalkulatorbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttondel, buttontambah, buttonkurang, buttonkali, buttonbagi, buttonhasil, buttonkoma;

    EditText angka;

    float angka1, angka2;

    boolean penjumlahan, pengurangan, perkalian, pembagian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.nol);
        button1 = (Button) findViewById(R.id.satu);
        button2 = (Button) findViewById(R.id.dua);
        button3 = (Button) findViewById(R.id.tiga);
        button4 = (Button) findViewById(R.id.empat);
        button5 = (Button) findViewById(R.id.lima);
        button6 = (Button) findViewById(R.id.enam);
        button7 = (Button) findViewById(R.id.tujuh);
        button8 = (Button) findViewById(R.id.delapan);
        button9 = (Button) findViewById(R.id.sembilan);
        buttondel = (Button) findViewById(R.id.btnhps);
        buttontambah = (Button) findViewById(R.id.tambah);
        buttonkurang = (Button) findViewById(R.id.kurang);
        buttonkali = (Button) findViewById(R.id.kali);
        buttonbagi = (Button) findViewById(R.id.bagi);
        buttonkoma = (Button) findViewById(R.id.koma);
        buttonhasil = (Button) findViewById(R.id.hasil);
        angka = (EditText) findViewById(R.id.angka);

        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ "0");
            }
        });
        buttontambah.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (angka == null) {
                    angka.setText("");
                } else {
                    angka1 = Float.parseFloat(angka.getText() + "");
                    penjumlahan = true;
                    angka.setText(null);
                }
            }
        });

        buttonkurang.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                    angka1 = Float.parseFloat(angka.getText() + "");
                    pengurangan = true;
                    angka.setText(null);
            }
        });

        buttonkali.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                    angka1 = Float.parseFloat(angka.getText() + "");
                    perkalian = true;
                    angka.setText(null);
                }
        });

        buttonbagi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka1 = Float.parseFloat(angka.getText() + "");
                pembagian= true;
                angka.setText(null);
            }
        });
        buttonhasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka2 = Float.parseFloat(angka.getText()+"");

                if (penjumlahan == true ){
                    angka.setText(angka1 + angka2 + "");
                    penjumlahan = false;
                }

                if (pengurangan == true ){
                    angka.setText(angka1 - angka2 + "");
                    pengurangan = false;
                }

                if (perkalian == true ){
                    angka.setText(angka1 * angka2 + "");
                    perkalian = false;
                }

                if (pembagian == true ){
                    angka.setText(angka1 / angka2 + "");
                    pembagian = false;
                }
            }
        });

        buttondel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText("");
            }
        });

        buttonkoma.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                angka.setText(angka.getText()+ ".");
            }
        });

    }
}
