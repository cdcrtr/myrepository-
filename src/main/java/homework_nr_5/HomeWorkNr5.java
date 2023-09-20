package homework_nr_5;

public class HomeWorkNr5 {

    public static void main(String[] args) {

        //4.
        int subtractionNumber = 100;
        int sumOfEvenNumbers = 0;
        long productOfOddNumbers = 1L;

        int [] numbers = new int[101];

        for (int i = 0; i <= 100; i++) {
            numbers[i]=subtractionNumber-i;

            //5.
            System.out.println("Array["+i+"]="+numbers[i]);

            //6.
            if (numbers[i]%2==0){
                sumOfEvenNumbers = sumOfEvenNumbers + numbers[i];
            }else {
                productOfOddNumbers = productOfOddNumbers * numbers[i];
            }
        }
        System.out.println("Sum of all even numbers from 0 till 100 is:"+sumOfEvenNumbers);
        System.out.println("Product of all odd numbers from 0 till 100 is:"+ productOfOddNumbers);

        int[] copyNumbers = new int[101];

        //7.
        for (int i = 0; i <= 100; i++) {
            copyNumbers[i]=numbers[i];
        }
    }
}