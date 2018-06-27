package com.example.oscar.ejerciciocordinatoorlayout;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;

import static android.view.View.GONE;
import static com.example.oscar.ejerciciocordinatoorlayout.R.menu.menu_compra_tool_bar;

public class MainActivity extends AppCompatActivity {


    LinearLayout layoutBottomSheet;
   private BottomSheetBehavior sheetBehavior;
    AppBarLayout appBarLayout;
    TextView masinfo;
    FloatingActionButton fabCarrito;
    int i = 0;

    @CoordinatorLayout.DefaultBehavior(FloatingActionButton.Behavior.class)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_activity);

    fabCarrito= (FloatingActionButton) findViewById(R.id.fabTerminarCompra);


  //getSupportActionBar().setSubtitle("Subtitulo");


        LinearLayout llBottomSheet = (LinearLayout) findViewById(R.id.bottom_sheet_carrito);

        sheetBehavior = BottomSheetBehavior.from(llBottomSheet);

        sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        fabCarrito.setVisibility(GONE);

        masinfo = (TextView) findViewById(R.id.masinfo);

        masinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {

                    sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

                } else {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

                }
            }
        });


        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED){
                    fabCarrito.setVisibility(View.VISIBLE);
                }
                fabCarrito.animate().scaleX(1 - slideOffset).scaleY(1 - slideOffset).setDuration(0).start();
            }
        });



/*        final ImageView imagenPortada = (ImageView) findViewById(R.id.imgPortada);
        Button cambiarImagen = (Button) findViewById(R.id.btnCambiarImagen);
        cambiarImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    imagenPortada.setImageResource(R.drawable.portadados);
                    i = 1;
                } else {
                    imagenPortada.setImageResource(R.drawable.img_portada);
                    i = 0;
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

        final EditText textoComentario = (EditText) findViewById(R.id.edtComentario);

        Button opinion = (Button) findViewById(R.id.btnExtraerTexto);
        opinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tu opinion es: " + textoComentario.getText(), Toast.LENGTH_SHORT).show();
                textoComentario.setText("");
            }
        });


        FloatingActionButton fbVentana = (FloatingActionButton) findViewById(R.id.fbMostrarVentanaInferior);

        fbVentana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {

                    sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

                } else {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

                }
            }
        });*/

        appBarLayout = (AppBarLayout) findViewById(R.id.appBar);


        appBarLayout.addOnOffsetChangedListener(new AppBarStateChangedListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                Log.d("Estado ", state.name());

                Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolBar);

                if (state.name()=="IDLE"){
                    setSupportActionBar(mActionBarToolbar);
                    getSupportActionBar().setTitle("Datos de compra");
                }else if(state.name()=="EXPANDED"){
                    setSupportActionBar(mActionBarToolbar);
                    getSupportActionBar().setTitle("");
                }

                Toast.makeText(MainActivity.this, "Valor: "+state, Toast.LENGTH_SHORT).show();
            }
        });
    }




}

abstract class AppBarStateChangedListener implements AppBarLayout.OnOffsetChangedListener {

    public enum State {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    private State mCurrentState = State.IDLE;

    @Override
    public final void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        if (verticalOffset == 0) {
            setCurrentStateAndNotify(appBarLayout, State.EXPANDED);
        } else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
            setCurrentStateAndNotify(appBarLayout, State.COLLAPSED);
        } else {
            setCurrentStateAndNotify(appBarLayout, State.IDLE);
        }
    }

    private void setCurrentStateAndNotify(AppBarLayout appBarLayout, State state){
        if (mCurrentState != state) {
            onStateChanged(appBarLayout, state);
        }
        mCurrentState = state;
    }

    public abstract void onStateChanged(AppBarLayout appBarLayout, State state);
}
