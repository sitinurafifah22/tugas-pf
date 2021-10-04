
package Ecapsulation;

public class Anonymous_Classes2 {
    public static void main (String[] args){
        class A {
            public void print(){
                System.out.println("A");
      /* class B {
                public static void main (String [] args){                */      
        A object = new A(){
            @Override public void print(){
                System.out.println("Hello");
            }
        }
            }
        } 
    };
    object.print();
    
}
