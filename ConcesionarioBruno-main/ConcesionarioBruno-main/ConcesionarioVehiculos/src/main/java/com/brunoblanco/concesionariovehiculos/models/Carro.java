package com.brunoblanco.concesionariovehiculos.models;

public class Carro extends Vehiculo {
    private String bolsaAire;
    private String numeroPuertas;

    public Carro() {
        super();
    }

    public String getBolsaAire() {
        return bolsaAire;
    }

    public void setBolsaAire(String bolsaAire) {
        this.bolsaAire = bolsaAire;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Carro {" + "Modelo:" + modelo + "Kilometraje:" + kilometraje +
                "Bolsas de aire=" + bolsaAire +
                ", Numero de Puertas=" + numeroPuertas +
                '}';
    }
}
