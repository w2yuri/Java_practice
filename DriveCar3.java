public class DriveCar3 {
    public static void main(String[] args){
        //
        Car3 c1 = new Car3();
        c1.run(30);
        c1.display();

        //引数ありのコントラクタ指定(Car2.javaの8行目)
        Car3 c2 = new Car3(2525);
        c2.run(50);
        c2.display();
    }
}
