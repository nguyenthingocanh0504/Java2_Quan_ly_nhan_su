package DAO;

import connection.MyConnection;
import model.employees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<employees> getAll() {
        List<employees> employeesList = new ArrayList<>();
        try {
            Connection conn = MyConnection.getConnection();
            String sql = "SELECT * FROM employees";
            Statement stmt= conn.createStatement();
            ResultSet rs= stmt.executeQuery(sql);

            while (rs.next()) {
                // Tao doi tuong Person rong
                employees p = new employees();
                p.setId(rs.getInt("id"));
                p.setFullName(rs.getString("full_name"));
                p.setCity(rs.getString("city"));
                p.setEmail(rs.getString("email"));
                p.setPhone(rs.getString("phone"));
                p.setGender(rs.getByte("gender"));
                p.setSalary(rs.getLong("salary"));

                employeesList.add(p);
            }
            // Buoc 4
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeesList;
    }
    public void insert(employees p) {
        // Bươc 1: Tạo kết nối

        // Bước 2: Chuẩn bị câu lệnh

        // Bước 3: Thực thi và xem kết quả

        // Bước 4: Đóng kết nối

        try {
            // Buoc 1
            Connection conn = MyConnection.getConnection();

            // Buoc 2
            String sql = String.format("INSERT INTO `employees` (`full_name`,`city`,`email`,`phone`,`gender`,`salary`) VALUES ('%s','%s','%s','%s','%d','%d') ",
                    p.getFullName(), p.getCity(), p.getEmail(), p.getPhone(),p.getGender(),p.getSalary()
            );

//            System.out.println(sql);

            // Buoc 3
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql);

            // Buoc 4:
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sort(employees p){
        try {
            // Buoc 1
            Connection conn = MyConnection.getConnection();

            // Buoc 2
            String sql = String.format("INSERT INTO `employees` (`full_name`,`city`,`email`,`phone`,`gender`,`salary`) VALUES ('%s','%s','%s','%s','%d','%d') ",
                    p.getFullName(), p.getCity(), p.getEmail(), p.getPhone(),p.getGender(),p.getSalary()
            );

//            System.out.println(sql);

            // Buoc 3
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(sql);

            // Buoc 4:
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
