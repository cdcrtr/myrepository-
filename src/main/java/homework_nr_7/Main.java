package homework_nr_7;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Alex",
                "Brown",
                "Microsoft",
                20,
                "QAS");

        Programmer programmer = new Programmer("Bob",
                "Marley",
                "Oracle",
                "Java",
                10);
        //5.
        System.out.println(manager.printMyName());
        System.out.println(manager.getCompanyName());
        System.out.println(manager.getTeamSize());
        System.out.println(manager.getTeamName());
        manager.work();
        System.out.println("-----------------------");
        System.out.println(programmer.printMyName());
        System.out.println(programmer.getCompanyName());
        System.out.println(programmer.getProgrammingLanguage());
        System.out.println(programmer.getYearsOfExperience());
        programmer.work();

        //6.
        Person[] persons = new Person[]{manager,programmer};

        System.out.println("-------------------------");
        //7.
        for (int i = 0; i != persons.length; i++) {
            if (persons[i] instanceof Manager m) {
                m.work();
            }
        }
    }
}
