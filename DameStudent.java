public class DameStudent extends Student45{
    DameStudent(String name, int syuNo){
        super(name, stuNo);
    }
}


//finalがあるため別のクラスでStudent45クラスを継承できない
//これをコンパイルしても下記のようなエラーになる
// javac DameStudent.java
// DameStudent.java:1: エラー: final Student45からは継承できません
// public class DameStudent extends Student45{
//                                  ^
// DameStudent.java:3: エラー: stuNoはStudent45でprivateアクセスされます
//         super(name, stuNo);
//                     ^
// エラー2個