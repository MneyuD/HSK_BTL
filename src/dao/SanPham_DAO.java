package dao;

import connect.ConnectDB;
import entity.Enum_KichCo;
import entity.LoaiSP;
import entity.SanPham;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class SanPham_DAO {
    public SanPham_DAO() {

    }

    public ArrayList<SanPham> getAllProduct() {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement("SELECT * FROM SanPham");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                Double donGia = rs.getDouble("donGia");
                LocalDate ngayHetHan = rs.getDate("ngayHetHan").toLocalDate();
                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                Double thue = rs.getDouble("thue");
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"));

                SanPham sp = new SanPham(maSP, tenSP, ngayHetHan, donGia, thue, kichCo, loaiSp);
                dsSP.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }


}
