
package Ecapsulation;

public class Method_Overloading {
    public static void main(String[ ] args) {
    class A {
   public void doSomething() {
     System.out.println("A");
   }
   public void doSomething(String str) {
     System.out.println(str);
   }
}
class B {
   A object = new A();
   object.doSomething("B");
   }
}
    
}
