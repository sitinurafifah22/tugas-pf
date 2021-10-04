
package Ecapsulation;

public class Inheritance {
    public static void main (String[] args){
    class Animal {
        public void makeSound() {
        System.out.println("Hi");
        }
    }
        class Dog extends Animal {
    }
    class A {
        Dog dog = new Dog();
        Dog.makeSound();
    }    
    }
}
