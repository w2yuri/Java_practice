import pack.Student8;   //pack.クラス名(完全修飾名)

public class StuSample8{
  public static void main(String[] args){
    Student8 stu = new Student8("菅原");
    stu.display();
  }
}

//　　1行目の記述を行うことで、mainメソッドの中でStudent8のクラス名の記述のみでOKとなる


//javac -d . *.java　＝　(javac  *.java)適切な順番でコンパイルしてくださいと言う意味
//                    (-d)パッケージ化したクラスがあるときにディレクトリを自動作成してくれるオプション
//                    (.)この場所に作成の意味