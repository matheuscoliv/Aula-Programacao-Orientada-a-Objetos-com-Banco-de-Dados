package org.example.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;


public class Produtos implements Initializable {

    @FXML
    private TextField campoNome, campoPreco, campoQuantidadeEstoque;
    @FXML
    public void aoSalvar() {
        String nome = campoNome.getText();
        String preco = campoPreco.getText();
        String quantidade = campoQuantidadeEstoque.getText();

        System.out.printf("\nProdutos: %s\nPreco: %s\nEstoque: %s", nome, preco, quantidade);
    }
    @Override
    public void initialize(URL local, ResourceBundle rb) {
        campoNome.setPromptText("Digite o nome do produto");
    }
}
