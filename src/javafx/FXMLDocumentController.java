/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import threads.Thread1;
import threads.Thread2;
import threads.Thread3;
import threads.Thread4;

/**
 *
 * @author Rafael Vargas Mequita
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane anchorPaneSingleThread;
    @FXML
    private AnchorPane anchorPaneMultiThread;

    
    @FXML
    private ListView<Integer> listView1;
    @FXML
    private ListView<Integer> listView2;
    @FXML
    private ListView<Integer> listView3;
    @FXML
    private ListView<Integer> listView4;
    
    private int i;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        Thread1 thread1 = new Thread1(this.listView1);
        thread1.start();
        Thread2 thread2 = new Thread2(this.listView2);
        thread2.start();
        Thread3 thread3 = new Thread3(this.listView3);
        thread3.start();
        Thread4 thread4 = new Thread4(this.listView4);
        thread4.start();
        
        /*

        System.out.println("Múltiplos de 2 até 1000");
        for (i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                try {
                    this.listView.getItems().add(i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        System.out.println("Múltiplos de 3 até 1000");
        for (i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                try {
                    this.listView.getItems().add(i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        System.out.println("Múltiplos de 4 até 1000");
        for (i = 1; i < 1000; i++) {
            if (i % 4 == 0) {
                try {
                    this.listView.getItems().add(i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

*/

    }

}
