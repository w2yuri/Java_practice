public class Taxi45 extends Car45 {
    private int price;

    public void start(){
        price = 420;
    }
    public void run(){
        price = price + 80;
    }
    //メソッドのオーバーライド(引き継ぐだけでなく親クラスと同じメソッド名を子クラスで再定義)
    public void display(){
        //上書きしている内容
        System.out.println("料金は" + price + "円です");
    }
}

//extends 引き継ぎたいクラス(例Car45)とすることでメソッドが全て使える
//オーバーライドでは「戻り値の型(void)」「メソッド名(display)」「引数の情報()」を全てスーパークラスと合わせる

//スーパークラス（superclass）とは、オブジェクト指向プログラミングにおいて、あるクラスの仕様を継承して新しいクラスを作成する際に、
//元となるクラスのこと。 新しいクラスのことは「サブクラス」（subclass）、「派生クラス」（derived class）、「子クラス」（child class）などと呼ぶ。