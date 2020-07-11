package com.example.jvmcalculadora;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity<X, Y, Resultado, string> extends AppCompatActivity implements View.OnClickListener {
    private EditText n1;
    private EditText n2;
    private TextView resultado;
    Button suma, resta, multiplicacion, division, Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        n1=findViewById(R.id.X);
        n2=findViewById(R.id.Y);

        resultado= findViewById(R.id.Resultado);

        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        multiplicacion = findViewById(R.id.multiplicacion);
        division = findViewById(R.id.division);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {


 
        String n1 = X.getText().toString();
        String n2 = Y.getText().toString();

        int entero1=Integer.parseInt((String) n1);
        int entero2=Integer.parseInt((String) n2);

        int rta = 0;
        switch (v.getId()){
            case R.id.suma:
                rta=entero1+entero2;
                break;
            case R.id.resta:
                rta=entero1-entero2;
                break;
            case R.id.multiplicacion:
                rta=entero1*entero2;
                break;
            case R.id.division:
                rta=entero1/entero2;
                break;


        }
resultado.setText(""+rta);
    }
}