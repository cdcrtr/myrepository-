package homework_nr_2;

public class HomeworkNr2 {
    public static void main(String[] args) {

        //4.
        System.out.println("Hello World!");

        //5.
        long    CurrentWorldPopulation = 7811080815L;
        int     CarsProducedThisYear = 55235358;
        char    FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        float   Pi = 3.14159F;
        System.out.println(CurrentWorldPopulation+"\n"+CarsProducedThisYear+"\n"+FirstLetterInAlphabet+"\n"+JavaIsAmazing+"\n"+Pi);

        //6.
        double Price = 234.34D;
        double Tax = 567.78D;
        int Quantity = 42;
        double Sum = 0D;
        System.out.println(Price+"\n"+Tax+"\n"+Quantity+"\n"+Sum);

        double total = Price + Tax * Quantity + Sum;
        System.out.println(total);
        //

    }
}
