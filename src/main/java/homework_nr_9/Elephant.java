package homework_nr_9;

public class Elephant extends Herbivore implements Animal{

    @Override
    void move() {
        System.out.println("The elephant is moving slowly");
    }

    @Override
    void chew() {
        System.out.println("The elephant is chewing slowly");
    }

    @Override
    public void walk() {
        System.out.println("The elephant is walking");
    }

    @Override
    public void sleep() {
        System.out.println("The elephant is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("The elephant is eating");
    }

    @Override
    public void proliferate() {
        System.out.println("The elephant is proliferating");
    }

    @Override
    public void layUnderTheSun() {
        System.out.println("The elephant is laying under the sun");
    }
}
