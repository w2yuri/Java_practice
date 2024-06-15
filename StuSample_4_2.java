public class StuSample_4_2 {
    // 実行用のためmainメソッドを持っている
    public static void main(String[] args) {
        // サブクラスのStudentクラスのオブジェクトstuを作成
        Student_4_2 stu = new Student_4_2();

        // そのstuを使って、スーパークラスのメソッドを呼び出し
        stu.setName("菅原");
        stu.setStuNo(1);
        stu.display(); // 学籍番号も表示するメソッドを呼び出す
    }
}

//エラーメモ：StudentのdisplayにsetNoのみの表示にしてしまっていたため学籍番号が出ていなかった