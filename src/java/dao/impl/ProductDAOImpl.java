package dao.impl;

import dao.ProductDAO;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl extends BaseDAOImpl implements ProductDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<Product> getAll() {
        String query = "select * from [Product]";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4), rs.getInt(5), rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<Product> getAllCate() {
        String query = "select * from [Category]";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getString(2)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public int getLastID() {
        String sql = "SELECT TOP 1 productid\n"
                + "FROM [Product]\n"
                + "ORDER BY productid DESC";
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
    public List<Product> getProductByCateID(String txt) {
        String query = "select * from [Product] where cateID= ?";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4), rs.getInt(5), rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<Product> getProductByPrice(String txt) {
        String query = "select * from [Product] where price= ?";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4), rs.getInt(5), rs.getString(6)));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public ArrayList<Product> getProductByName(String txt) {
        String query = "select * from [Product] where name LIKE '%'+?+'%'";
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(4), rs.getInt(5), rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public int DeleteProduct(String id) {
        String query = "delete [Product] where productid =?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }

    @Override
    public Product getProductByID(String id) {
        String sql = "select * from [Product] where productid=?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setImage(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setCateID(rs.getInt(5));
                p.setDetail(rs.getString(6));
                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public int addProduct(Product p) {
        String sql = "INSERT INTO [dbo].[Product]\n"
                + "           ([productid]\n"
                + "           ,[name]\n"
                + "           ,[image]\n"
                + "           ,[price]\n"
                + "           ,[cateID]\n"
                + "           ,[detail])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)\n";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, p.getId());
            st.setString(2, p.getName());
            System.out.println(p.getName());
            st.setString(3, p.getImage());
            System.out.println(p.getImage());
            st.setDouble(4, p.getPrice());
            System.out.println(p.getPrice());
            st.setInt(5, p.getCateID());
            st.setString(6, p.getDetail());
            System.out.println(p.getDetail());
            int r = st.executeUpdate();
            return r;

        } catch (Exception e) {
        }
        return 0;
    }

    @Override
    public int updateProduct(Product p) {

        String sql = "UPDATE [dbo].[Product]\n"
                + "   SET [name] =  ?,\n"
                + "      [image] = ?,\n"
                + "      [price] = ?, \n"
                + "      [cateID] = ?,\n"
                + "      [detail] = ?\n"
                + " WHERE [productid]= ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getName());
            System.out.println(p.getName());
            st.setString(2, p.getImage());
            System.out.println(p.getImage());
            st.setDouble(3, (p.getPrice()));
            System.out.println((p.getPrice()));
            st.setInt(4, p.getCateID());
            st.setString(5, p.getDetail());
            System.out.println(p.getDetail());
            st.setInt(6, p.getId());
            System.out.println(p.getId());
            System.out.println("-----------");
            return st.executeUpdate();
        } catch (Exception e) {
            System.out.println(" loi update" + e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        ProductDAOImpl a = new ProductDAOImpl();

//        System.out.println(a.updateProduct(new Product(5, "Laptop MSI Prestige 15 A10SC-222VN ",
//                "https://hanoicomputercdn.com/media/product/48771_msi_prestige_15_a10sc__6_.jpg",
//                300, 1, "giá")));
        List<Product> li = a.getAll();
        System.out.println(li.get(1).getDetail());
    }
}
