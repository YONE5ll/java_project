public class Customer {
 private String name;
private String address;

public Customer(String x, String y){
    name=x;
    address=y;
}

public void showCustomer(){
    System.out.println("Customer name:"+name);
    System.out.println("Customer address:"+address);
}
    
}
