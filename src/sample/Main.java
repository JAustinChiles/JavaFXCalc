package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Main extends Application{

    Calculator calc = new Calculator();

    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button equals;
    Button clear;
    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Austin's Calculator");


        //
        Text text = new Text();
        text.setText(calc.inputs);


        add = new Button("+");
        add.setOnAction(e ->{
            calc.add();
            text.setText(calc.inputs);
        });


        subtract = new Button("-");
        subtract.setOnAction(e -> {
            calc.subtract();
            text.setText(calc.inputs);
        });


        multiply = new Button("*");
        multiply.setOnAction(e -> {
            calc.multiply();
            text.setText(calc.inputs);
        });


        divide = new Button("/");
        divide.setOnAction(e -> {
            calc.divide();
            text.setText(calc.inputs);
        });
        equals = new Button("=");
        equals.setOnAction((e -> {
            calc.equals();
            text.setText(calc.inputs);
        }));

        equals = new Button("=");
        equals.setOnAction(e ->{
            calc.equals();
            text.setText(calc.inputs);
            calc.num = 0;
        });

        clear = new Button("C");
        clear.setOnAction(e ->{
            calc.clear();
            text.setText(calc.inputs);
        });

        num0 = new Button("0");
        num0.setOnAction(e ->{
            calc.num0();
            text.setText(calc.inputs);
        });

        num1 = new Button("1");
        num1.setOnAction(e ->{
            calc.num1();
            text.setText(calc.inputs);
        });

        num2 = new Button("2");
        num2.setOnAction(e ->{
            calc.num2();
            text.setText(calc.inputs);
        });

        num3 = new Button("3");
        num3.setOnAction(e ->{
            calc.num3();
            text.setText(calc.inputs);
        });

        num4 = new Button("4");
        num4.setOnAction(e ->{
            calc.num4();
            text.setText(calc.inputs);
        });

        num5 = new Button("5");
        num5.setOnAction(e ->{
            calc.num5();
            text.setText(calc.inputs);
        });

        num6 = new Button("6");
        num6.setOnAction(e ->{
            calc.num6();
            text.setText(calc.inputs);
        });

        num7 = new Button("7");
        num7.setOnAction(e ->{
            calc.num7();
            text.setText(calc.inputs);
        });

        num8 = new Button("8");
        num8.setOnAction(e ->{
            calc.num8();
            text.setText(calc.inputs);
        });

        num9 = new Button("9");
        num9.setOnAction(e ->{
            calc.num9();
            text.setText(calc.inputs);
        });


        Pane layout = new Pane();
        //layout.getChildren().add(broButton);
        layout.getChildren().addAll(add, subtract, multiply, divide, equals, clear, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, text);

        add.relocate(100,150);
        subtract.relocate(100,125);
        multiply.relocate(100,100);
        divide.relocate(100,75);
        text.relocate(60,30);
        clear.relocate(75,75);
        equals.relocate(50,75);
        num0.relocate(25,75);
        num1.relocate(25,150);
        num2.relocate(50,150);
        num3.relocate(75,150);
        num4.relocate(25,125);
        num5.relocate(50,125);
        num6.relocate(75,125);
        num7.relocate(25,100);
        num8.relocate(50,100);
        num9.relocate(75,100);

        //broButton.relocate(50,70);


        //StackPane.setAlignment(add, Pos.values(150));
        //StackPane.setAlignment(subtract, Pos.BOTTOM_LEFT);
        //StackPane.setAlignment(multiply, Pos.BOTTOM_RIGHT);
        //StackPane.setAlignment(divide, Pos.CENTER_LEFT);


        primaryStage.setScene(new Scene(layout, 200, 175));
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}
