class StuSample {
    public static void main(String[] args) {
        Student stu1 = new Student();  //Studentクラスのオブジェクトをstu1という変数で生成。

        stu1.name = "菅原";
        stu1.setScore(90, 80);

        stu1.display();  //student.javaで定義した内容を表示させる
        System.out.println("平均" + stu1.getAvg() + "点");
    }
}


//void main(String[] args) について
//戻り値はないのでvoidとキーワードが書かれている。String[] argsはコマンドラインからの引数なので文字列を受け取って処理をする。

//「呼び出し元に戻る」とは、呼び出しているメソッド名が戻ってきた値に置き換わること(例：stu1.getAvg()が計算され今回だとc８５.０となる)

//ターミナルではmainの「javac Stusample.java」でコンパイルし、実行も「java Stusample」