
package Method;

public class Static {
    class Person {
    public static int pCount;	
    public static void main(String[ ] args) {			
        Person.pCount = 1; 
        Person.pCount++;
        System.out.println(Person.pCount);		
  }
}
    
}
