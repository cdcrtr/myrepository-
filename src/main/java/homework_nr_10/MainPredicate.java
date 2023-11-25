package homework_nr_10;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class MainPredicate {
    public static void main(String[] args) {
        //3.
        List<Integer> numbersList = new ArrayList<>();
        for(int i = 0; i<= 9; i++){
            numbersList.add(i);
        }
        //3.
        Predicate<Integer> showDddNumbers = (Integer i) -> {
            return i % 2 != 0;
        };
        //3.
        System.out.println("The odd numbers are ------------->");
        testSomething(numbersList,showDddNumbers);
    }
    public static void testSomething ( List<Integer> inputList, Predicate<Integer> showDddNumbers){
        for (Integer element:
                    inputList){

            if (showDddNumbers.test(element)==true) {
                System.out.println(element);
            }
        }
    }
}
