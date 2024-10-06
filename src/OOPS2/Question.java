package OOPS2;

class Instrument {
    void makeSound() {
        System.out.println("make beautiful sound");
    }
}

class Violin extends Instrument {
    void makeSound() {
        System.out.println("violin is good to hear");
    }
}

class Piano extends Instrument {
    void makeSound() {
        System.out.println("piano is played by Shizuka");
    }
}

class Erhu extends Instrument {
    void makeSound() {
        System.out.println("Erhu is played by Shizuka");
    }
}

public class Question {
    public static void main(String[] args) {
        // Create objects
        Violin obj = new Violin();     // Corrected object creation
        Piano obj1 = new Piano();      // Corrected object creation
        Erhu obj2 = new Erhu();        // Corrected object creation

        // Call methods
        obj.makeSound();
        obj1.makeSound();
        obj2.makeSound();
    }
}
