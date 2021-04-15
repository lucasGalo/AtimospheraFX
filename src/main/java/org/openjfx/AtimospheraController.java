package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;

public class AtimospheraController implements Initializable {

    public void initialize(URL location, ResourceBundle resources){
        // TODO Auto-generated method stub
    }

    public void CloseApp(ActionEvent event ){
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void switchToAtimosphera() throws IOException {
        App.setRoot("primary");
    }
}
