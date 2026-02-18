/* Polymorphism example */

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound:");
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();

        pig.animalSound();
        dog.animalSound();
    }
}

class Pig extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("The pig says 'Oink!'");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says 'Bow-wow!'");
    }
}