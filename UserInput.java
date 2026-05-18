import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Age ");
        int age = sc.nextInt();
         sc.nextLine();

        System.out.println("Please Enter Name");
        String Name = sc.nextLine();

        System.out.println("Please Enter Gender");
        String Gender = sc.nextLine();

        System.out.println("Please Enter Mobile number");
        long Mobile_Number = sc.nextLong();

        System.out.println("Please enter Gender");
        char G = sc.next().charAt(0);

        System.out.println("-----------------------------------");


        System.out.println("Age: "+ age);
        System.out.println("Name: " + Name);
        System.out.println("Gender: "+ Gender);
        System.out.println("Mobile Number: "+ Mobile_Number);
        System.err.println("G : " + G);



    }
}