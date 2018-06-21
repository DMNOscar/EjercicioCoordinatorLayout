package com.example.oscar.ejerciciocordinatoorlayout;

import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.BindView;

import static com.example.oscar.ejerciciocordinatoorlayout.R.menu.menu_compra_tool_bar;

public class MainActivity extends AppCompatActivity {


    LinearLayout layoutBottomSheet;
    BottomSheetBehavior sheetBehavior;
    int i=0;
    @ CoordinatorLayout.DefaultBehavior (FloatingActionButton.Behavior.class)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_activity);

 /*     Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setTitle("Seleciona una fecha");
        getSupportActionBar().setSubtitle("About");


        LinearLayout llBottomSheet = (LinearLayout) findViewById(R.id.bottom_sheet);

        sheetBehavior = BottomSheetBehavior.from(llBottomSheet);

        final ImageView imagenPortada= (ImageView) findViewById(R.id.imgPortada);
        Button cambiarImagen = (Button) findViewById(R.id.btnCambiarImagen);
        cambiarImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    imagenPortada.setImageResource(R.drawable.portadados);
                    i=1;
                }else{
                    imagenPortada.setImageResource(R.drawable.img_portada);
                    i=0;
                }

            }
        });

        FloatingActionButton mensaje = (FloatingActionButton) findViewById(R.id.Mensaje);

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


                if(sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED){

                  sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

               } else {
                   sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

                }
        }
        });*/
    }
}
