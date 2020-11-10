public class phoneDirectory {
    private int phoneNumber;
    private String groupPhoneDirectory;

    Person person = new Person();

    public phoneDirectory() {
    }

    public phoneDirectory(int phoneNumber, String groupPhoneDirectory) {
        this.phoneNumber = phoneNumber;
        this.groupPhoneDirectory = groupPhoneDirectory;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroupPhoneDirectory() {
        return groupPhoneDirectory;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGroupPhoneDirectory(String groupPhoneDirectory) {
        this.groupPhoneDirectory = groupPhoneDirectory;
    }

    @Override
    public String toString() {
        return "phoneDirectory{" +
                "phoneNumber=" + phoneNumber +
                ", groupPhoneDirectory='" + groupPhoneDirectory + '\'' +
                ", person=" + person +
                '}';
    }
}
