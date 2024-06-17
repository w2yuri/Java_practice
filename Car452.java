public class Car452 {
    private int no;

    //コンストラクタ(オブジェクトの初期化のために使われる)
    public Car452(int no){
        //thisキーワードがつくとこのnoは「このオブジェクトの〜」という意味になり
        //2行目のnoを表しているのがこのthis.no(左側)の記述
        this.no = no;//右側のnoは5行目の(int no)のno

        //引数として入ってきた自動車のno(int no)をthis noに代入＝つまりメンバ変数に設定する
    }
    public void display(){
        System.out.println("ナンバーは" + no + "です");
    }
}
