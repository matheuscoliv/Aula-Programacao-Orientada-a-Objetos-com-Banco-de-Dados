package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage palco) {
        Label texto = new Label("Olá, JavaFX no IntelliJ IDEA!");
        Scene cena = new Scene(texto, 400, 300);
        palco.setScene(cena);
        palco.setTitle("Sistema de Vendas - ADS PUC Goiás");
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}