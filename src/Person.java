public class Person {
    private String name;
    private String gender;
    private String address;
    private String birtDay;
    private String email;

    public Person() {
    }

    public Person(String name, String gender, String address, String birtDay, String email) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birtDay = birtDay;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birtDay='" + birtDay + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
