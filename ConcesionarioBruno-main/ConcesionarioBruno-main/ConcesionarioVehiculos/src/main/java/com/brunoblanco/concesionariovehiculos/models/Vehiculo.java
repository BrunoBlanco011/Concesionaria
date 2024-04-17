package com.brunoblanco.concesionariovehiculos.models;

public class Vehiculo {

    protected String modelo;
    protected String kilometraje;

    protected String placa;

    public Vehiculo() {
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getKilometraje() {
        return kilometraje;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +"Placa"+ placa +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
