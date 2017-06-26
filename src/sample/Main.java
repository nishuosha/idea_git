package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello 13");

        TextField text = new TextField();
        text.setPromptText("input your name");

        Button bt = new Button("Submit");
        bt.setOnAction(e -> {
            text.setText(text.getText() + " zhang de chou");
        });

        VBox v = new VBox(20);
        v.getChildren().addAll(text, bt);

        Scene s = new Scene(v, 200, 200);

        primaryStage.setScene(s);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
