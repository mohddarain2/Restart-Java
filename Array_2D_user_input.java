import java.util.Scanner;

public class Array_2D_user_input {
    public static void main(String[] args) {
        //System.out.println("Please enter Array of element");

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] a = new int[n];
        // System.out.println("Please enter Array element");
        // for(int i=0;i<a.length;i++){
        // a[i] = sc.nextInt();
        // }
        // System.out.println("Arrays here");
        // for(int i=0;i<a.length;i++){
        // System.out.println(a[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Arrays of Rows ");
        int n = sc.nextInt();

        System.out.println("Please enter Arrays of Columns ");
        int m = sc.nextInt();

        int[][] employe_Details = new int[n][m];
        System.out.println("Please enter Array element");
        // Input elements
        for (int i = 0; i < n; i++) {   // n=3     0<3
            for (int j = 0; j < m; j++) { // m=3   0<3
                employe_Details[i][j] = sc.nextInt();// 
            }
        }

        // Display elements
        System.out.println("Employee Details Array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(employe_Details[i][j] + " ");
            }
            System.out.println();
        }
    }
}
