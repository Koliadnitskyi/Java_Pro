package com.pro;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String jobEitle;
    private String email;
    private int phone;
    private int age;

    public Employee(String firstName, String middleName, String lastName, String jobEitle, String email, int phone, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.jobEitle = jobEitle;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobEitle() {
        return jobEitle;
    }

    public void setJobEitle(String jobEitle) {
        this.jobEitle = jobEitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", middleName='" + middleName + '\'' + ", lastName='" + lastName + '\'' + ", jobEitle='" + jobEitle + '\'' + ", email='" + email + '\'' + ", phone=" + phone + ", age=" + age + '}';
    }
}
