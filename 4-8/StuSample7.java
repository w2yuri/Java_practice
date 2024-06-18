public class StuSample7{
  public static void main(String[] args){
    //Student7オブジェクト作成
    Student7 stu = new Student7("Mike");
    stu.displayEng();
    //Baseballオブジェクト作成
    Baseball bb = new Baseball();
    bb.displayEng();
  }
}

//【継承関係になくてもインターフェースを実行することでメソッドを統一して準備できる】

// 実行結果は以下のとおり
// [英語]
// NameMike
// [英語]
// catch ball
// seat knock
// batting practice