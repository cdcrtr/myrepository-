package homework_nr_6;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Iphone 15","1024 GB",2,999);
        System.out.println(invoice.getAmount());

        Date date = new Date(22,9,2023);
        date.setDay(1);
        date.setMonth(1);
        date.setYear(2023);
        date.displayDate();
    }

}

