package threads;

import javafx.scene.control.ListView;

public class Main11 {
    
    private static ListView<Integer> listView1;
    private static ListView<Integer> listView2;
    private static ListView<Integer> listView3;
    private static ListView<Integer> listView4;
    
    public static void main(String[] args) {
        
        for(int i=1; i<1000; i++)
            if(i % 1 == 0)
                listView1.getItems().add(i);
        
        for(int i=1; i<1000; i++)
            if(i % 2 == 0)
                listView2.getItems().add(i);
        
        for(int i=1; i<1000; i++)
            if(i % 3 == 0)
                listView3.getItems().add(i);
        
        for(int i=1; i<1000; i++)
            if(i % 4 == 0)
                listView4.getItems().add(i);
    }
    
}
