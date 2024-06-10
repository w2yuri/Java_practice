class DriveCar {
    public static void main(String[] args){
        //Carクラスのオブジェクトc1を生成
        Car c1 = new Car();

        //c1のナンバーを2525に設定
        c1.setNo(2525);

        //c１の速度を30に設定
        c1.run(30);

        //c１のナンバー、速度を表示
        c1.display();

        //c１の速度を０に設定
        c1.stop();

        //c１のナンバー、速度を表示
        c1.display();
    }
}


// 文字列は＝”山田”、数字は(111)