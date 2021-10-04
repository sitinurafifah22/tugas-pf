
package ARRAY;

public class LengthArray {
    public static void main(String[] args){
        double sum = 0.0;
        int [] myArray = {1,5,3,4};
        for (int x = 0; x < 4; x++) {
        sum += myArray[x];
        }
            System.out.println(sum);
            
            
    int result = 0;
        for (int i = 0; i < 5; i++) {
        if (i == 3) { 
            result += 10;
        } else {
            result += i;
        }	
        }
            System.out.println(result);
    
    }
    
}
