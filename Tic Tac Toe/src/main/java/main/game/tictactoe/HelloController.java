package main.game.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class HelloController {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    private boolean bt1;
    private boolean bt2;
    private boolean bt3;

    private boolean bt4;
    private boolean bt5;
    private boolean bt6;

    private boolean bt7;
    private boolean bt8;
    private boolean bt9;

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button exitButton;
    @FXML
    private Label oScore;
    @FXML
    private Button resetButton;
    @FXML
    private Label xScore;

    @FXML
    void closeWindow(ActionEvent event) {



        Alert cancel = new Alert(Alert.AlertType.CONFIRMATION);
        cancel.setTitle("Exit");
        cancel.setHeaderText("Confirm if you want to quit");
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
        cancel.getButtonTypes().setAll(yes, no);
        Optional<ButtonType>result = cancel.showAndWait();

        if (result.get() == yes)
        {
            System.exit(0);
        }

    }


    private void gameScore()
    {
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }

    private void choosePlayer(String Player)
    {
        if(startGame == Player) {
            if (startGame.equalsIgnoreCase("X")) {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }else
        {
            if (Player.equalsIgnoreCase("X")) {
                startGame = "O";
            } else {
                startGame = "X";
            }
        }
    }

    private void winningGame()
    {
        String b1 = button1.getText();
        String b2 = button2.getText();
        String b3 = button3.getText();

        String b4 = button4.getText();
        String b5 = button5.getText();
        String b6 = button6.getText();

        String b7 = button7.getText();
        String b8 = button8.getText();
        String b9 = button9.getText();

        if(button1.getText() == null) {bt1 = false;}
        else if(button1.getText() == "X" || button1.getText() == "O") {bt1 = true;}
        if(button2.getText() == null) {bt2 = false;}
        else if(button2.getText() == "X" || button2.getText() == "O") {bt2 = true;}
        if(button3.getText() == null) {bt3 = false;}
        else if(button3.getText() == "X" || button3.getText() == "O") {bt3 = true;}

        if(button4.getText() == null) {bt4 = false;}
        else if(button4.getText() == "X" || button4.getText() == "O") {bt4 = true;}
        if(button5.getText() == null) {bt5 = false;}
        else if(button5.getText() == "X" || button5.getText() == "O") {bt5 = true;}
        if(button6.getText() == null) {bt6 = false;}
        else if(button6.getText() == "X" || button6.getText() == "O") {bt6 = true;}

        if(button7.getText() == null) {bt7 = false;}
        else if(button7.getText() == "X" || button7.getText() == "O") {bt7 = true;}
        if(button8.getText() == null) {bt8 = false;}
        else if(button8.getText() == "X" || button8.getText() == "O") {bt8 = true;}
        if(button9.getText() == null) {bt9 = false;}
        else if(button9.getText() == "X" || button9.getText() == "O") {bt9 = true;}

        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            button1.setStyle("-fx-background-color: yellow;");
            button2.setStyle("-fx-background-color: yellow;");
            button3.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            button4.setStyle("-fx-background-color: yellow;");
            button5.setStyle("-fx-background-color: yellow;");
            button6.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            button7.setStyle("-fx-background-color: yellow;");
            button8.setStyle("-fx-background-color: yellow;");
            button9.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            button1.setStyle("-fx-background-color: yellow;");
            button4.setStyle("-fx-background-color: yellow;");
            button7.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            button2.setStyle("-fx-background-color: yellow;");
            button5.setStyle("-fx-background-color: yellow;");
            button8.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            button3.setStyle("-fx-background-color: yellow;");
            button6.setStyle("-fx-background-color: yellow;");
            button9.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            button1.setStyle("-fx-background-color: yellow;");
            button5.setStyle("-fx-background-color: yellow;");
            button9.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b7 == ("X") && b5 == ("X") && b3 == ("X"))
        {
            button7.setStyle("-fx-background-color: yellow;");
            button5.setStyle("-fx-background-color: yellow;");
            button3.setStyle("-fx-background-color: yellow;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'X' Win the Game");
            winning.setHeaderText("Player 'X' win the game and player 'O' loose the game");
            winning.showAndWait();
            xCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            button1.setStyle("-fx-background-color: pink;");
            button2.setStyle("-fx-background-color: pink;");
            button3.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            button4.setStyle("-fx-background-color: pink;");
            button5.setStyle("-fx-background-color: pink;");
            button6.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            button7.setStyle("-fx-background-color: pink;");
            button8.setStyle("-fx-background-color: pink;");
            button9.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            button1.setStyle("-fx-background-color: pink;");
            button4.setStyle("-fx-background-color: pink;");
            button7.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            button2.setStyle("-fx-background-color: pink;");
            button5.setStyle("-fx-background-color: pink;");
            button8.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            button3.setStyle("-fx-background-color: pink;");
            button6.setStyle("-fx-background-color: pink;");
            button9.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            button1.setStyle("-fx-background-color: pink;");
            button5.setStyle("-fx-background-color: pink;");
            button9.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        } else if(b7 == ("O") && b5 == ("O") && b3 == ("O"))
        {
            button7.setStyle("-fx-background-color: pink;");
            button5.setStyle("-fx-background-color: pink;");
            button3.setStyle("-fx-background-color: pink;");
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Player 'O' Win the Game");
            winning.setHeaderText("Player 'O' win the game and player 'X' loose the game");
            winning.showAndWait();
            oCount++;
            gameScore();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        }else if (bt1 == true && bt2 == true && bt3 == true &&
                bt4 == true && bt5 == true && bt6 == true &&
                bt7 == true && bt8 == true && bt9 == true)
        {
            Alert winning = new Alert(Alert.AlertType.INFORMATION);
            winning.setTitle("Game Tie");
            winning.setHeaderText("Both players are tie so no one get points");
            winning.showAndWait();

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        }

    }

    @FXML
    void clickButton1(ActionEvent event)
    {
        if(button1.getText() == "X" || button1.getText() == "O")
        {

        }else
        {
            button1.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button1.setStyle("-fx-text-fill: green;");
            }else
            {
                button1.setStyle("-fx-text-fill: blue;");
            }

        }
        choosePlayer(button1.getText());
        winningGame();
    }

    @FXML
    void clickButton2(ActionEvent event)
    {
        if(button2.getText() == "X" || button2.getText() == "O")
        {

        }else
        {
            button2.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button2.setStyle("-fx-text-fill: green;");
            }else
            {
                button2.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button2.getText());
        winningGame();

    }

    @FXML
    void clickButton3(ActionEvent event)
    {
        if(button3.getText() == "X" || button3.getText() == "O")
        {

        }else
        {
            button3.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button3.setStyle("-fx-text-fill: green;");
            }else
            {
                button3.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button3.getText());
        winningGame();

    }

    @FXML
    void clickButton4(ActionEvent event)
    {
        if(button4.getText() == "X" || button4.getText() == "O")
        {

        }else
        {
            button4.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button4.setStyle("-fx-text-fill: green;");
            }else
            {
                button4.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button4.getText());
        winningGame();

    }

    @FXML
    void clickButton5(ActionEvent event)
    {
        if(button5.getText() == "X" || button5.getText() == "O")
        {

        }else
        {
            button5.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button5.setStyle("-fx-text-fill: green;");
            }else
            {
                button5.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button5.getText());
        winningGame();

    }

    @FXML
    void clickButton6(ActionEvent event)
    {
        if(button6.getText() == "X" || button6.getText() == "O")
        {

        }else
        {
            button6.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button6.setStyle("-fx-text-fill: green;");
            }else
            {
                button6.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button6.getText());
        winningGame();

    }

    @FXML
    void clickButton7(ActionEvent event)
    {
        if(button7.getText() == "X" || button7.getText() == "O")
        {

        }else
        {
            button7.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button7.setStyle("-fx-text-fill: green;");
            }else
            {
                button7.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button7.getText());
        winningGame();

    }

    @FXML
    void clickButton8(ActionEvent event)
    {
        if(button8.getText() == "X" || button8.getText() == "O")
        {

        }else
        {
            button8.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button8.setStyle("-fx-text-fill: green;");
            }else
            {
                button8.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button8.getText());
        winningGame();

    }

    @FXML
    void clickButton9(ActionEvent event)
    {
        if(button9.getText() == "X" || button9.getText() == "O")
        {

        }else
        {
            button9.setText(startGame);

            if (startGame.equalsIgnoreCase("X"))
            {
                button9.setStyle("-fx-text-fill: green;");
            }else
            {
                button9.setStyle("-fx-text-fill: blue;");
            }
        }

        choosePlayer(button9.getText());
        winningGame();

    }

    @FXML
    void resetScores(ActionEvent event)
    {

        Alert reset = new Alert(Alert.AlertType.CONFIRMATION);
        reset.setTitle("Game Reset");
        reset.setHeaderText("If you want to Restart the game again press 'Game Restart' button or\nof if you want to undo every moves press 'reset GameCharacters' button");
        ButtonType restartGame = new ButtonType("Game Restart", ButtonBar.ButtonData.OK_DONE);
        ButtonType resetCharacters = new ButtonType("reset GameCharacters", ButtonBar.ButtonData.CANCEL_CLOSE);
        reset.getButtonTypes().setAll(restartGame, resetCharacters);
        Optional<ButtonType>result_reset = reset.showAndWait();

        if (result_reset.get() == restartGame)
        {
            xCount = 0;
            oCount = 0;

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

            gameScore();

        }else
        {

            button1.setText(null);
            button2.setText(null);
            button3.setText(null);
            button4.setText(null);
            button5.setText(null);
            button6.setText(null);
            button7.setText(null);
            button8.setText(null);
            button9.setText(null);

            button1.setStyle("-fx-background-color: null");
            button2.setStyle("-fx-background-color: null");
            button3.setStyle("-fx-background-color: null");
            button4.setStyle("-fx-background-color: null");
            button5.setStyle("-fx-background-color: null");
            button6.setStyle("-fx-background-color: null");
            button7.setStyle("-fx-background-color: null");
            button8.setStyle("-fx-background-color: null");
            button9.setStyle("-fx-background-color: null");

        }

    }


}

/*  ****************************************************
    *               Game Is Completed                  *
    * Author: Anjana S Narasinghe                      *
    * Language: JavaFx                                 *
    * IDE: Intellij IDEA                               *
    * E-mail: nmasnanjana.123@gmail.com                *
    ****************************************************
 */
