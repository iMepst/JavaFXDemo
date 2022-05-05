package com.haw.test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("view_03.fxml"));
            Scene scene = new Scene(root);

            scene.getStylesheets().add(getClass().getResource("test_css.css").toExternalForm());

            //Set icon of stage
            stage.getIcons().add(new Image("https://images.vexels.com/media/users/3/166401/isolated/lists/b82aa7ac3f736dd78570dd3fa3fa9e24-java-programmiersprachen-symbol.png"));

            //Set title of stage
            stage.setTitle("Stage Demo Program");

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void fewBasics(Stage stage) {
        //Set resizability of stage
        stage.setResizable(false);

        //Set height and width of stage
        stage.setWidth(420);
        stage.setHeight(420);

        //Set initial placement on screen
        stage.setX(50);
        stage.setY(50);

        //initialize stage in Fullscreen
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You cannot escape! Please press 'q' to escape."); //Set the "Exit Hint" message
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); //Set the key to exit Fullscreen

    }
    public Text textInit() {
        //Creates a text object
        Text text = new Text();

        //Set text
        text.setText("This is a demo.");

        //Set placement of text
        text.setX(50);
        text.setY(50);

        //Set the font and colour of the text
        text.setFont(Font.font("Veradana", 50));
        text.setFill(Color.BLACK);

        return text;
    }
    public Line lineInit() {
        //Creates a line object
        Line line = new Line();

        //Set ending and starting point of the line
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);

        //Set the stroke width, colour, opacity and rotation
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        return line;
    }
    public Rectangle rectangleInit() {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);

        return rectangle;
    }
    public Polygon triangleInit() {
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
        );
        triangle.setFill(Color.YELLOW);

        return triangle;
    }
    public Circle circleInit() {
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        return circle;
    }
    public ImageView imageInit() {
        Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMwxLtLIjAy-1Y37UIIFPTh0nqQTes-R_WEg&usqp=CAU");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        return imageView;
    }
    public void placeObjects(Group root) {
        //Place objects onto the stage
        root.getChildren().add(textInit());
        root.getChildren().add(lineInit());
        root.getChildren().add(rectangleInit());
        root.getChildren().add(triangleInit());
        root.getChildren().add(circleInit());
        root.getChildren().add(imageInit());
    }
}



