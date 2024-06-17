public class StuSample45 {
    public static void main(String[] args){
        //BASE_NOという定数を設定(finalがあるので1000で初期化した以降は違う値を代入できない)
        final int BASE_NO = 1000;
        //生徒情報(1)+1なので1001番
        Student45 stu1 = new Student45("菅原",BASE_NO+1);
        stu1.display();
        Student45 stu2 = new Student45("村山",BASE_NO+2);
        stu2.display();
       // BASE_NO = 2000; ⬅️このような記述をしてもコンパイル時点で「final変数BASE＿NOに値を代入することはできません、とエラーになる」
    }
}


//【初期化の時だけ、finalをつけた変数が値を入れられる。】