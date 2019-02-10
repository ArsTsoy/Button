package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    int first_num = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{

        StringBuilder stringBuilder = new StringBuilder();

        TextField textField = new TextField();
        textField.setPrefColumnCount(4);
        textField.setAlignment(Pos.BASELINE_RIGHT);

        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("+");
        Button btn5 = new Button("4");
        Button btn6 = new Button("5");
        Button btn7 = new Button("6");
        Button btn8 = new Button("-");
        Button btn9 = new Button("7");
        Button btn10 = new Button("8");
        Button btn11 = new Button("9");
        Button btn12 = new Button("/");
        Button btn13 = new Button(".");
        Button btn14 = new Button("0");
        Button btn15 = new Button("=");
        Button btn16 = new Button("*");

        textField.setPrefSize(160,40);
        btn1.setPrefSize(40,40);
        btn2.setPrefSize(40,40);
        btn3.setPrefSize(40,40);
        btn4.setPrefSize(40,40);
        btn5.setPrefSize(40,40);
        btn6.setPrefSize(40,40);
        btn7.setPrefSize(40,40);
        btn8.setPrefSize(40,40);
        btn9.setPrefSize(40,40);
        btn10.setPrefSize(40,40);
        btn11.setPrefSize(40,40);
        btn12.setPrefSize(40,40);
        btn13.setPrefSize(40,40);
        btn14.setPrefSize(40,40);
        btn15.setPrefSize(40,40);
        btn16.setPrefSize(40,40);


        GridPane root = new GridPane();
        root.add(textField,0,0,4,1);
        root.add(btn1,0,1);
        root.add(btn2,1,1);
        root.add(btn3,2,1);
        root.add(btn4,3,1);
        root.add(btn5,0,2);
        root.add(btn6,1,2);
        root.add(btn7,2,2);
        root.add(btn8,3,2);
        root.add(btn9,0,3);
        root.add(btn10,1,3);
        root.add(btn11,2,3);
        root.add(btn12,3,3);
        root.add(btn13,0,4);
        root.add(btn14,1,4);
        root.add(btn15,2,4);
        root.add(btn16,3,4);



        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn1.getText());
                textField.setText(stringBuilder.toString());

            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn2.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn3.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                first_num = first_num + Integer.valueOf(stringBuilder.toString());
                stringBuilder.delete(0,stringBuilder.length());
                textField.setText(Integer.toString(first_num));

            }
        });btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn5.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn6.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn7.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn8.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn9.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn10.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn11.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn12.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn13.getText());
                textField.setText(stringBuilder.toString());
            }
        });btn14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn14.getText());
                textField.setText(stringBuilder.toString());;
            }
        });btn15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                first_num = first_num + Integer.valueOf(stringBuilder.toString());
                stringBuilder.delete(0,stringBuilder.length());
                stringBuilder.append(first_num);
                textField.setText(stringBuilder.toString());
                first_num = 0;
            }
        });btn16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.append(btn16.getText());
                textField.setText(stringBuilder.toString());
            }
        });


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
