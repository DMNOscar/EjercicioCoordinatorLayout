package com.example.oscar.ejerciciocordinatoorlayout;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.oscar.ejerciciocordinatoorlayout.R.menu.menu_compra_tool_bar;

public class MainActivity extends AppCompatActivity {
    int sheetBehavior;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_compra_tool_bar, menu);

        MenuItem agregarCarrito, carrito;

        agregarCarrito = (MenuItem) findViewById(R.id.agregarCarrito);
        carrito= (MenuItem) findViewById(R.id.irCarrito);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setTitle("¿Qué es Lorem Ipsum?");
        //getSupportActionBar().setSubtitle("About");

        sheetBehavior = BottomSheetBehavior.PEEK_HEIGHT_AUTO;
        Button mensaje = (Button) findViewById(R.id.Mensaje);

        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Esta es la mugre que se pone arriba del boton", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });

        final EditText textoComentario= (EditText) findViewById(R.id.edtComentario);
        Button opinion = (Button) findViewById(R.id.btnExtraerTexto);
        opinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tu opinion es: "+ textoComentario.getText(), Toast.LENGTH_SHORT).show();
                textoComentario.setText("");
            }
        });


        FloatingActionButton fbVentana= (FloatingActionButton) findViewById(R.id.fbMostrarVentanaInferior);

        fbVentana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  if(sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED){

            //        sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
//
             //   } else {
             //       sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);


                }
          //  }
        });
    }
}
