package sample;
import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Pair;

public class Main extends Application {

    private int k = 1;
    private static String name1;
    private static String name2;

    public static void win(Button b) {



        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("GAME OVER!");
        if(b.getText().equals("X")){
            alert.setContentText("Game Over! " + name1 + " Is the  Winner!");
        }else if(b.getText().equals("O")){
            alert.setContentText("Game Over! " + name2 + " Is  the Winner!");
        }

        ButtonType buttonTypeOne = new ButtonType("Exit!");

        alert.getButtonTypes().setAll(buttonTypeOne);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne) {
            Platform.exit();
            System.exit(0);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        GridPane grid1 = new GridPane();
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setPadding(new Insets(20, 150, 10, 10));

        TextField player1Name = new TextField();


        name1 = player1Name.getText();
        player1Name.setPromptText("Player1 Name!");
        TextField player2Name = new TextField();
        player2Name.setPromptText("Player2 Name!");
        name2 = player1Name.getText();



        Button playButton = new Button("Play!");

        grid1.add(player1Name, 1, 0);
        grid1.add(player2Name, 1, 1);
        grid1.add(playButton, 1, 2);

        VBox root = new VBox();

        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);

        Button b1 = new Button("1");
        b1.setPrefSize(60, 60);
        b1.setFont(Font.font(0));

        Button b2 = new Button("2");
        b2.setPrefSize(60, 60);
        b2.setFont(Font.font(0));

        Button b3 = new Button("3");
        b3.setPrefSize(60, 60);
        b3.setFont(Font.font(0));

        Button b4 = new Button("4");
        b4.setPrefSize(60, 60);
        b4.setFont(Font.font(0));

        Button b5 = new Button("5");
        b5.setPrefSize(60, 60);
        b5.setFont(Font.font(0));

        Button b6 = new Button("6");
        b6.setPrefSize(60, 60);
        b6.setFont(Font.font(0));

        Button b7 = new Button("7");
        b7.setPrefSize(60, 60);
        b7.setFont(Font.font(0));

        Button b8 = new Button("8");
        b8.setPrefSize(60, 60);
        b8.setFont(Font.font(0));

        Button b9 = new Button("9");
        b9.setPrefSize(60, 60);
        b9.setFont(Font.font(0));

        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        b8.setDisable(true);
        b9.setDisable(true);

        playButton.setOnAction((event) -> {
            if (!player1Name.getText().equals("") && !player2Name.getText().equals("")) {
                b1.setDisable(false);
                b2.setDisable(false);
                b3.setDisable(false);
                b4.setDisable(false);
                b5.setDisable(false);
                b6.setDisable(false);
                b7.setDisable(false);
                b8.setDisable(false);
                b9.setDisable(false);
                playButton.setDisable(true);
                player1Name.setDisable(true);
                player2Name.setDisable(true);


                name1 = player1Name.getText();
                player1Name.setPromptText("Player1 Name!");

                player2Name.setPromptText("Player2 Name!");
                name2 = player2Name.getText();

            }
        });
        Label label = new Label("Tic Tac Toe");

