public class Student extends Person {   //サブクラスのため「extends Person」と記述
    //Studentクラス独自のメンバ変数としてstuNoという学籍番号
    private int stuNo;
    
    //学籍番号を設定するためのsetStuメソッド
    public void setStuNo(int s){
        stuNo = s;
    }
    //学籍番号を表示するためのメソッド
    public void displayStuNo(){
        System.out.println("学籍番号" + stuNo);
    }
}

//サブクラスのため「extends Person」と記述することで
// Personクラスが持っているメンバ変数とメソッドが使える