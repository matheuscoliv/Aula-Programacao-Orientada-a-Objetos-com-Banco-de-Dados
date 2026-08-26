package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage palco) throws IOException {
        Parent raiz = FXMLLoader.load(
                getClass().getResource("/view/produto.fxml"));
        palco.setScene(new Scene(raiz, 480, 400));
        palco.setTitle("Sistema de Vendas");
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}