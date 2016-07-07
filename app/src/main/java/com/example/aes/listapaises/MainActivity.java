package com.example.aes.listapaises;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aes.listapaises.adapter.ArraryAdapterPaises;
import com.example.aes.listapaises.clases.Paises;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Paises> datosPaises=new ArrayList<Paises>();
    ListView listViewPaises;
    TextView textViewPoblacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        listViewPaises=(ListView)findViewById(R.id.listViewPaises);
        textViewPoblacion=(TextView)findViewById(R.id.textViewPoblacion);

        Paises p1=new Paises(200500,"Ecudor");
        Paises p2=new Paises(108800,"Bogota");
        Paises p3=new Paises(607700,"Mexico");
        Paises p4=new Paises(1200200,"Chile");
        Paises p5=new Paises(230500,"Colombia");
        Paises p6=new Paises(288800,"Peru");
        Paises p7=new Paises(697700,"Italia");
        Paises p8=new Paises(520200,"Rusia");
        datosPaises.add(p1);
        datosPaises.add(p2);
        datosPaises.add(p3);
        datosPaises.add(p4);
        datosPaises.add(p5);
        datosPaises.add(p6);
        datosPaises.add(p7);
        datosPaises.add(p8);
        ArraryAdapterPaises adapterPaises =new ArraryAdapterPaises(this,datosPaises);
        listViewPaises.setAdapter(adapterPaises);

        listViewPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String nombrepais=((TextView)view.findViewById(R.id.textViewPaisNombre)).getText().toString();
                String polbacion= Integer.toString((datosPaises.get(i)).getNumeroPoblacion());
                textViewPoblacion.setText("La Poblacion es :"+polbacion);
                Toast.makeText(getApplicationContext(),""+nombrepais,Toast.LENGTH_LONG).show();

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
}
