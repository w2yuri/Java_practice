public class Student_4_2 extends Person_4_2{
        //Studentクラス独自のメンバ変数としてstuNoという学籍番号
        private int stuNo;
        
        //学籍番号を設定するためのsetStuメソッド
        public void setStuNo(int s){
            stuNo = s;
        }
        //学籍番号と名前を表示するためのメソッド
        public void display(){
            System.out.println("名前" + getName());//オーバーライド(Personでは名前のみだが、Studentでは名前だけではなく学籍番号を表示するという上書き内容)
            System.out.println("学籍番号" + stuNo);
        }
    }
    
    //サブクラスのため「extends Person」と記述することで
    // Personクラスが持っているメンバ変数とメソッドが使える

    //⭐️11行目のnameはPersonのPrivateなので使えないのでgetNameメソッドで呼び出している