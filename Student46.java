public class Student46 extends Person46 {
    //メンバ変数(stuNo)
    private int stuNo;

    //コンストラクタ
    public Student46(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }
    //オーバーライド
    public void display(){
        super.display();
        System.out.println("学籍番号" + stuNo);
    }
    //サブクラス独自のメソッド
    public void chgstuNo(int stuNo){
        this.stuNo = stuNo;
    }
}
