package model;

public class employees {
    private int id;
    private String fullName;
    private String city;
    private String email;
    private String phone;
    private byte gender;
    private long salary;

    public employees(int id, String fullName, String city, String email, String phone, byte gender, long salary) {
        this.id = id;
        this.fullName = fullName;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.salary = salary;
    }

    public employees() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employees{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
