/*Write a java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrrides the makeSound() method to bark.*/


abstract class AnimalTest {
    abstract void makeSound();
}

class Dog extends AnimalTest {
    @Override 
    void makeSound(){
        System.out.println("The dog barks");
    }
}

class Cat extends AnimalTest {
    @Override
    void makeSound(){
        System.out.println("The cat meows");
    }
}

public class Animal {
    public static void main(String[] args){
        AnimalTest dog = new Dog();
        AnimalTest cat = new Cat();
        
        dog.makeSound();
        cat.makeSound();
    }
}