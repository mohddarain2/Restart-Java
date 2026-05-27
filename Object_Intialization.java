// public class Object_Intialization {
// //     In Java, there are 3 main types (ways) to initialize an object:
// // Object initialization means giving values to the object's variables after creating the object.

// // 1. By Reference Variable
// // 2. By Method
// // 3. By Constructor
// //--------------------------------------------------------------------------------------------

//         // 1 . By Reference Variable
//         String color;
//         int age ;
//         public static void main(String[] args){
//             Object_Intialization buzo = new Object_Intialization();
//             buzo.color="White";
//             buzo.age=21;
//             System.out.println(buzo.color+" "+ buzo.age);
//         }
//     }
//----------------------------------------------------------------------------------------------
// 2. By Method

public class Object_Intialization {
    String color;
    int age;

    void initObj(String c, int a) {
        color = c;
        age = a;
    }

    void dispay() {
        System.out.println(color+" "+ age);
    }

    public static void main(String[] args) {
        Object_Intialization buzo = new Object_Intialization();
        buzo.initObj("black", 10  );
        buzo.dispay();
    }

}
