public class Product  {
    private int id;
    private String name;
    private int price;
    private String type;

    public Product(int x,String y, int z,String v){
        id=x;
        name=y;
        price=z;
        type=v;
    }
    public void showProduct(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("type:"+type);
    }
}
