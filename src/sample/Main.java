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

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main extends Application {
    int first_num = 0;
    ArrayList<String> exp = new ArrayList<>();
    TextField textField;
    StringBuilder stringBuilder;
    boolean userInput = true;
    boolean isSignChanged = false;


    @Override
    public void start(Stage primaryStage) throws Exception {

        stringBuilder = new StringBuilder();

        textField = new TextField();
        textField.setPrefColumnCount(4);
        textField.setAlignment(Pos.BASELINE_RIGHT);

        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btnPlus = new Button("+");
        Button btn5 = new Button("4");
        Button btn6 = new Button("5");
        Button btn7 = new Button("6");
        Button btnMinus = new Button("-");
        Button btn9 = new Button("7");
        Button btn10 = new Button("8");
        Button btn11 = new Button("9");
        Button btnDivide = new Button("/");
        Button btn13 = new Button(".");
        Button btn14 = new Button("0");
        Button btnEqual = new Button("=");
        Button btnMultiple = new Button("*");
        Button btnClear = new Button("AC");
        Button btnChangeSigh = new Button("+/-");
        Button btnPercent = new Button("%");

        textField.setPrefSize(160, 40);
        btn1.setPrefSize(40, 40);
        btn2.setPrefSize(40, 40);
        btn3.setPrefSize(40, 40);
        btnPlus.setPrefSize(40, 40);
        btn5.setPrefSize(40, 40);
        btn6.setPrefSize(40, 40);
        btn7.setPrefSize(40, 40);
        btnMinus.setPrefSize(40, 40);
        btn9.setPrefSize(40, 40);
        btn10.setPrefSize(40, 40);
        btn11.setPrefSize(40, 40);
        btnChangeSigh.setPrefSize(40, 40);
        btnPercent.setPrefSize(40, 40);

        btnDivide.setPrefSize(40, 40);
        btn13.setPrefSize(40, 40);
        btn14.setPrefSize(40, 40);
        btnEqual.setPrefSize(40, 40);
        btnMultiple.setPrefSize(40, 40);
        btnClear.setPrefSize(40, 40);


        GridPane root = new GridPane();
        root.add(textField, 0, 0, 4, 1);
        root.add(btn1, 0, 1);
        root.add(btn2, 1, 1);
        root.add(btn3, 2, 1);
        root.add(btnPlus, 3, 1);
        root.add(btn5, 0, 2);
        root.add(btn6, 1, 2);
        root.add(btn7, 2, 2);
        root.add(btnMinus, 3, 2);
        root.add(btn9, 0, 3);
        root.add(btn10, 1, 3);
        root.add(btn11, 2, 3);
        root.add(btnDivide, 3, 3);
        root.add(btn13, 0, 4);
        root.add(btn14, 1, 4);
        root.add(btnEqual, 2, 4);
        root.add(btnMultiple, 3, 4);
        root.add(btnClear, 4, 4);
        root.add(btnChangeSigh, 4, 3);
        root.add(btnPercent, 4, 2);


        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stringBuilder.delete(0, stringBuilder.length());
                textField.setText(stringBuilder.toString());
                exp.clear();
            }
        });

        btnChangeSigh.setOnAction(event -> {
            stringBuilder.delete(0, stringBuilder.length());

            stringBuilder.append(textField.getText());
            double num = Double.valueOf(stringBuilder.toString());
            if (num < 0) {
                stringBuilder.delete(0, 1);
            } else if(num > 0) {
                stringBuilder.insert(0, "-");
            }
            textField.setText(stringBuilder.toString());
            int index = exp.size() - 2;
            String curNumInExp = String.valueOf((-1) * Double.valueOf(exp.get(index)));
            exp.set(index, curNumInExp);
            System.out.println("Change sign" + exp);
            System.out.println("------------------------");
            isSignChanged = true;
        });

        btnPercent.setOnAction(event -> {
            percent();
        });

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }
                stringBuilder.append(btn1.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }

                stringBuilder.append(btn2.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;


            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }
                stringBuilder.append(btn3.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;
            }
        });
        btnPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                equal("+");

            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }

                stringBuilder.append(btn5.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;

            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }
                stringBuilder.append(btn6.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }

                stringBuilder.append(btn7.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;

            }
        });
        btnMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                stringBuilder.append(btnMinus.getText());
