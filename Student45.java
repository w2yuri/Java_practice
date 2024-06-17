public final class Student45 extends Person45 {
    private int stuNo;

    //Student用のコンストラクタ2つ(名前と学籍番号)
    public Student45(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }
    //displayメソッドのオーバーライド
    public void display(){
        super.display();
        System.out.println("学籍番号" + stuNo);
    }
}


//finalがあるため別のクラスでStudent45クラスを継承できない