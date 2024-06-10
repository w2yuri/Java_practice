class Student4 {
    String name;
    int counter = 0;

    //コンストラクタ
    Student4(String n){
        name = n;
        //インクリメント(変数の値を１増やす)
        counter++;
        System.out.println(name + "さんをインスタンス化しました");
    }
    //カウンターの変数を画面に表示するメソッド
    void display(){
        System.out.println(counter + "人です");
    }
}
