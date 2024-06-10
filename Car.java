class Car {
    //メンバ変数(データ型：変数名)
    int no;
    int speed;

    //メソッド
    void setNo(int n){  //戻り値の型(void)メソッド名(setNo)引数(int n)
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

//オーバーロード（同じメソッド名で引数が違うものを同じクラスの中に複数定義）