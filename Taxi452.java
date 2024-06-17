public class Taxi452 extends Car452{
    private int price;

    public Taxi452(int no){
        this(no, 0);   //thisがTaxi453(no, 0)に置き換わるイメージ
    }
    public Taxi452(int no, int price){
        super(no);           //スーパークラスのコンストラクタ呼び出し。superが(Car452のno)として置き換わるイメージ
        this.price = price;
    }
    public void start(){
        price = 420;
    }
    public void run(){
        price = price + 80;
    }
    public void display(){
        super.display();
        System.out.println("料金は" + price + "円です");
    }
}
