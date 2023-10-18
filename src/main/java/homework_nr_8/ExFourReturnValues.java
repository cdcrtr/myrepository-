package homework_nr_8;
import java.util.ArrayList;
import java.util.HashSet;
public class ExFourReturnValues {
    public static void main(String[] args) {
        ArrayList<String> listOfNotUniqueThings = new ArrayList<>();

        listOfNotUniqueThings.add("Dog");
        listOfNotUniqueThings.add("Cat");
        listOfNotUniqueThings.add("Dog");
        listOfNotUniqueThings.add("Cat");
        listOfNotUniqueThings.add("Hotdog");

        System.out.println(listOfNotUniqueThings);
        System.out.println(returnSetOfUniqueThings(listOfNotUniqueThings));
    }
    public static HashSet<String> returnSetOfUniqueThings(ArrayList<String> element){
        HashSet<String> SetOfUniqueThings = new HashSet<>();

        for (String value:
                element) {
            SetOfUniqueThings.add(value);
        }
        return SetOfUniqueThings;
    }
}
