package homework_nr_7;

public class Programmer extends Employee {

    private String programmingLanguage;
    private int yearsOfExperience;

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println(printMyName()+" is working!");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
