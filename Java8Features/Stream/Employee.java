package Stream;

public class Employee {

    private int id;

    private String fName;

    private String lName;

    private int age;

    private int salary;

    public Employee() {
    }

    public Employee(int id, String fName, String lName, int age, int salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", salary=" + salary
                + "]";
    }

}
