package olamundojanelaajavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblmensagem;
    private Button btncrick;
    
    @FXML
    private void vliccouBotao(ActionEvent event) {
        lblmensagem.setText("Olá mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
