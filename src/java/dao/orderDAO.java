package dao;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class orderDAO extends BaseDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int getLastOrderID() {
        String sql = "SELECT TOP 1 orderID\n"
                + "FROM HE141231_DUPI_Order\n"
                + "ORDER BY orderID DESC";
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

    public int getLastOrderDetailID() {
        String sql = "SELECT TOP 1 orderDetailID\n"
                + "FROM HE141231_DUPI_OrderDetail\n"
                + "ORDER BY orderDetailID DESC";
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

    public int addOrder(int orderID, int Userid, float total) {
        String sql = "INSERT INTO [SE1435_PRJ321_DUPIHE141231].[dbo].[HE141231_DUPI_Order] (orderID,customerID,date, totalPrice) VALUES (?,?,?,?)";
        try {
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, orderID);
            stm.setInt(2, Userid);
            stm.setDate(3, date);
            stm.setFloat(4, total);
            return stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("loi " + ex.getMessage());
        }
        return 0;
    }
        public int addOrderDetail(int orderDetailID, int orderID, int ProductID, int quantity) {
        String sql = "INSERT INTO [SE1435_PRJ321_DUPIHE141231].[dbo].[HE141231_DUPI_OrderDetail] (orderDetailID,orderID,productID, quantity) VALUES (?,?,?,?)";
        try {
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, orderDetailID);
            stm.setInt(2, orderID);
            stm.setInt(3, ProductID);
            stm.setInt(4, quantity);
            return stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("loi " + ex.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        orderDAO a = new orderDAO();
//        System.out.println(a.addOrder(1, 1, 500));
//        System.out.println(a.addOrderDetail(1, 1, 1, 5));
    }
}
