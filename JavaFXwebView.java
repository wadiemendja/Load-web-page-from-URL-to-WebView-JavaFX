import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class JavaFXwebView extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("title");
        WebView webView = new WebView();
        webView.getEngine().load("http://127.0.0.1:8080");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);
        stage.setScene(scene);
        stage.show();
        
    }  
    
    public static void main(String[] args) throws IOException {
        launch(args);
    }
}