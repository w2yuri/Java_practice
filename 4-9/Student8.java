package pack;

//設計図クラスのStudent8クラス
public class Student8{
  //メンバ変数として名前を持っている
  private String name;

  //コンストラクタ
  public Student8(String name){
    this.name = name;
  }
  //ディスプレイメソッド
  public void display(){
    System.out.println("名前" + name);
  }
}

