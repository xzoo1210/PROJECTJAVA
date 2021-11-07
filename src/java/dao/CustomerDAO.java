/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Customer;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface CustomerDAO {
    public Customer checkLogin(String username, String password);
    public Customer getUserByID(String txt);
    public int registerUser(int id, String uname, String pass, int authority);
    public int addInforUser(int inforID,int Userid, String name, String address, String phone);
    public int getLastID();
    public int getLastInforUserID();
    public int DeleteUser(String id);
    public int updateUser(Customer p);
    public List<Customer> getAllUser();
}
