package Day_2.q5;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private int price;

    public Product(){

    }

    public Product(int productId, String productName, int quantity, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Demo{
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1,"Book",2,20));
        list.add(new Product(2,"Pen",5,10));
        list.add(new Product(3,"Bag",1,500));
        list.add(new Product(4,"Shoes",2,1000));
        list.add(new Product(5,"Cloths",5,700));

        list.sort((p1,p2) -> p1.getPrice()> p2.getPrice() ? -1 : 1);

        for(Product p : list){
            System.out.println("Product id : "+p.getProductId());
            System.out.println("Product name : "+p.getProductName());
            System.out.println("Product quantity : "+p.getQuantity());
            System.out.println("Product price : "+p.getPrice());
            System.out.println("-----------------------------------------");
        }
    }
}
