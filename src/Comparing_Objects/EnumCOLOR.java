
package Comparing_Objects;

public class EnumCOLOR {
    public static void main(String[ ] args) {
    enum Color  {
  RED, BLUE, GREEN;
}

   
   Color color = Color.RED; 
   switch(color) {
   case BLUE:
     System.out.println("1");
   break;
   case GREEN:
     System.out.println("2");
   break;
   default:
     System.out.println("0");
   break;		 
   }
}
}
    

