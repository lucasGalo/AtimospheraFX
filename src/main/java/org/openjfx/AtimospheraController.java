package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;

public class AtimospheraController {

    @FXML
    private void switchToAtimosphera() throws IOException {
        App.setRoot("primary");
    }
}
