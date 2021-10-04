
package Exception_Handling;
import java.util.Iterator;
import java.util.LinkedList;
public class Iteratorss {
    public static void main(String[] arhs){
        LinkedList<Integer>list = new LinkedList<Integer>();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
