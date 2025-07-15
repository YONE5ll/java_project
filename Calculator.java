
//create a baisc conosle based calculator app that takes user inputs,performs calculations and disaplys results//
import java.util.Scanner;;

public class Calculator {
    int x;
    int y;
    int o;

    public void addition(int x,int y){
        int add = x + y;
                System.out.println("addition:" + add);
    }
    public void subtraction(int x,int y){
        int sub = x-y;
                System.out.println("addition:" + sub);
    }
    public void multiplicaton(int x,int y){
        int mul = x * y;
                System.out.println("addition:" + mul);
    }
    public void division(int x,int y){
        int div = x /y;
                System.out.println("addition:" + div);
    }

    public static void main(String[] args) {
        Calculator newcalc = new Calculator();
        Scanner n = new Scanner(System.in);

        System.out.println("enter the first number ");

        newcalc.x = n.nextInt();

        System.out.println("enter the first number ");

        newcalc.y = n.nextInt();

        System.out.println(
                "press 1 for additon\n press 2 for subtraction\n press 3 for multiplicaton\n press 4 for division\n");
        newcalc.o = n.nextInt();

        switch (newcalc.o) {
            case 1:
               newcalc.addition(newcalc.x,newcalc.y);
                break;

            case 2:
               newcalc.subtraction(newcalc.x,newcalc.y);
                break;
            case 3:
                newcalc.division(newcalc.x,newcalc.y);
                break;
            case 4:
               newcalc.multiplicaton(newcalc.x,newcalc.y);
                break;

            default:
                System.out.println("invalid input");
                break;
        }

        n.close();

    }
}