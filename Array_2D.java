// public class Array_2D {

//     public  static void main(String[] args){
//         System.out.println("2D_array");
//         int[][] a={{10,20,30,40},{-1,-3,5},{90,200,100,500},{50,-50}};

//         for(int i=0;i<a.length;i++){    // 0<4 ||  1<4  ||  2<4   || 3<4 
//             for(int j=0;j<a[i].length;j++){ //0<4  1<4  2<4 3<4 ||  0<3  1<3 2<3 || 0<4 1<4 2<4 3<4 || 0<2  1<2
//                 System.out.print(a[i][j]+" ");  // 10,20,30,40 ||  -1  -3  5  || 90  200  100  500 || 50 -50
//             }
//             System.out.println();
//         }
//     }
// }

public class Array_2D {

    public static void main(String[] args)
    {
        System.out.println("2D_Array");

        String[][] Employe_Details = {
        {"Rahul", "25", "Male"},
        {"Priya", "22", "Female"},
        {"Aman",  "28", "Male"}};

        for(int i=0;i<Employe_Details.length;i++){
            for(int j=0;j<Employe_Details[i].length;j++){
                System.out.print(Employe_Details[i][j]+ " ");
            }
            System.out.println();
        }
    };
}