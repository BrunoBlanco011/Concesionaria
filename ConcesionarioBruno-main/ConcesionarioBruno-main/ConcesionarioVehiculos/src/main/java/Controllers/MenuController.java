package Controllers;

import com.brunoblanco.concesionariovehiculos.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    Stage stage;
    public void onMenuClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("concesionariaScreen.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load() );
        stage.setTitle("Concesionaria");
        stage.setScene(scene);
        stage.show();
        MenuController menuController = fxmlLoader.getController();
        menuController.setStage(stage);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
