package entity;

public class Product {

    private int id;
    private String name;
    private String image;
    private float price;
    private int CateID;
    private int amount;
    String detail;
    private String cateName;

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Product(int CateID, String cateName) {
        this.CateID = CateID;
        this.cateName = cateName;
    }
    
    public String getDetail() {
        return detail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public Product(int id, String name,
            String image, float price,
            int cateid,String detail) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.CateID = cateid;
        this.detail = detail;
    }

    public Product() {
    }



    public Product(int id, String name,
            String image, float price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }




    public Product(int id, String name, String image, float price, int cateid) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.CateID = cateid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCateID() {
        return CateID;
    }

    public void setCateID(int CateID) {
        this.CateID = CateID;
    }



}
