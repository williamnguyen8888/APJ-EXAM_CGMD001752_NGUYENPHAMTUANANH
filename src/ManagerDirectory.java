import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManagerDirectory {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    ArrayList<phoneDirectory> listPhoneNumber = new ArrayList<>();

    public void add(phoneDirectory addPhone) {
        listPhoneNumber.add(addPhone);
    }

    public void read() {
        for (phoneDirectory list : listPhoneNumber) {
            System.out.println(list.toString());
        }
    }
    int countDelete=0;
    public void delete(int phoneNumber) {
        for (phoneDirectory list : listPhoneNumber) {
            if (list.getPhoneNumber() == phoneNumber) {
                countDelete++;
                listPhoneNumber.remove(list);
                break;
            }
        }
    }

    public void update(phoneDirectory addPhone) {
        for (phoneDirectory list : listPhoneNumber) {
            if (list.getPhoneNumber() == addPhone.getPhoneNumber()) {
                list.setPhoneNumber(addPhone.getPhoneNumber());
                list.setGroupPhoneDirectory(addPhone.getGroupPhoneDirectory());
                list.person.setEmail(addPhone.person.getEmail());
                list.person.setAddress(addPhone.person.getAddress());
                list.person.setBirtDay(addPhone.person.getBirtDay());
                list.person.setGender(addPhone.person.getGender());
                list.person.setName(addPhone.person.getName());
            }
        }
    }

int countSearch=0;
    public void search(int phoneNumber){
        for (phoneDirectory list : listPhoneNumber) {
            if (list.getPhoneNumber() == phoneNumber) {
                countSearch++;
                System.out.println(list.toString());
            }
        }
    }
    public void writeToFile() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/file.csv");
            for (phoneDirectory person : listPhoneNumber) {
                fileWriter.append(person.person.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(person.person.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) person.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(person.person.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(person.person.getGender());
                fileWriter.append(NEW_LINE_SEPARATOR);
                fileWriter.append(person.person.getBirtDay());
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
