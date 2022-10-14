package StreamTest;

public class Employee {
    private String name;
    private String sex;
    private int salary;
    private int bouns;
    private String wrong;

    public Employee() {
    }

    public Employee(String name, String sex, int salary, int bouns, String wrong) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bouns = bouns;
        this.wrong = wrong;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    public String getWrong() {
        return wrong;
    }

    public void setWrong(String wrong) {
        this.wrong = wrong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary='" + salary + '\'' +
                ", bouns='" + bouns + '\'' +
                ", wrong='" + wrong + '\'' +
                '}';
    }
}
