package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateGameController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enter_captain;

    @FXML
    private TextField enterNameUser;

    @FXML
    private TextField enterPort;

    @FXML
    private Button join_game;

    @FXML
    private Button enter_guessser;

    @FXML
    void initialize() {
        join_game.setOnAction(event -> {
            join_game.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/allFXML/enter.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Codenames");
            stage.setScene(new Scene(loader.getRoot()));
            stage.showAndWait();
        });
    }

}
