/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

/**
 *
 * @author ASUS
 */
public class Iteratorsss {
    public static void main (String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();
        System.out.println(it.next());
    }
}
