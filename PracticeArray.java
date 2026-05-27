import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {

        // int[][] arr = { { 2, 3, 3, 4 }, { 5, 6, 7, 8 }, { -5, -4, 0 } };

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Arrays of Rows ");
        int n = sc.nextInt();

        System.out.println("Please enter Arrays of Columns ");
        int m = sc.nextInt();

        int[][] employe_Details = new int[n][m];
        System.out.println("Please enter Array element");

        for (int i = 0; i < employe_Details.length; i++) {
            for (int j = 0; j < employe_Details[i].length; j++) {
                employe_Details[i][j]=sc.nextInt();
            }
           
        }

        System.out.println("Arrays Print Here:");
        for (int i = 0; i < employe_Details.length; i++) {
            for (int j = 0; j < employe_Details[i].length; j++) {
                System.out.print(employe_Details[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
