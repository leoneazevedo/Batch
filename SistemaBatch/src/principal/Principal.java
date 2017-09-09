/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Optional;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author leoneeng
 */
public class Principal  extends Application{
    
     public static BorderPane rootLayout;
    public static AnchorPane layout;
    public static Stage palco;
    public static Scene cena;

    @Override
    public void start(Stage palco) throws Exception {
        
        palco.setTitle("Sistema Batch");
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/RootLayout.fxml"));
        rootLayout = loader.load();
        
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("/view/Layout.fxml"));
        layout = loader2.load();
        
        cena = new Scene(rootLayout);
        palco.setScene(cena);        
        palco.centerOnScreen();
        palco.show();        

        rootLayout.setCenter(layout);
        
        palco.setOnCloseRequest((WindowEvent arg0) -> {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Sistema Batch informa");
            alert.setHeaderText("Diálogo de Confirmação");
            alert.setContentText("Deseja realmente sair?");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                            
                System.exit(0);

            } else {

                arg0.consume();

            }
        }); 
                           
    }
                
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
