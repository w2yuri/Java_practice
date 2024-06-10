public class Car2 {
        //メンバ変数(データ型：変数名)
        int no;
        int speed;
    
        //メソッド
        Car2 (){  //
            no = 0;
        }

        Car2 (int n){  //
            no = n;
        }
    
        void run(int s){
            speed = s;
        }
    
        void brake(){
            speed = 0;
        }
    
        void brake(int s){
            speed = speed - s;
        }
    
        void display(){
            System.out.println("ナンバー" + no + "の速度は" + speed + "です");
        }
    
}

  //コンストラクタ（オブジェクトの初期化）
//   ・名前はクラス名に合わせる（Car2）,戻り値を持たない
