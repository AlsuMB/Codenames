package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EnterController {

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
    private Button create_game;

    @FXML
    private Button enter_guesser;

    @FXML
    void initialize() {
        create_game.setOnAction(event -> {
            create_game.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/allFXML/createGame.fxml"));

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

    void noName() {

    }
}
