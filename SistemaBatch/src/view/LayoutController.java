/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static principal.Principal.palco;

/**
 * FXML Controller class
 *
 * @author leoneeng
 */
public class LayoutController implements Initializable {
    @FXML
    private Button btnCadastro;
    @FXML
    private Button btnNovo;
    @FXML
    private TextArea txtCustomers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showCustomer(ActionEvent event) {
        
    }

    @FXML
    private void newCustomer(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/Dialogo.fxml"));
            SplitPane page = (SplitPane) loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Novos Clientes");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(palco);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.centerOnScreen();
            dialogStage.setResizable(false);
                                  
            dialogStage.showAndWait();

        } catch (IOException e) {
                System.out.println("erro aqui");
        }       
    }
}
