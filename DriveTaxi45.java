public class DriveTaxi45 {
    public static void main(String[] args){
        //サブクラスのオブジェクトのタクシー作成
        Taxi45 t1 = new Taxi45();
        //そのオブジェクトでそれぞれ呼び出し
        t1.setNo(2525);
        t1.start();
        t1.run();
        t1.display();
    }
}
