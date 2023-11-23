package homework_nr_10;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {
        //5.
        List<Integer> numberList = new ArrayList<>();
        for (int i=1; i<=5; i++){
            numberList.add(i);
        }
        //5.
        Function<Integer, Integer> multipleNumberWithTwo = (Integer i) -> i*2;
        //5.
        System.out.println("Show numbers multiplied by 2---------------->");
        showSomethig(numberList,multipleNumberWithTwo);
    }
    public static void showSomethig(List<Integer> numberList, Function <Integer, Integer> multipleNumberWithTwo){
        for (Integer element:
                 numberList){
            System.out.println(multipleNumberWithTwo.apply(element));
        }
    }
}
