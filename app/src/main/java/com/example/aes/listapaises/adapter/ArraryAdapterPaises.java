package com.example.aes.listapaises.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.aes.listapaises.R;
import com.example.aes.listapaises.clases.Paises;

import java.util.ArrayList;

/**
 * Created by Aes on 7/7/2016.
 */
public class ArraryAdapterPaises extends ArrayAdapter<Paises> {


    public ArraryAdapterPaises(Context context, ArrayList<Paises> paises) {
        super(context,0, paises);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Paises pais=getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.row_pais,parent,false);

        }

        TextView textViewnombrePais=(TextView)convertView.findViewById(R.id.textViewPaisNombre);
        textViewnombrePais.setText(pais.getNombrePais());





        return convertView;
    }
}
