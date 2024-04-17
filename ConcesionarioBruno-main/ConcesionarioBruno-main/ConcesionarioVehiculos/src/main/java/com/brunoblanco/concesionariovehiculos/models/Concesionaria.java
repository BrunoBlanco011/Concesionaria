package com.brunoblanco.concesionariovehiculos.models;

import java.util.ArrayList;
import java.util.Iterator;
public class Concesionaria {

    ArrayList<Vehiculo> listaVehiculos = new ArrayList();

    public Concesionaria() {

    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return this.listaVehiculos;
    }

    public void setNewVehiculo(Vehiculo newVehiculo) {
        this.listaVehiculos.add(newVehiculo);
    }

    public String mostrarVehiculo() {
        String inventario = "";
        for (Vehiculo newVehiculo: listaVehiculos ){
            inventario = inventario + newVehiculo.toString() + "\n";
        }
        return inventario;
    }
    public void editarVehiculo(int iteradorVehiculo, Vehiculo newVehiculo){
    this.listaVehiculos.set(iteradorVehiculo, newVehiculo);
    }
    public void eliminarVehiculo(int iteradorVehiculo){this.listaVehiculos.remove(iteradorVehiculo);
    }

}

