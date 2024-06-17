public class StuSample46 {
    public static void main(String[] args){
        //サブクラスStudent46クラスのオブジェクトをstu1として作成(図で言う青の部分)
        Student46 stu1 = new Student46("菅原", 1);
        //アドレスの値をスーパークラスのpsnというオブジェクトに代入
        Person46 psn = stu1;//サブクラスからスーパーに代入しているので自動で型変換される
        psn.display();//psnは図で言う黒の部分
        //  psn.chgstuNo(1001);　　はコンパイルエラーになる

        /*　　補足：instanceofキーワード
         * オブジェクトのクラスを特定する(調べられる)
         * 【　対象オブジェクト　instanceof クラス名　】 */
        if (psn instanceof Student46){       //変数「psn」のオブジェクトが「Student46」のインスタンスですか？と聞く記述になる
            Student46 stu2 = (Student46)psn;//キャストしてstuに代入(キャストしないとエラーになる)
            //それぞれ呼び出す
            stu2.chgstuNo(1001);
            stu2.display();
        }
    }
}


//実行すると名前菅原下記の結果になる
// 学籍番号1
// 名前菅原
// 学籍番号1001