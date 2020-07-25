package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.ListView;

public class Thread3 extends Thread{
    
    private ListView listView;
    private int i;
    
    public Thread3(ListView listView){
        this.listView = listView;
    }
    
    @Override
    public void run(){
        for(i=1; i<1000; i++){
            if(i % 3 == 0){
                Platform.runLater(() -> this.listView.getItems().add(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
