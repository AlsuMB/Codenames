package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import sample.helpers.RandomCards;
import sample.helpers.RandomColors;
import sample.models.CardsColor;
import java.util.List;

public class MainWindowInGame {
    List<CardsColor> colors;
    List<String> words;
    Text[] wordsFTML;
    GridPane[] colorsFTML;

//    @FXML
//    private ResourceBundle resources;

//    @FXML
//    private DocFlavor.URL location;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private GridPane color_word_change1;

    @FXML
    private Text word_1;

    @FXML
    private GridPane color_word_change4;

    @FXML
    private Text word_4;

    @FXML
    private GridPane color_word_change3;

    @FXML
    private Text word_3;

    @FXML
    private GridPane color_word_change2;

    @FXML
    private Text word_2;

    @FXML
    private GridPane color_word_change5;

    @FXML
    private Text word_5;

    @FXML
    private GridPane color_word_change11;

    @FXML
    private Text word_11;

    @FXML
    private GridPane color_word_change6;

    @FXML
    private Text word_6;

    @FXML
    private GridPane color_word_change16;

    @FXML
    private Text word_16;

    @FXML
    private GridPane color_word_change21;

    @FXML
    private Text word_21;

    @FXML
    private GridPane color_word_change12;

    @FXML
    private Text word_12;

    @FXML
    private GridPane color_word_change7;

    @FXML
    private Text word_7;

    @FXML
    private GridPane color_word_change17;

    @FXML
    private Text word_17;

    @FXML
    private GridPane color_word_change22;

    @FXML
    private Text word_22;

    @FXML
    private GridPane color_word_change13;

    @FXML
    private Text word_13;

    @FXML
    private GridPane color_word_change8;

    @FXML
    private Text word_8;

    @FXML
    private GridPane color_word_change18;

    @FXML
    private Text word_18;

    @FXML
    private GridPane color_word_change23;

    @FXML
    private Text word_23;

    @FXML
    private GridPane color_word_change14;

    @FXML
    private Text word_14;

    @FXML
    private GridPane color_word_change9;

    @FXML
    private Text word_9;

    @FXML
    private GridPane color_word_change19;

    @FXML
    private Text word_19;

    @FXML
    private GridPane color_word_change24;

    @FXML
    private Text word_24;

    @FXML
    private GridPane color_word_change15;

    @FXML
    private Text word_15;

    @FXML
    private GridPane color_word_change10;

    @FXML
    private Text word_10;

    @FXML
    private GridPane color_word_change20;

    @FXML
    private Text word_20;

    @FXML
    private GridPane color_word_change25;

    @FXML
    private Text word_25;

    @FXML
    private Text remaining_words_blue;

    @FXML
    private Text remaining_words_red;

    @FXML
    private Text count_black;

    @FXML
    private Text count_white;

    @FXML
    private Text port_and_host;

    @FXML
    private TextField input_prompt_blue;

    @FXML
    private GridPane gamers_in_blue;

    @FXML
    private Text all_prompt_blue;

    @FXML
    private Text all_prompt_red;

    @FXML
    private TextField input_prompt_red;

    @FXML
    void initialize() {

        RandomCards randomCards = new RandomCards();
        RandomColors randomColors = new RandomColors();
        colors = randomColors.randomColors();
        words = randomCards.give25Cards();
        wordsFTML = new Text[]{word_1, word_2, word_3, word_4, word_5, word_6, word_7, word_8, word_9, word_10,
                word_11, word_12, word_13, word_14, word_15, word_16, word_17, word_18, word_19, word_20, word_21, word_22,
                word_23, word_24, word_25};
        colorsFTML = new GridPane[]{color_word_change1, color_word_change2, color_word_change3, color_word_change4,
                color_word_change5, color_word_change6, color_word_change7, color_word_change8, color_word_change9,
                color_word_change10, color_word_change11, color_word_change12, color_word_change13, color_word_change14,
                color_word_change15, color_word_change16, color_word_change17, color_word_change18, color_word_change19,
                color_word_change20, color_word_change21, color_word_change22, color_word_change23, color_word_change24,
                color_word_change25};
        // если капитан
        showCaptainAllWordsWithColor();
        // другие игроки

    }

    void showOtherWords() {

    }


    void showCaptainAllWordsWithColor() {
        color_word_change25.setStyle("-fx-background-color: FFC673");
        for (int i = 0; i < words.size(); i++) {
            wordsFTML[i].setText(words.get(i));
//            DoubleProperty fontSize = new SimpleDoubleProperty(12);
////            System.out.println(scene);
//
//            VBox child = new VBox(wordsFTML[i]);
//
//            fontSize.bind(scene.widthProperty().add(scene.heightProperty()).divide(50));
//            child.styleProperty().bind(Bindings.concat("-fx-font-size: ", fontSize.asString(), ";"));
            colorsFTML[i].setStyle("-fx-background-color: " + colors.get(i).getCode() + "; -fx-border-color: black; -fx-border-radius: 10; -fx-background-radius: 10");

        }
    }

    private Scene scene;
    public void setScene(Scene scene) {
        System.out.println(scene);
        this.scene = scene;
    }

}

