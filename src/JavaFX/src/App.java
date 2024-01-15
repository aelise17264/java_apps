
import java.awt.Font;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class app extends Application {

    public void start(Stage myStage){
        StackPane root = new StackPane();
        Text text = new Text("Hello from JavaFX");
        // text.setFont(Font.font("Arial", 12));
        text.setTranslateX(text.getTranslateX() + 100 );

        root.getChildren().add(text);

        Scene scene = new Scene(root, 320, 240);

        myStage.setScene(scene);
        myStage.setTitle("Title");
        myStage.show();
        
    
    }


    public static void main(String[] args) {
        launch(args);
    }
}
