package com.example.oscar.ejerciciocordinatoorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import static com.example.oscar.ejerciciocordinatoorlayout.R.menu.menu_compra_tool_bar;

public class MainActivity extends AppCompatActivity {


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
        getSupportActionBar().setSubtitle("About");




    }
}
