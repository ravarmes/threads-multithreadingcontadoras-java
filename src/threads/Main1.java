package threads;

import javafx.scene.control.ListView;

public class Main1 {
    
    private static ListView<Integer> listView1;
    private static ListView<Integer> listView2;
    private static ListView<Integer> listView3;
    private static ListView<Integer> listView4;
    
    public static void main(String[] args) {
        
        System.out.println("Múltiplos de 1 até 1000");
        for(int i=1; i<1000; i++)
            if(i % 1 == 0)
                listView1.getItems().add(i);
        
        System.out.println("Múltiplos de 2 até 1000");
        for(int i=1; i<1000; i++)
            if(i % 2 == 0)
                listView2.getItems().add(i);
        
        System.out.println("Múltiplos de 3 até 1000");
        for(int i=1; i<1000; i++)
            if(i % 3 == 0)
                listView3.getItems().add(i);
        
        System.out.println("Múltiplos de 4 até 1000");
        for(int i=1; i<1000; i++)
            if(i % 4 == 0)
                listView4.getItems().add(i);
    }
    
}
