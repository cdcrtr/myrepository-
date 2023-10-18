package homework_nr_8;

import java.util.ArrayList;

public class ExThreeTodaysToDoList {
    public static void main(String[] args) {

        ArrayList<String> todaysToDoList = returnTodaysToDoList();

        for (String input : todaysToDoList) {

            System.out.println(input);

        }
    }
    public static ArrayList<String> returnTodaysToDoList (){

        ArrayList<String> todaysToDoListInMethod = new ArrayList<>();

        todaysToDoListInMethod.add("Wake up");
        todaysToDoListInMethod.add("Take shower");
        todaysToDoListInMethod.add("Brush my teeth");
        todaysToDoListInMethod.add("Have breakfast");
        todaysToDoListInMethod.add("Visit Koenigssee");

        return todaysToDoListInMethod;

    }
}


