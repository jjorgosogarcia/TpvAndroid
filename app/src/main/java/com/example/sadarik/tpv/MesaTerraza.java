package com.example.sadarik.tpv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class MesaTerraza extends Activity implements OnClickListener{

        private ArrayList<Button> arrayBotones;
        GridView gridView;
        Button bt;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.item_mesa_terraza);

            arrayBotones = new ArrayList<Button>();

            for (int i =0; i<8; i++) {
                bt = new Button(this);
                bt.setText("T"+Integer.toString(i+1));
                bt.setHeight(200);
                bt.setTextSize(25);
                bt.setBackgroundResource(R.drawable.terraza);
                bt.setOnClickListener(this);
                bt.setId(i+1);
                registerForContextMenu(bt);
                arrayBotones.add(bt);
            }
            gridView = (GridView) findViewById(R.id.gridviewTerraza);
            gridView.setAdapter(new AdaptadorBotonesInterior(arrayBotones));
        }

        @Override
        public void onClick(View v) {
            Button botonSeleccionado = (Button)v;
            Intent comanda = new Intent(this, Comandas.class);
            startActivity(comanda);
            Toast.makeText(this, botonSeleccionado.getText() + " Presionado", Toast.LENGTH_SHORT).show();
        }
    }

