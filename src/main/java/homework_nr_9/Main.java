package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Animal firstElephant = new Elephant();
        //6.
        firstElephant.walk();
        firstElephant.sleep();
        firstElephant.eat();
        firstElephant.proliferate();
        firstElephant.layUnderTheSun();
        Animal.breath();
        //9.
        Herbivore secondElephant = new Elephant();
        //10.
        secondElephant.chew();
        secondElephant.move();
    }
}
