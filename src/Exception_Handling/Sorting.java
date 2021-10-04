
package Exception_Handling;

public class Sorting {
    public static void main ( String[] args){
    List<String> list = new ArrayList<String>();
    list.add("b");
    list.add("a");
    list.add("c");
    Collections.sort(list);
    System.out.println(list.get(0));
    }
}
