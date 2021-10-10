module main.game.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.game.tictactoe to javafx.fxml;
    exports main.game.tictactoe;
}