public class Person {
    private String name;
    private int age;
    private String work;
    private double salary;
    private String phone;
    public Person(String name, int age, String work, double salary, String phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getWork() {
        return work;
    }
    public double getSalary() {
        return salary;
    }
    public String getPhone() {
        return phone;
    }
}
