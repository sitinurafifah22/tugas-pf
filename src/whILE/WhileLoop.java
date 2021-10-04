
package whILE;

public class WhileLoop {
    public static void main(String[] args){
        int x = 0;
        int y = 5;
            while (x < y) {
                System.out.println("Hello");
                    x++;	
            }
        System.out.println("========================================="); //pembatas
        
      //FOR      
            
        for(int i = 0; i < 10; i++) {
            System.out.println("Great");
        }    
        
        System.out.println("========================================="); //pembatas
        
        for (int i = 2; i < 10; i = i*i) {
            System.out.println(i);
        }
        
        System.out.println("========================================="); //pembatas
        
        //DO...WHILE
        
        int X = 1;
        do {
            System.out.println(X);
            X++;
        } 
        while(X <= 5);
    }
    
}
