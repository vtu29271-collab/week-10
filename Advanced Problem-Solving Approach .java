import java.util.*;
class Product {
    int id;
    String name;
    double price;
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return id + " " + name + " " + price;
    }
}
class Order implements Comparable<Order> {
    int orderId;
    int priority;
    Order(int orderId, int priority) {
        this.orderId = orderId;
        this.priority = priority;
    }
    public int compareTo(Order o) {
        return o.priority - this.priority;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        HashMap<Integer, Product> productMap = new HashMap<>();
        products.add(new Product(101, "Laptop", 50000));
        products.add(new Product(102, "Phone", 25000));
        products.add(new Product(103, "Headphones", 2000));
        for (Product p : products) {
            productMap.put(p.id, p);
        }
        int searchId = 102;
        if (productMap.containsKey(searchId)) {
            System.out.println("Product Found: " + productMap.get(searchId));
        } else {
            System.out.println("Product Not Found");
        }
        PriorityQueue<Order> orders = new PriorityQueue<>();
        orders.add(new Order(1, 2));
        orders.add(new Order(2, 5));
        orders.add(new Order(3, 1));
        System.out.println("\nOrders by Priority:");
        while (!orders.isEmpty()) {
            Order o = orders.poll();
            System.out.println("Order ID: " + o.orderId +
                               ", Priority: " + o.priority);
        }
    }
}