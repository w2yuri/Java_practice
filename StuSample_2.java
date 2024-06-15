public class StuSample_2 {
    //実行用のためmainメソッドを持っている
    public static void main(String[] args){
        //サブクラスのStudentクラスのオブジェクトstuを作成
        Student stu = new Student();

        //そのstuを使って、スーパークラスのメソッドを呼び出し
        stu.setName("菅原");
        stu.display();

        //サブクラスのスーパーメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
