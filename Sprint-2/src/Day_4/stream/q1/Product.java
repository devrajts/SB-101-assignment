package Day_4.stream.q1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product {
    private int productId;
    private String productName;
    private int price;
    private int quantity;

    public Product(){

    }

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Demo{
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Book",20,12));
        list.add(new Product(2,"Pen",5,20));
        list.add(new Product(3,"bag",1000,1));
        list.add(new Product(4,"cloth",2000,4));
        list.add(new Product(5,"shoe",1500,1));


        System.out.println("Original List");
        System.out.println("---------------------------------------------");

        for(Product p : list){
            System.out.println("Product Id : "+p.getProductId());
            System.out.println("Product Name : "+p.getProductName());
            System.out.println("Product Price : "+p.getPrice());
            System.out.println("Product Quantity : "+p.getQuantity());
            System.out.println("-------------------------------------------");
        }

        List<Product> productsWithMoreThan10Quantity = list
                .stream()
                .filter(Product -> Product.getQuantity() > 10)
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println("Filtered List");
        System.out.println("-------------------------------------------");

        for(Product s : productsWithMoreThan10Quantity){
            System.out.println("Product Id : "+s.getProductId());
            System.out.println("Product Name : "+s.getProductName());
            System.out.println("Product Price : "+s.getPrice());
            System.out.println("Product Quantity : "+s.getQuantity());
            System.out.println("--------------------------------------------");
        }
    }
}
