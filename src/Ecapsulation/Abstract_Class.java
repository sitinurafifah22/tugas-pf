
package Ecapsulation;

public class Abstract_Class {
    public static void main(String[] args){
        abstract class Animal {
            public int age;
            public abstract int printAge();
}
        class Dog extends Animal {
            public int printAge() {
                return age;
            }	

        }
    }
    
}
