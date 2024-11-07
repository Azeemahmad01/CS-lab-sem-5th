
class Animal {
    
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Dog inheriting from Animal
class Dog extends Animal {
  
   
    public void makeSound() {
        System.out.println("Dog barks: bhoo! bhoo!");
    }
}

// Cat inheriting from Animal
class Cat extends Animal {
   
   
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class
public class w6q2 {
    public static void main(String[] args) {
        Animal animal1 = new Dog();  // Animal reference holding a Dog object
        Animal animal2 = new Cat();  // Animal reference holding a Cat object
        
        animal1.makeSound(); // Calls Dog's makeSound
        animal2.makeSound(); // Calls Cat's makeSound
    }
}
