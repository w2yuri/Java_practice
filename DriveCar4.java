class DriveCar4 {
    public static void main(String[] args){
        Car4 c1 = new Car4();
        Car4.display();
        Car4 c2 = new Car4(2525);
        Car4.display();
        Car4 c3 = new Car4(8888);
        Car4.display();
    }    
}

//static変数やstaticメソッドを呼び出すときは「クラス名.変数名、　　クラス名.メソッド名」にする