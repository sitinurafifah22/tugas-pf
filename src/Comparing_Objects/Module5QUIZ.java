
package Comparing_Objects;

public class Module5QUIZ {
    public static void main (String[] args){
    class A {
   private void print() {
     System.out.println("a");
   }
   private void print(String str) {
     System.out.println("b");
   }
   private void print(int x) {
     System.out.println("c");
   }		
   	
     A object = new A();
     object.print(12);	
   }	
}  
}