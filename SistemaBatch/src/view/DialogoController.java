/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Customer;

/**
 * FXML Controller class
 *
 * @author leoneeng
 */
public class DialogoController implements Initializable {
    @FXML
    private TextField custIDEdit;
    @FXML
    private TextField custCPFEdit;
    @FXML
    private TextField custNomeEdit;
    @FXML
    private TextField custActiveEdit;
    @FXML
    private TextField custValueEdit;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnFinalizar;
    private Customer cust;
    private Stage dialogStage;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void newCustomer(ActionEvent event) {
    }

    @FXML
    private void okCustomer(ActionEvent event) {
    }
      public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
       public void setCustomer(Customer cust) {
           this.cust = cust;

    }
}
