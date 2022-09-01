package hashmap_q2;

import java.util.*;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;

    public Product() {
    }

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
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

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products you want to add.");
        int num = sc.nextInt();

        Queue<Product> q = new PriorityQueue<>(new productPrice());

        for(int i=1; i<=num; i++){
            Product p = new Product();
            System.out.println("Enter product "+i+" id:");
            int id = sc.nextInt();
            p.setProductId(id);
            System.out.println("Enter product "+i+" name:");
            String name = sc.next();
            p.setProductName(name);
            System.out.println("Enter product "+i+" price:");
            int price = sc.nextInt();
            p.setProductPrice(price);
            q.add(new Product(p.getProductId(),p.getProductName(),p.getProductPrice()));
            System.out.println("----------------------------------");
        }
        Iterator<Product> itr = q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
class productPrice implements Comparator<Product>{
     @Override
     public int compare(Product o1, Product o2) {
         return o1.getProductPrice() < o2.getProductPrice() ? 1 : -1;
     }
 }
