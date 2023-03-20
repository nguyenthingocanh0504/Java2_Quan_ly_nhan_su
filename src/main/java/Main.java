import DAO.EmployeeDAO;
import DAO.PhongBanDAO;
import model.employees;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static void mainMenu() {
        System.out.println("--- QUẢN LÝ NHÂN SỰ ---");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Danh sách nhân viên");
        System.out.println("3. Tìm kiếm nhân viên");
        System.out.println("4. Câp nhật nhân viên");
        System.out.println("5. Xóa nhân viên theo mã");
        System.out.println("6. Lọc ra top 5 lương cao nhất");
        System.out.println("7. Trung bình luong nhân viên nữ");
        System.out.println("8. Thoát");
    }
    public static void main(String[] args) {
        PhongBanDAO phongBanDAO=new PhongBanDAO();
        phongBanDAO.getAll();
        System.out.println(phongBanDAO);
//        EmployeeDAO employeeDAO=new EmployeeDAO();
//
//        List<employees> list=employeeDAO.getAll();
//
//        int option = -1;
//        Scanner in = new Scanner(System.in);
//        do {
//            mainMenu();
//            System.out.print("Nhập lựa chọn: ");
//            try {
//                option = Integer.parseInt(in.nextLine());
//            } catch (Exception e) {
//                System.out.println("Nhập sai định dạng!");
//                continue;
//            }
//            if (option < 1 || option > 8) {
//                System.out.println("Lựa chọn không hợp lệ");
//                continue;
//            }
//            // Xu ly cac TH thoa man
//            switch (option) {
//                case 1:
//                    employees e1= new employees();
//                    System.out.println("Nhap ho ten: ");
//                    String hoTen=in.nextLine();
//                    System.out.println("Nhap thanh pho: ");
//                    String city=in.nextLine();
//                    System.out.println("Nhap email: ");
//                    String email=in.nextLine();
//                    System.out.println("Nhap SDT: ");
//                    String phone=in.nextLine();
//                    System.out.println("Nhap gioi tinh: ");
//                    byte gender=in.nextByte();
//                    System.out.println("Nhap luong: ");
//                    int salary=in.nextInt();
//
//                    e1.setFullName(hoTen);
//                    e1.setCity(city);
//                    e1.setEmail(email);
//                    e1.setPhone(phone);
//                    e1.setGender(Byte.parseByte(String.valueOf(gender)));
//                    e1.setSalary(salary);
//
//                    employeeDAO.insert(e1);
//                    break;
//                case 2:
//
//                    break;
//                case 3:
//
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                case 8:
//                    break;
//            }
//
//        }
//        while (option != 8);
//        in.close();
    }
}
