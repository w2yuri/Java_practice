public class Student43 extends Person43{
    private int stuNo;

    //コンストラクタ①名前だけ引数として受け取るコンストラクタ
    public Student43(String name){
        //this~＝引数の呼び出し(=Student43を指す)
        this(name, 999);
    }
    //コンストラクタ②名前と学籍番号を引数として受け取るコンストラクタ
    public Student43(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }
    //スーパークラスのdisplayをオーバーライドしている
    public void display(){
        super.display();
        System.out.println("学籍番号:" + stuNo);
    }
}
