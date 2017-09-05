/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
                           
    }
                
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
