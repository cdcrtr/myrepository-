package homework_nr_7;

public abstract class Employee extends Person {

        private String companyName;
        public Employee(String name, String surname, String companyName) {
                super(name, surname);
                this.companyName = companyName;
        }
        public abstract void work();

        public String getCompanyName() {
                return companyName;
        }

        public void setCompanyName(String companyName) {
                this.companyName = companyName;
        }
}
