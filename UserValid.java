
import java.util.Scanner;

public class UserValid {

    String name;
    int age;

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        UserValid yo = new UserValid();
        System.out.println("enter the name of the candidate:");
        yo.name = z.next();
        System.out.println("enter the age of the candidate:");
        try {

            yo.age = z.nextInt();
            if (yo.age >= 18) {
                System.out.println("you are eligible for voting");

                
            }
            else{
                System.out.println("you are not eligible for voting");
            }
        } catch (Exception e) {
            System.out.println("invalid input.Please input a valid number");

        }
    }
}