        b1.setOnAction((event) -> {

            if (b1.getText().equals("X") || b1.getText().equals("O")) {
                return;
            }
            b1.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b1.setText("X");
            } else {
                k = 1;
                b1.setText("O");
            }
            if (b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())) {
                win(b1);

            }
            if (b1.getText().equals(b5.getText()) && b1.getText().equals(b9.getText())) {
                win(b1);

            }
            if (b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText())) {
                win(b1);

            }
        });

        b2.setOnAction((event) -> {
            if (b2.getText().equals("X") || b2.getText().equals("O")) {
                return;
            }
            b2.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b2.setText("X");
            } else {
                k = 1;
                b2.setText("O");
            }
            if (b2.getText().equals(b1.getText()) && b2.getText().equals(b3.getText())) {
                win(b2);
            }
            if (b2.getText().equals(b5.getText()) && b1.getText().equals(b8.getText())) {
                win(b2);

            }

        });

        b3.setOnAction((event) -> {
            if (b3.getText().equals("X") || b3.getText().equals("O")) {
                return;
            }
            b3.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b3.setText("X");
            } else {
                k = 1;
                b3.setText("O");
            }
            if (b3.getText().equals(b2.getText()) && b3.getText().equals(b1.getText())) {
                win(b3);
            }
            if (b3.getText().equals(b6.getText()) && b3.getText().equals(b9.getText())) {
                win(b3);
            }
            if (b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText())) {
                win(b3);
            }

        });

        b4.setOnAction((event) -> {
            if (b4.getText().equals("X") || b4.getText().equals("O")) {
                return;
            }
            b4.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b4.setText("X");
            } else {
                k = 1;
                b4.setText("O");
            }

            if (b4.getText().equals(b1.getText()) && b4.getText().equals(b7.getText())) {
                win(b4);
            }
            if (b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText())) {
                win(b4);
            }
        });

        b5.setOnAction((event) -> {
            if (b5.getText().equals("X") || b5.getText().equals("O")) {
                return;
            }
            b5.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b5.setText("X");
            } else {
                k = 1;
                b5.setText("O");
            }

            if (b5.getText().equals(b1.getText()) && b5.getText().equals(b9.getText())) {
                win(b5);
            }
            if (b5.getText().equals(b2.getText()) && b5.getText().equals(b8.getText())) {
                win(b5);
            }
            if (b5.getText().equals(b3.getText()) && b5.getText().equals(b7.getText())) {
                win(b5);
            }
            if (b5.getText().equals(b4.getText()) && b5.getText().equals(b6.getText())) {
                win(b5);
            }

        });

        b6.setOnAction((event) -> {
            if (b6.getText().equals("X") || b6.getText().equals("O")) {
                return;
            }
            b6.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b6.setText("X");
            } else {
                k = 1;
                b6.setText("O");
            }
            if (b6.getText().equals(b3.getText()) && b6.getText().equals(b9.getText())) {
                win(b6);
            }
            if (b6.getText().equals(b4.getText()) && b6.getText().equals(b5.getText())) {
                win(b6);
            }

        });

        b7.setOnAction((event) -> {
            if (b7.getText().equals("X") || b7.getText().equals("O")) {
                return;
            }
            b7.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b7.setText("X");
            } else {
                k = 1;
                b7.setText("O");
            }
            if (b7.getText().equals(b3.getText()) && b7.getText().equals(b5.getText())) {
                win(b7);
            }
            if (b7.getText().equals(b1.getText()) && b7.getText().equals(b4.getText())) {
                win(b7);
            }
            if (b7.getText().equals(b8.getText()) && b7.getText().equals(b9.getText())) {
                win(b7);
            }
        });

        b8.setOnAction((event) -> {
            if (b8.getText().equals("X") || b8.getText().equals("O")) {
                return;
            }
            b8.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b8.setText("X");
            } else {
                k = 1;
                b8.setText("O");
            }
            if (b8.getText().equals(b7.getText()) && b8.getText().equals(b9.getText())) {
                win(b8);
            }
            if (b8.getText().equals(b2.getText()) && b8.getText().equals(b5.getText())) {
                win(b8);
            }
        });

        b9.setOnAction((event) -> {
            if (b9.getText().equals("X") || b1.getText().equals("O")) {
                return;
            }
            b9.setFont(Font.font(16));
            if (k == 1) {
                k = 2;
                b9.setText("X");
            } else {
                k = 1;
                b9.setText("O");

            }
            if (b9.getText().equals(b7.getText()) && b9.getText().equals(b8.getText())) {
                win(b9);
            }
            if (b9.getText().equals(b3.getText()) && b9.getText().equals(b6.getText())) {
                win(b9);
            }
            if (b9.getText().equals(b1.getText()) && b9.getText().equals(b5.getText())) {
                win(b9);
            }
        });

        root.getChildren().add(label);
        grid.add(b1, 1, 1);
        grid.add(b2, 2, 1);
        grid.add(b3, 3, 1);

        grid.add(b4, 1, 2);
        grid.add(b5, 2, 2);
        grid.add(b6, 3, 2);

        grid.add(b7, 1, 3);
        grid.add(b8, 2, 3);
        grid.add(b9, 3, 3);

        grid.setAlignment(Pos.CENTER);

        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(grid1, grid);

        Scene scene = new Scene(root, 300, 360);

        primaryStage.setTitle("Tic Tac Toe!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}