public class Order {
    private int quantity;
    private int orderid;

    public Order(int x,int y){
       quantity=x;
       orderid=y;
    }

    public void showOrder(){
        System.out.println("Order quantity:"+quantity);
        System.out.println("Order id:"+orderid);

    }
    
}
