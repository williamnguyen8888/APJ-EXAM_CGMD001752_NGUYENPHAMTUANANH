import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ManagerDirectory method = new ManagerDirectory();
        boolean flag = true;
        do {
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Đọc từ file");
            System.out.println("7.Ghi vào file");
            System.out.println("8.thoát");
            System.out.print("Vui lòng chọn chứ năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (method.listPhoneNumber.size() > 0){
                        method.read();

                    }else {
                        System.out.println("danh bạn trống");
                    }
                    break;
                case 2:
                    phoneDirectory addPhone = menu.addPhonePerson();
                    method.add(addPhone);
                    break;
                case 3:
                    phoneDirectory UpdatePhone = menu.UpdatePersonPhone();
                    method.update(UpdatePhone);
                    break;
                case 4:
                    System.out.println("Mời bạn nhập số điện thoại cần xóa");
                    try {
                        method.delete(Integer.parseInt(scanner.nextLine()));

                    }catch (Exception e){
                        break;
                    }
                    while (method.countDelete <= 0) {
                        try {
                            System.out.println("không tìm thấy số điện thoại cần xóa, vui lòng nhập lại");
                            method.delete(Integer.parseInt(scanner.nextLine()));
                        }catch (Exception e){
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Mời bạn nhập số điện thoại cần tìm kiếm");
                    if (scanner.nextLine().equals("")) {
                        break;
                    }
                    method.search(Integer.parseInt(scanner.nextLine()));

                    while (method.countSearch <= 0) {
                        System.out.println("không tìm thấy số điện thoại, vui lòng nhập lại");
                        method.search(Integer.parseInt(scanner.nextLine()));
                        if (scanner.nextLine().equals("")) {
                            break;
                        }
                    }

                    break;
                case 6:
                    break;
                case 7:
                    method.writeToFile();
                    break;
                case 8:
                    System.out.println("hẹn gặp lại");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
