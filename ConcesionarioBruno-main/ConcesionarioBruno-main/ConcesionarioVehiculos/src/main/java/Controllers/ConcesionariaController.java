package Controllers;

import com.brunoblanco.concesionariovehiculos.models.Carro;
import com.brunoblanco.concesionariovehiculos.models.Concesionaria;
import com.brunoblanco.concesionariovehiculos.models.Moto;
import com.brunoblanco.concesionariovehiculos.models.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;

import java.util.Optional;

public class ConcesionariaController {
    @FXML
    private TextField AreaText;

    private Concesionaria concesionaria = new Concesionaria();


    public void Agregar(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType carro = new ButtonType("Carro");
        ButtonType moto = new ButtonType("Moto");
        alert.getButtonTypes().setAll(carro,moto);
        alert.setTitle("Agregar");
        alert.setHeaderText("Que tipo de vehiculo agregar");
        alert.showAndWait().ifPresent(respuesta ->{
            if (respuesta==carro){
                Carro newCarro = new Carro();
                TextInputDialog dialog = new TextInputDialog();
                dialog.setTitle("Agregar Moto");
                dialog.setHeaderText("Modelo del carro:");
                Optional<String> modelo = dialog.showAndWait();
                modelo.ifPresent(newCarro::setModelo);
                dialog.setHeaderText("Kilometraje:");
                Optional<String> kilometraje= dialog.showAndWait();
                kilometraje.ifPresent(newCarro::setKilometraje);
                dialog.setHeaderText("Numero de bolsas de aire:");
                Optional<String> bolsas = dialog.showAndWait();
                bolsas.ifPresent(newCarro::setBolsaAire);
                dialog.setHeaderText("Numero de puertas");
                Optional<String> puertas = dialog.showAndWait();
                puertas.ifPresent(newCarro::setNumeroPuertas);
                dialog.setHeaderText("Placa:");
                Optional<String> placa= dialog.showAndWait();
                placa.ifPresent(newCarro::setPlaca);
                concesionaria.setNewVehiculo(newCarro);
            }else{
                Moto newMoto = new Moto();
                TextInputDialog dialog = new TextInputDialog();
                dialog.setTitle("Agregar Moto");
                dialog.setHeaderText("Modelo de la moto:");
                Optional<String> result = dialog.showAndWait();
                result.ifPresent(newMoto::setModelo);
                dialog.setHeaderText("Kilometraje de la moto:");
                Optional<String> kilometraje = dialog.showAndWait();
                kilometraje.ifPresent(newMoto::setKilometraje);
                dialog.setHeaderText("Proposito de la moto:");
                Optional<String> proposito= dialog.showAndWait();
                proposito.ifPresent(newMoto::setProposito);
                dialog.setHeaderText("Placa de la moto:");
                Optional<String> placa= dialog.showAndWait();
                placa.ifPresent(newMoto::setPlaca);
                concesionaria.setNewVehiculo(newMoto);
            }
        });
        setText();
    }

    public void Editar(MouseEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Editar vehiculo");
        dialog.setHeaderText("Ingrese la placa del vehiculo a editar");
        Optional<String> productoEli = dialog.showAndWait();
        productoEli.ifPresent(producto -> {
            int i = 0;
            int ia = -1;
            for (Vehiculo vehiculo : concesionaria.getListaVehiculos()) {
                if (vehiculo.getPlaca().equals(producto)) {
                    ia = i;
                }
                i++;
            }
            if (ia != -1){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                ButtonType carro = new ButtonType("Carro");
                ButtonType moto = new ButtonType("Moto");
                alert.getButtonTypes().setAll(carro,moto);
                alert.setTitle("Agregar");
                alert.setHeaderText("Que tipo de vehiculo agregar");
                int finalIa = ia;
                alert.showAndWait().ifPresent(respuesta ->{
                    if (respuesta==carro){
                        Carro newCarro = new Carro();
                        dialog.setTitle("Agregar Moto");
                        dialog.setHeaderText("Modelo del carro:");
                        Optional<String> modelo = dialog.showAndWait();
                        modelo.ifPresent(newCarro::setModelo);
                        dialog.setHeaderText("Kilometraje:");
                        Optional<String> kilometraje= dialog.showAndWait();
                        kilometraje.ifPresent(newCarro::setKilometraje);
                        dialog.setHeaderText("Numero de bolsas de aire:");
                        Optional<String> bolsas = dialog.showAndWait();
                        bolsas.ifPresent(newCarro::setBolsaAire);
                        dialog.setHeaderText("Numero de puertas");
                        Optional<String> puertas = dialog.showAndWait();
                        puertas.ifPresent(newCarro::setNumeroPuertas);
                        dialog.setHeaderText("Placa:");
                        Optional<String> placa= dialog.showAndWait();
                        placa.ifPresent(newCarro::setPlaca);
                        concesionaria.editarVehiculo(finalIa,newCarro);
                    }else{
                        Moto newMoto = new Moto();
                        dialog.setTitle("Agregar Moto");
                        dialog.setHeaderText("Modelo de la moto:");
                        Optional<String> result = dialog.showAndWait();
                        result.ifPresent(newMoto::setModelo);
                        dialog.setHeaderText("Kilometraje de la moto:");
                        Optional<String> kilometraje = dialog.showAndWait();
                        kilometraje.ifPresent(newMoto::setKilometraje);
                        dialog.setHeaderText("Proposito de la moto:");
                        Optional<String> proposito= dialog.showAndWait();
                        proposito.ifPresent(newMoto::setProposito);
                        dialog.setHeaderText("Placa de la moto:");
                        Optional<String> placa= dialog.showAndWait();
                        placa.ifPresent(newMoto::setPlaca);
                        concesionaria.editarVehiculo(finalIa,newMoto);
                    }
                });
            }
        });
        setText();
    }


    public void Eliminar(MouseEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Eliminar vehiculo");
        dialog.setHeaderText("Ingrese la placa del vehiculo a eliminar");
        Optional<String> productoEli = dialog.showAndWait();
        productoEli.ifPresent(producto -> {
            int i = 0;
            int ia = -1;
            for (Vehiculo vehiculo : concesionaria.getListaVehiculos()) {
                if (vehiculo.getPlaca().equals(producto)) {
                    ia = i;
                }
                i++;
            }
            if (ia != -1) {
                concesionaria.eliminarVehiculo(ia);
            }
        });
        setText();
    }

    public void setText(){
        this.AreaText.setText(concesionaria.mostrarVehiculo());
    }

}
