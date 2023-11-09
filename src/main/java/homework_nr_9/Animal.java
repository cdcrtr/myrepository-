package homework_nr_9;

public interface Animal {

    String animalName = null;
    int animalWeightInKg = 0;

    void walk();

    void sleep();

    void eat();

    void proliferate();

    static void breath(){
        System.out.println("The Animal breaths");
    }

    default void layUnderTheSun(){
        System.out.println("The Animal lays under the sun");
    }
}
