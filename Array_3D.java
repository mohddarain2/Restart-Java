// public class Array_3D {
//     public static void main(String[] args) {
//         System.out.println("3D_array");
//         int[][][] a = { { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80, 90 } } };
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 for (int k = 0; k < a[i][j].length; k++) {
//                     System.out.print(a[i][j][k]+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }



public class Array_3D {

    public static void main(String []args){
         String[][][] names = {
                {
                        {"Aman", "Rahul", "Karan"},
                        {"Priya", "Neha"}
                },
                {
                        {"John", "David","Darain","Virat"},
                        {"Sam", "Tom", "Jerry"}
                }
        };


        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++){
                for(int k=0;k<names[i][j].length;k++){
                    System.out.print(names[i][j][k]+" ");
                }
                System.out.println();
            }
        }

    }
}