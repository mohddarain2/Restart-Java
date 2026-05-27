public class Anonymous_array {

    public static void main(StringExamples[] args){
        // Anonymous_array.sum(new int[]{10,20,30} );
        Anonymous_array.sum(new int[]{10,20,30,40});

    }
    // static void  sum(int[] count){
    //     int total =0;  //  10 || 30 || 60
    //     for(int i=0;i<count.length;i++){ // 0<3 // 1<3 // 2<3 // 3<3
    //         total+=count[i];  // 0+10  10+count[1]=>10+20 // 30+count[2]=>30+30
    //     }
    //     System.out.println(total);
    // }
// ----------------------------------------------For Each Loop---------------------------------
    static void sum(int[] arr){
        int total =0 ;
        for(int i : arr){
            total=total+i;
        }
        System.out.println("Sum is "+ total);
    }
}