//                textField.setText(stringBuilder.toString());

//                pressAction = true;
//
//                int num = Integer.valueOf(textField.getText());
//                System.out.println("temp =" + temp);
//                System.out.println("num =" + num);
//                if (temp != 0) {
//                    textField.setText(String.valueOf(temp - num));
//                }
//                stringBuilder.delete(0, stringBuilder.capacity());
//                temp = num;

//                nums.add(Integer.valueOf(textField.getText()));
//                int size = nums.size();
//                if(size>1){
//                    int res = nums.get(size - 2) - nums.get(size - 1);
//                    nums.add(res);
//                    textField.setText(String.valueOf(res));
//
//                }
//                stringBuilder.delete(0, stringBuilder.length());


                equal("-");
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }

                stringBuilder.append(btn9.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;

            }
        });
        btn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }

                stringBuilder.append(btn10.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;

            }
        });
        btn11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }
                stringBuilder.append(btn11.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;
            }
        });
        btnDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                equal("/");
            }
        });
        btn13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }
                stringBuilder.append(btn13.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;
            }
        });
        btn14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (isSignChanged) {
                    stringBuilder.delete(0, stringBuilder.length());
                    textField.setText(stringBuilder.toString());
                    isSignChanged = false;
                }
                stringBuilder.append(btn14.getText());
                textField.setText(stringBuilder.toString());
                userInput = true;

            }
        });
        btnEqual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                equal("=");
            }
        });
        btnMultiple.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                equal("*");
            }
        });


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }


    private void equal(String act) {
        if (userInput) {
            exp.add(textField.getText());
            exp.add(act);
            int size = exp.size();
            System.out.println(exp);
            if (size > 2) {
                System.out.println("Zawel");
                double prevNum = Double.valueOf(exp.get(size - 4));
                double currentNum = Double.valueOf(exp.get(size - 2));
                double res = 0;
                switch (exp.get(size - 3)) {
                    case "+":
                        res = prevNum + currentNum;
                        exp.set(size - 2, String.valueOf(res));
                        break;
                    case "-":
                        res = prevNum - currentNum;
                        exp.set(size - 2, String.valueOf(res));
                        break;
                    case "*":
                        res = prevNum * currentNum;
                        exp.set(size - 2, String.valueOf(res));
                        break;
                    case "/":
                        res = prevNum / currentNum;
                        exp.set(size - 2, String.valueOf(res));
                        break;
//                    case "%":
//                        res = prevNum * currentNum/100;
//                        exp.set(size - 2, String.valueOf(res));
//                        break;
                }
                System.out.println(res);
                textField.setText(String.valueOf(res));
            }

            stringBuilder.delete(0, stringBuilder.length());
            userInput = false;
            if (act.equals("=")) {
                exp.clear();
                userInput = true;
            }

            System.out.println(exp);
            System.out.println("-----------------------");
        } else {
//            userInput = true;
            int size = exp.size();
            if (size > 1) {
                exp.set(size - 1, act);
            }
            System.out.println("Change" + exp);
        }
    }

    private void percent() {
        exp.add(textField.getText());
        int size = exp.size();
        double prevNum = Double.valueOf(exp.get(size - 3));
        double currentNum = Double.valueOf(exp.get(size - 1));
        double resPercent = prevNum * currentNum / 100;
        double res = 0;
        switch (exp.get(size - 2)) {
            case "+":
                res = resPercent + prevNum;
                break;
            case "-":
                res = prevNum - resPercent;
                break;
            case "/":
                res = prevNum / resPercent;
                break;
            case "*":
                res = prevNum * resPercent;
                break;
        }
        textField.setText(String.valueOf(res));
        exp.clear();
        userInput = true;
    }


    public static void main(String[] args) {
        launch(args);
    }

}
