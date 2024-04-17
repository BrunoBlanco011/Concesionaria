package com.brunoblanco.concesionariovehiculos.models;

public class Moto extends Vehiculo{

    private String proposito;


    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    @Override
    public String toString() {
        return "Moto{" + "Placa" + placa + "Modelo:" +  modelo + "Kilometraje;" + kilometraje +
                "Proposito=" + proposito + '\'' +
                '}';
    }
}
