import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/loginForm.fxml"));
        Scene mainScene = new Scene(root);
        stage.setScene(mainScene);
        stage.setTitle("TalkLia");
        stage.getIcons().add(new Image("/img/preview 2.png"));
        stage.centerOnScreen();
        stage.show();
    }
}
