package com.example.exa3_2_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*for (int i = 0; i < 10; i++){

            //DUERME AL HILO PRINCIPAL
            try{
                Thread.sleep(1000); //1 seg = 1000 milisegundos
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }*/

        Thread thilo1 = new Thread(){
            @Override
            public void run() { //AQUI ES DONDE VA EL TRABAJO EN SEGUNDO PLANO
                super.run();

                for (int i = 0; i < 10; i++){

                    //DUERME AL HILO PRINCIPAL
                    try{
                        Thread.sleep(1000); //1 seg = 1000 milisegundos
                        Log.wtf("thilo1", i + "");
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }
        };

        thilo1.start(); //CREA UN NUEVO HILO Y LO EJECUTA, SI SE LLAMA COMO METODO RUN SE EJECUTA COMO UN METODO MAS QUE PASA AL HILO PRINCIPAL

    }
}
