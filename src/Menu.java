import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public phoneDirectory addPhonePerson() {
        phoneDirectory newPhoneNumber = new phoneDirectory();
        System.out.println("mời bạn nhập danh mục số điện thoại");
        newPhoneNumber.setGroupPhoneDirectory(typeOfPhoneNumber());
        System.out.println("mời bạn nhập số điện thoại");
        newPhoneNumber.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập tên chủ số điện thoại");
        newPhoneNumber.person.setName(scanner.nextLine());
        System.out.println("mời bạn nhập giới tính của chủ số điện thoại");
        newPhoneNumber.person.setGender(scanner.nextLine());
        System.out.println("mời bạn nhập ngày tháng năm sinh chủ số điện thoại theo định dạng dd/mm/yyyy");
        newPhoneNumber.person.setBirtDay(scanner.nextLine());
        System.out.println("mời bạn nhập địa chỉ của chủ số điện thoại");
        newPhoneNumber.person.setAddress(scanner.nextLine());
        System.out.println("mời bạn nhập địa chỉ email của chủ số điện thoại");
        newPhoneNumber.person.setEmail(scanner.nextLine());
        return newPhoneNumber;
    }
    public phoneDirectory UpdatePersonPhone() {
        phoneDirectory newPhoneNumber = new phoneDirectory();
        System.out.println("mời bạn nhập số điện thoại cần sửa thông tin");
        newPhoneNumber.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("mời bạn nhập danh mục số điện thoại");
        newPhoneNumber.setGroupPhoneDirectory(typeOfPhoneNumber());
        System.out.println("mời bạn nhập tên chủ số điện thoại");
        newPhoneNumber.person.setName(scanner.nextLine());
        System.out.println("mời bạn nhập giới tính của chủ số điện thoại");
        newPhoneNumber.person.setGender(scanner.nextLine());
        System.out.println("mời bạn nhập ngày tháng năm sinh chủ số điện thoại theo định dạng dd/mm/yyyy");
        newPhoneNumber.person.setBirtDay(scanner.nextLine());
        System.out.println("mời bạn nhập địa chỉ của chủ số điện thoại");
        newPhoneNumber.person.setAddress(scanner.nextLine());
        System.out.println("mời bạn nhập địa chỉ email của chủ số điện thoại");
        newPhoneNumber.person.setEmail(scanner.nextLine());
        return newPhoneNumber;
    }
    public String typeOfPhoneNumber() {
        System.out.println("1.Người thân");
        System.out.println("2.Khách hàng");
        System.out.println("3.Đối tác");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                return "Người thân";
            case 2:
                return "Khách hàng";
            case 3:
                return "Đối tác";
        }
        return null;
    }
}
