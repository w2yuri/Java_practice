public abstract class Vehicle {
    //メンバ変数定義
    protected int crewNum;
    //抽象メソッド(メソッドの中身の処理を書かないこと)
    public abstract void showCrewNum();
}


//これは抽象クラス（抽象メソッドを持つクラス）

//protectedを今までprvateで指定することが多かったがこのクラスの中のみのアクセスになってしまう。
//protected(自分のクラスとサブクラスにアクセスを許可)