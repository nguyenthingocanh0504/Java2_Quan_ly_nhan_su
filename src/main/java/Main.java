import DAO.EmployeeDAO;
import DAO.PhongBanDAO;
import model.employees;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static void mainMenu() {
        System.out.println("--- QUẢN LÝ NHÂN SỰ ---");
        System.out.println("1. Hiện thị danh sách các phòng ban");
        System.out.println("2. Hiện thị danh sách toàn bộ nhân viên");
        System.out.println("3. Thêm mới thông tin 1 phòng ban");
        System.out.println("4. Cập nhật thông tin phòng ban (theo mã phòng ban)");
        System.out.println("5. Thêm mới thông tin 1 chức vụ");
        System.out.println("6. Cập nhật thông tin chức vụ");
        System.out.println("7. Xóa thông tin phòng ban (theo mã PB)");
        System.out.println("8. Thêm mới thông tin 1 Nhân Viên");
        System.out.println("9. Cập nhật thông tin 1 nhân viên (theo mã NV)");
        System.out.println("10. Xóa thông tin 1 nhân viên (theo mã NV)");
        System.out.println("11. Tìm kiếm thông tin 1 nhân viên ( theo mã, theo tên,...)");
        System.out.println("12. Thêm thông tin nhân viên vào 1 phòng ban");
        System.out.println("13. Xóa thông tin nhân viên ra khỏi phòng ban");
        System.out.println("14. Chuyển vị trí phòng ban cho 1 nhân viên");
        System.out.println("15. Tính thuế thu nhập cá nhân cho 1 nhân viên (theo mã NV)");
        System.out.println("16. Sắp xếp danh sách nhân viên theo mức lương thực lĩnh");
        System.out.println("17. Lấy ra những nhân viên có quê quán ở Hà Nội");
        System.out.println("18. Lấy ra 5 nhân viên có bậc lương cao nhất.");

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
