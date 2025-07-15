public class BankAccount {
    int p;
    int t;
    int r;

    public BankAccount(int x,int y,int z){
        p=x;
        t=y;
        r=z;
    }

    public void showinterest(){
        int interest=p*t*r/100;
        System.out.println("the interest accumulated:"+interest);
    }
    public static void main(String[] args) {
        BankAccount ac=new BankAccount(1000, 1000, 1000);
        ac.showinterest();
        
    }
    
}
