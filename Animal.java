public class Animal {
    public static void main(String[] args){
        System.out.println("1");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
        Birds sp = new Birds();
        sp.fly(); 
    }

    public void eat(){
        System.out.println("Eating");
    }
    void run(){
        System.out.println("Running");
    }
}
 class Birds {
    public void fly(){
        System.out.println("Flying");
    }
    
}
