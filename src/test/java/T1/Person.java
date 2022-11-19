package T1;

/**
 * @ClassName:Person
 * @Auther: Lyh
 * @Date: 2022/10/16 13:50
 * @Version: v1.0
 */
public class Person {
    public String name;
    public String address;
    public String phone;
    public String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Person("person1", "add1", "111", "1111"));
        System.out.println(new Student("stu1","add2","222","2222","大一"));
        System.out.println(new Employee("emp1","add3","333","3333","off1",100,new MyDate(1,1,1)));
        System.out.println(new Faculty("facu1","add4","444","4444","off2",200,new MyDate(2,2,2),10,"弟弟"));
        System.out.println(new Staff("sta1","add5","555","5555","off2",300,new MyDate(3,3,3),"tit1"));
    }
}
class Student extends Person{

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String status;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
class Employee extends Person{
    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate hireDate) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String office;
    public double salary;
    public MyDate hireDate;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", office='" + office + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
class Faculty extends Employee{
    public double hours;
    public String rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate hireDate, double hours, String rank) {
        super(name, address, phone, email, office, salary, hireDate);
        this.hours = hours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", office='" + office + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", hours=" + hours +
                ", rank='" + rank + '\'' +
                '}';
    }
}
class Staff extends Employee{
    public String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phone, email, office, salary, hireDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", office='" + office + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", title='" + title + '\'' +
                '}';
    }
}
class MyDate{
    public int year;
    public int month;
    public int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
