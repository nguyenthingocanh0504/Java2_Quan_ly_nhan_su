package DAO;

import connection.MyConnection;
import model.PhongBan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhongBanDAO {
    public List<PhongBan> getAll() {
        final String sql = "SELECT * FROM `PhongBan`";

        List<PhongBan> phongBanList = new ArrayList<>();

        try {
            Connection conn = MyConnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                PhongBan p = new PhongBan();
                p.setMaPB(rs.getInt("MaPB"));
                p.setTenPB(rs.getString("TenPB"));
                p.setSdtPB(rs.getString("SDTPB"));
                p.setDiaChi(rs.getString("DiaChi"));
                p.setTrangThai(rs.getInt("TrangThai"));

                phongBanList.add(p);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phongBanList;
    }
}
