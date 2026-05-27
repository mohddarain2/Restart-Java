import java.util.Scanner;

public class While_loop_Print_Array {
    public static void main(StringExamples[] args) {
        // int[] a = {1,2,3,4,5};
        // int i=0;
        // while(i<a.length){
        // System.out.print(a[i]+" ");
        // i++;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Array element Count");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Please Enter Element of array: ");
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // System.out.println("Arrys Here : ");
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }

        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Arrays Here : ");
        int j = 0; //
        while (j < arr.length) { // 0<5
            System.out.print(arr[j]+ " "); // arr[0]
            j++;
        }
         sc.close();
    }
}
