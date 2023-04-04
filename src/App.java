/*
 * 
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    TextField asideField;
    TextField csideField;
    TextField heightField;
    TextField areaField;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        VBox vbox1 = new VBox();
        HBox hbox = new HBox();
        HBox titlehbox = new HBox();
        HBox asidehbox = new HBox();
        HBox csidehbox = new HBox();
        HBox heighthbox = new HBox();
        HBox buttonhbox = new HBox();
        HBox areahbox = new HBox();
        HBox abouthbox = new HBox();

        Label titleLabel = new Label("Trapéz területszámítás");
        titlehbox.getChildren().add(titleLabel);
        titlehbox.setPadding(new Insets(10,10,10,10));
        titlehbox.setAlignment(Pos.CENTER_RIGHT);
        
        Label asideLabel = new Label("a oldal");
        this.asideField = new TextField();
        asidehbox.getChildren().addAll(asideLabel, asideField);
        asidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(asideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(asideField, new Insets(0, 10, 0, 10));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);

        Label csideLabel = new Label("c oldal");
        this.csideField = new TextField();
        csidehbox.getChildren().addAll(csideLabel, csideField);
        csidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(csideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(csideField, new Insets(0, 10, 0, 10));
        csideLabel.setMinWidth(100);
        csideLabel.setAlignment(Pos.CENTER_RIGHT);

        Label heightLabel = new Label("Magasság");
       this.heightField = new TextField();
        heighthbox.getChildren().addAll(heightLabel, heightField);
        heighthbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(heightLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(heightField, new Insets(0, 10, 0, 10));
        heightLabel.setMinWidth(100);
        heightLabel.setAlignment(Pos.CENTER_RIGHT);

        Button calcButton = new Button("Számít");
        buttonhbox.getChildren().add(calcButton);
        buttonhbox.setAlignment(Pos.CENTER);
        buttonhbox.setPadding(new Insets(10,10,10,10));
        calcButton.setOnAction(e -> {
           startCalcArea();
        });

        Label label1 = new Label("Helló");
        Label label2 = new Label("Helló");
        Label label3 = new Label("Helló");
        Label label4 = new Label("Helló");
        vbox1.getChildren().add(label1);

        vbox1.getChildren().add(label2);

        hbox.getChildren().add(label3);
        hbox.getChildren().add(label4);

        // Eredmény 
        Label areaLabel = new Label();
        areaField = new TextField();
        areahbox.getChildren().addAll(areaLabel,areaField);
       areahbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(areaLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(areaField, new Insets(0, 10, 0, 10));
       areaLabel.setMinWidth(100);
       areaLabel.setAlignment(Pos.CENTER_RIGHT);

       // Névjegy
       Label aboutLabel = new Label("Andó Attila, Szoft I-1 N, 2023-04-03");
        abouthbox.getChildren().add(titleLabel);
        abouthbox.setPadding(new Insets(10,10,10,10));
        abouthbox.setAlignment(Pos.CENTER);

        vbox1.getChildren().add(titlehbox);
        vbox1.getChildren().add(asidehbox);
        vbox1.getChildren().add(csidehbox);
        vbox1.getChildren().add(heighthbox);
        vbox1.getChildren().add(buttonhbox);
        vbox1.getChildren().add(areahbox);
        vbox1.getChildren().add(abouthbox);

        Scene scene = new Scene(vbox1);
        stage.setScene(scene);
        stage.show();
    }
    private void startCalcArea(){
    String asideStr = asideField.getText();
    String csideStr = asideField.getText();
    String heightStr = asideField.getText();
   double aside = Double.parseDouble(asideStr);
   double cside = Double.parseDouble(csideStr);
   double height = Double.parseDouble(heightStr);
   Double area = calcArea(aside, cside, height);
   areaField.setText(area.toString());
    }
    private double calcArea(double aside,double cside,double height){
        double area = (aside+cside)/2*height;
     return area;

    }

}
