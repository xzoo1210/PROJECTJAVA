/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Admin
 */
public interface OrderDAO {

    public int getLastOrderID();

    public int getLastOrderDetailID();

    public int addOrder(int orderID, int Userid, float total);

    public int addOrderDetail(int orderDetailID, int orderID, int ProductID, int quantity);
}
