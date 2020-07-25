package threads;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Múltiplos de 1 até 1000");
        for(int i=1; i<1000; i++){
            if(i % 1 == 0)
                System.out.println(i + " ");
        }
        
        System.out.println("Múltiplos de 2 até 1000");
        for(int i=1; i<1000; i++){
            if(i % 2 == 0)
                System.out.println(i + " ");
        }
        
        System.out.println("Múltiplos de 3 até 1000");
        for(int i=1; i<1000; i++){
            if(i % 3 == 0)
                System.out.println(i + " ");
        }
        
        System.out.println("Múltiplos de 4 até 1000");
        for(int i=1; i<1000; i++){
            if(i % 4 == 0)
                System.out.println(i + " ");
        }
    }
    
}
