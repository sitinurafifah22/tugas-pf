
//operator AND_OR_SWITCH (&&)
package operatorLogika;

public class AND_OR_SWITCH {
    public static void main(String[] args){
        int age =23;
        int money = 4000;
        if (age > 21 && money > 500){
        System.out.println("Welcome!");
        }
        
        //OPERATOR OR(||)
        
        int a = 11; int b = 12;
        int c = 40;
        if (a > 100 || b > 3) {
            System.out.println(a); 
        } else {
            System.out.println(c);
        }
    
      //OPERATOR SWITCH  
      
      int x = 10;
        switch(x) {
            case 10:
                System.out.println("A");
                break;
            case 20:
                System.out.println("B");
                break; 
        }   
    }
}
