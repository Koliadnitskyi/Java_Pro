public class Employee {
    private String surnameNamePatronymic;
    private String jobEitle;
    private String email;
    private int phone;
    private int age;

    public Employee(String surnameNamePatronymic, String jobEitle, String email, int phone, int age) {
        this.surnameNamePatronymic = surnameNamePatronymic;
        this.jobEitle = jobEitle;
        this.email = email;
        this.phone = phone;
        this.age = age;

    }

    public String getSurnameNamePatronymic() {
        return surnameNamePatronymic;
    }

    public void setSurnameNamePatronymic(String surnameNamePatronymic) {
        this.surnameNamePatronymic = surnameNamePatronymic;
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

    public static class Car {
    }
}
