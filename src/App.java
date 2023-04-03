

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
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
        TextField asideField = new TextField();
        asidehbox.getChildren().addAll(asideLabel, asideField);
        asidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(asideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(asideField, new Insets(0, 10, 0, 10));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);

        Label csideLabel = new Label("c oldal");
        TextField csideField = new TextField();
        csidehbox.getChildren().addAll(csideLabel, csideField);
        csidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(csideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(csideField, new Insets(0, 10, 0, 10));
        csideLabel.setMinWidth(100);
        csideLabel.setAlignment(Pos.CENTER_RIGHT);

        Label heightLabel = new Label("c oldal");
        TextField heightField = new TextField();
        heighthbox.getChildren().addAll(heightLabel, heightField);
        heighthbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(heightLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(heightField, new Insets(0, 10, 0, 10));
        heightLabel.setMinWidth(100);
        heightLabel.setAlignment(Pos.CENTER_RIGHT);

        Label label1 = new Label("Helló");
        Label label2 = new Label("Helló");
        Label label3 = new Label("Helló");
        Label label4 = new Label("Helló");
        vbox1.getChildren().add(label1);
        vbox1.getChildren().add(label2);

        hbox.getChildren().add(label3);
        hbox.getChildren().add(label4);

        vbox1.getChildren().add(titlehbox);
        vbox1.getChildren().add(asidehbox);
        vbox1.getChildren().add(csidehbox);
        vbox1.getChildren().add(heighthbox);

        Scene scene = new Scene(vbox1);
        stage.setScene(scene);
        stage.show();
    }

}
