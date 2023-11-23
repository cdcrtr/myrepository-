package homework_nr_10;

import java.util.function.Supplier;
import java.util.Random;

public class MainSupplier {
    public static void main(String[] args) {
        //6.
        Supplier<Integer> createRandomNumber = () ->{
            Random random = new Random();
            int randomNumner = random.nextInt(6);
            return randomNumner;
        };
        //6.
        System.out.println("Show random number from 0 till 5 -------------->");
        System.out.println(showSomething(createRandomNumber));
    }
    public static Integer showSomething(Supplier <Integer> createRandomNumber){
        return createRandomNumber.get();
    }
}
