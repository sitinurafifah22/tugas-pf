
package Method;

public class MethodReturn {
    public static void main(String[ ] args) {
        int x = 10;
        test(x);
    }
    static void test(int x) {			
        System.out.println(x);
   
   System.out.println("=============================");   //pembatas
   
   //return
        
        int X = 10;
        int Y = myFunc(X);
        System.out.println(Y);
    }
    public static int myFunc(int X) {
        return X*3;
    }
    
   
    
//creating class

public class A {
  public void test() {
    System.out.println("Hi");

  }  

}
} 
