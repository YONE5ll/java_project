public class InventorySystem {
    public static void main(String[] args) {
        Product s=new Product(1234, "yasa", 10000, "medicine");
        s.showProduct();
        Order u= new Order(20, 123);
        u.showOrder();
        Customer i=new Customer("Ram","Kathmandu");
        i.showCustomer();
    }

}
