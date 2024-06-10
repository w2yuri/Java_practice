class Student2 {
    String name;
    int engScore;
    int mathScore;

    //setDataが７＾１４行目まであり、これがオーバーロード
    //名前を代入
    void setData(String n){
        name = n;
    }
    //名前と点数2つを受け取って代入
    void setData(String n, int e, int m){
        name = n;
        engScore = e;
        mathScore = m;
    }
    //英語と数学の変数をeとmのメンバ変数に代入
    void setScore(int e, int m){
        engScore = e;
        mathScore= m;
    }
    void display(){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
    }   
}
