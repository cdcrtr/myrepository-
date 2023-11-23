package homework_nr_10;

import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {
        //4.
        String line = "Today is a great day!";
        //4.
        Consumer<String> printStringLine = (String s) -> System.out.println(s);
        //4.
        System.out.println("Print string line---------------->");
        printSomething(line,printStringLine);
    }
    public static void printSomething(String line, Consumer<String> printStringLine){
        printStringLine.accept(line);
        }
}

