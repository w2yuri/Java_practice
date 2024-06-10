class DriveCar2 {
    public static void main(String[] args){
        //引数なしのコントラクタ指定(Car2.javaの5行目)
        Car2 c1 = new Car2();
        c1.run(30);
        c1.display();

        //引数ありのコントラクタ指定(Car2.javaの8行目)
        Car2 c2 = new Car2(2525);
        c2.run(50);
        c2.display();
    }
}
