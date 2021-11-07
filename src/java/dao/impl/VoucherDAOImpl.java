package dao.impl;

import dao.VoucherDAO;
import entity.Customer;
import entity.Product;
import entity.voucher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoucherDAOImpl extends BaseDAOImpl implements VoucherDAO{

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public int getLastVoucherID() {
        String sql = "SELECT TOP 1 CodeID\n"
                + "FROM [Vouchers]\n"
                + "ORDER BY CodeID DESC";
        try {
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }

        } catch (Exception e) {
            System.out.println("loi " + e.getMessage());
        }
        return 0;
    }

    @Override
        public int addVoucher(int codeID, int userID,String code, int existTime, int discount) {
        String sql = "INSERT INTO [ProjectLaptop].[dbo].[Vouchers] (CodeID,UserID,code,ExistTime,discount) VALUES (?,?,?,?,?)";
        try {

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1,codeID );
            stm.setInt(2, userID);
            stm.setString(3,code );
            stm.setInt(4, existTime);
            stm.setInt(5, discount);
            return stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("loi " + ex.getMessage());
        }
        return 0;
    }
    @Override
         public List<voucher> getAll() {
        String query = "select * from [Vouchers]";
        List<voucher> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new voucher(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getInt(4), rs.getInt(5)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    @Override
    public int DeleteVoucher(String id) {
        String sql = "delete [Vouchers] where CodeID =?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
    @Override
    public voucher getVoucherByID(String id) {
        String sql = "select * from [Vouchers] where CodeID=?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                voucher p = new voucher();
                p.setCodeID(rs.getInt(1));
                p.setUserID(rs.getInt(2));
                p.setCode(rs.getString(3));
                p.setExistTime(rs.getInt(4));
                p.setDiscount(rs.getInt(5));
                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    @Override
     public int updateVoucher(voucher p) {

        String sql = "UPDATE [dbo].[Vouchers]\n"
                + "   SET [UserID] =  ?,\n"
                + "      [Code] = ?,\n"
                + "      [ExistTime] = ?,\n"
                + "      [discount] = ?\n"
                + " WHERE [CodeID]= ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(5, p.getCodeID());
            st.setInt(1, p.getUserID());
            st.setString(2, p.getCode());
            st.setInt(3, p.getExistTime());
            st.setInt(4, p.getDiscount());
            
            return st.executeUpdate();
        } catch (Exception e) {
            System.out.println(" loi update"+e.getMessage());
        }
        return 0;
    }
    public static void main(String[] args) {
        VoucherDAOImpl a = new VoucherDAOImpl();
        List<voucher> v = a.getAll();
        for (voucher object : v) {
            System.out.println(object);
        }
//        System.out.println(a.addOrder(1, 1, 500));
//        System.out.println(a.addOrderDetail(1, 1, 1, 5));
    }
}
