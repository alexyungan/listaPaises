package com.example.aes.listapaises.clases;

/**
 * Created by Aes on 7/7/2016.
 */
public class Paises {
    int numeroPoblacion;
    String nombrePais;

    public Paises(int numeroPoblacion, String nombrePais) {
        this.numeroPoblacion = numeroPoblacion;
        this.nombrePais = nombrePais;
    }

    public int getNumeroPoblacion() {
        return numeroPoblacion;
    }

    public void setNumeroPoblacion(int numeroPoblacion) {
        this.numeroPoblacion = numeroPoblacion;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}
