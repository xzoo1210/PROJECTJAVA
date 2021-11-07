/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CustomerDAO;
import entity.Customer;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell Inc
 */
public class CustomerDAOImpl extends BaseDAOImpl implements CustomerDAO{

    @Override
    public Customer checkLogin(String username, String password) {
        Customer c = null;
        String sql = "SELECT *"
                + "  FROM [ProjectLaptop].[dbo].[User]\n"
                + "  where username = ? and [password] = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c = new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3), rs.getInt(4)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    @Override
    public Customer getUserByID(String txt) {
        String query = "select * from [User] where UserID= ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, txt);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(2), rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    @Override
    public int registerUser(int id, String uname, String pass, int authority) {
        String sql = "INSERT INTO [ProjectLaptop].[dbo].[User] (UserID,UserName, Password,authority) VALUES (?,?,?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setString(2, uname);
            stm.setString(3, pass);
            stm.setInt(4, authority);
            return stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("loi " + ex.getMessage());
        }
        return 0;
    }
    @Override
    public int addInforUser(int inforID,int Userid, String name, String address, String phone) {
        String sql = "INSERT INTO [ProjectLaptop].[dbo].[InforUser] (inforID,userID,fullName, address,phoneNumber) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, inforID);
            stm.setInt(2, Userid);
            stm.setString(3, name);
            stm.setString(4, address);
            stm.setString(5, phone);
            return stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("loi " + ex.getMessage());
        }
        return 0;
    }
    @Override
    public int getLastID() {
        String sql = "SELECT TOP 1 UserID\n"
                + "FROM [User]\n"
                + "ORDER BY UserID DESC";
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
        public int getLastInforUserID() {
        String sql = "SELECT TOP 1 inforID\n"
                + "FROM [InforUser]\n"
                + "ORDER BY inforID DESC";
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
    public int DeleteUser(String id) {
        String sql = "delete [User] where UserID =?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }
    @Override
     public int updateUser(Customer p) {

        String sql = "UPDATE [dbo].[User]\n"
                + "   SET [UserName] =  ?,\n"
                + "      [Password] = ?,\n"
                + "      [authority] = ?\n"
                + " WHERE [UserID]= ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getUsername());
            st.setString(2, p.getPassword());
            st.setInt(3, p.getAuthority());
            st.setInt(4, p.getId());
            
            return st.executeUpdate();
        } catch (Exception e) {
            System.out.println(" loi update"+e.getMessage());
        }
        return 0;
    }
    @Override
        public List<Customer> getAllUser() {
        String query = "select * from [User]";
        List<Customer> list = new ArrayList<>();
        try {
            
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        CustomerDAOImpl d = new CustomerDAOImpl();
//        System.out.println(d.registerUser(5, "1", "1", 1));
//        System.out.println(d.addInforUser(1, 1, "Pham Ich DU", "BAC NINH", "0369662341"));
        System.out.println(d.getLastID() + "");
    }
}
