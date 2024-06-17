public class Taxi453 extends Car453 {
    Taxi453(){
        this(9999);
        System.out.println("Taxi453()");
    }
    Taxi453(int no){
        super(no);
        System.out.println("Taxi453(int no)");
    }
    Taxi453(String no){
        System.out.println("Taxi453(string no)");
    }
}
