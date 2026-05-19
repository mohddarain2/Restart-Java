import java.util.Scanner;

public class Array_user_input {
    public static void main(String args[]) {
        // System.out.println("Please Enter Total elements of array");
        // Scanner sc = new Scanner(System.in);
        // int TotalInput = sc.nextInt();
        // int inputArray[] = new int[TotalInput];
        // System.out.println("Please Enter array Element value");
        // for (int i = 0; i < TotalInput; i++) {
        // inputArray[i] = sc.nextInt();
        // }
        // System.out.println("Arrays elements are here : ");
        // for (int i = 0; i < TotalInput; i++) {
        // System.out.println(inputArray[i]);
        // }

        System.out.println("Please enter Element Count");
        Scanner sc = new Scanner(System.in);
        int TotalInput = sc.nextInt();
        sc.nextLine();
        String course_Name[] = new String[TotalInput];

        System.out.println("Please enter Array of element");
        for (int i = 0; i < TotalInput; i++) { // 0<5 // 1<5 // 2<5 3<5 4<5
            course_Name[i] = sc.nextLine();// java php ruby js
        }

        System.out.println("Arrays element are Here: ");
        for (int i = 0; i < TotalInput; i++) {
            System.out.println(course_Name[i]);
        }
    }
}
