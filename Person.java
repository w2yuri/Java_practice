public class Person {
    // メンバ変数：name
    private String name;

    //メソッド① 　名前を設定するsetNameメソッド
    public void setName(String n){
        name = n;
    }
    //メソッド② 　名前を表示するdisplayメソッド
    public void display(){
        System.out.println("名前" + name);
    }
}

// 設計図クラス(スーパークラスのPerson)