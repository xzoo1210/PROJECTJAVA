/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductDAO {

    public List<Product> getAll();

    public List<Product> getAllCate();

    public int getLastID();

    public List<Product> getProductByCateID(String txt);

    public List<Product> getProductByPrice(String txt);

    public ArrayList<Product> getProductByName(String txt);

    public int DeleteProduct(String id);

    public Product getProductByID(String id);

    public int addProduct(Product p);

    public int updateProduct(Product p);
}
