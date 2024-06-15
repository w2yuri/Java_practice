class Student_first{
    //メンバ変数(属性。変数の定義)クラス定義の直下に記述！
    String name;
    int engScore;
    int mathScore;

    //メソッド（操作を実現するため）
    void display(){  //引数を何も受け取らないメソッド
        System.out.println(name + "さん");  //nameは3行目のname情報を取得している
        System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
    }
    void setScore(int eng, int math){  //メソッドの呼び出し元から、engとmathで2つの値を正数で受け取って、13~14行目でメンバ変数に代入している。
        engScore = eng;
        mathScore = math;
    }
    double getAvg(){
        double avg = (engScore + mathScore) / 2.0;  //メンバ変数の英語と数学の得点を足して÷2.0をして平均値を求めて、変数avgに代入している。
        return avg;                                 //それをreturnして平均値が呼び出し元に戻る処理。
    }
}

//1~20行目までstudentクラス
//なお十二行目の(int eng, int math)はsetScoreでしか使えないように{}内でしか使えない。
//メソッドの有効範囲とメンバ変数の有効範囲に注意！

//またこれだけではmainがないので実行できない。
//別の実行用クラスを使って、そのmainクラスの中からこの設計図を元にオブジェクトを作って利用する必要がある。