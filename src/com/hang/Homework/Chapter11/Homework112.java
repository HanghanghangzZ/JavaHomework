package com.hang.Homework.Chapter11;

import java.util.Date;
import java.util.GregorianCalendar;

public class Homework112 {
    public static void main(String[] args) {
        Person person = new Person("name", "address", "telephone", "email");
        Student senior = new Student("Senior");
        Employee employee = new Employee("company", 2000);
        Faculty faculty = new Faculty("officeHours", "level");
        Staff staff = new Staff("title");

        System.out.println(person);
        System.out.println(senior);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar gregorianCalendar = new GregorianCalendar();

    public MyDate() {
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long time) {
        this.gregorianCalendar.setTimeInMillis(time);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        this.gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
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

class Person {
    private String name = "";
    private String address = "";
    private String telephoneNumber = "";
    private String email = "";

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Person() {
    }

    public Person(String name, String address, String telephoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Student extends Person {
    //    private final String FRESHMAN = "FRESHMAN";
//    private final String SOPHOMORE = "SOPHOMORE";
//    private final String JUNIOR = "JUNIOR";
//    private final String SENIOR = "Senior";
    private final String grade;

    public String getGrade() {
        return grade;
    }

    public Student(String grade) {
        this.grade = grade;
    }

    public Student(String name, String address, String telephoneNumber, String email, String grade) {
        super(name, address, telephoneNumber, email);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student{" +
                "grade='" + grade + '\'' +
                '}';
    }
}

class Employee extends Person {
    private String company = "";
    private double salary;
    private MyDate myDate = new MyDate(new Date().getTime());

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public String getDate() {
        return this.myDate.toString();
    }

    public Employee() {
    }

    public Employee(String company, double salary) {
        this.company = company;
        this.salary = salary;
    }

    public Employee(String name, String address, String telephoneNumber, String email, String company, double salary) {
        super(name, address, telephoneNumber, email);
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                ", myDate=" + myDate.toString() +
                '}';
    }
}

class Faculty extends Employee {
    private String officeHours = "";
    private String level = "";

    public String getOfficeHours() {
        return officeHours;
    }

    public String getLevel() {
        return level;
    }

    public Faculty() {
    }

    public Faculty(String officeHours, String level) {
        this.officeHours = officeHours;
        this.level = level;
    }

    public Faculty(String company, double salary, MyDate myDate, String officeHours, String level) {
        super(company, salary);
        this.officeHours = officeHours;
        this.level = level;
    }

    public Faculty(String name, String address, String telephoneNumber, String email, String company, double salary, MyDate myDate, String officeHours, String level) {
        super(name, address, telephoneNumber, email, company, salary);
        this.officeHours = officeHours;
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Faculty{" +
                "officeHours='" + officeHours + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}

class Staff extends Employee {
    private String title = "";

    public String getTitle() {
        return title;
    }

    public Staff() {
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String company, double salary, MyDate myDate, String title) {
        super(company, salary);
        this.title = title;
    }

    public Staff(String name, String address, String telephoneNumber, String email, String company, double salary, MyDate myDate, String title) {
        super(name, address, telephoneNumber, email, company, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
