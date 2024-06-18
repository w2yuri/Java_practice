public class Student7 implements Englishable{
  private String name;

  //コンストラクタ用意
  public Student7(String name){
    this.name = name;
  }
  //名前表記
  public void display(){
    System.out.println("名前" + name);
  }
  //英語表記
  public void displayEng(){
    System.out.println(Englishable.LANGUAGE);//Englishable.javaを読み込んで表示
    System.out.println("Name" + name);
  }
}

//Englishableを実装したクラス(StudentとBasebollクラス)
//上記2つのクラスをインスタンス化して実行しているのがStuSample

//implements Englishable(インターフェース名)をすることで
//Englishableに含まれているimplements Englishable.javaのvoid displaEngを実行しなければならない。