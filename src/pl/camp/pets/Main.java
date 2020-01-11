package pl.camp.pets;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[5];

        pets[0] = new Dog();

        pets[0].move();

        Dog temp = (Dog) pets[0];

        temp.bark();
        temp.move();
    }
}
