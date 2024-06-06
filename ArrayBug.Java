class ArrayBug {
    public static void main (String[] args) {
        String[] name = new String[5];
        // String型のnameという配列を要素数４と指定
        
        // 名前を代入
        name[0] = "桜井";
        name[1] = "田原";
        name[2] = "中川";
        name[3] = "鈴木";
        name[4] = "小林";

        // 名前を表示
        System. out.println(name[0]);
        System. out.println(name[1]);
        System. out.println(name[2]);
        System. out.println(name[3]);
        System. out.println(name[4]);
    }
}

// エラーメモ
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//         at ArrayBug.main(ArrayBug.java:9)

//         Exception(例外)
//          in thread "main" java.lang.
//          実行時のエラー：ArrayIndexOutOfBoundsException
//          indexが4で領域外(０から始まるので3までしか探せない): Index 4 out of bounds for length 4
//         at ArrayBug.main
//         エラーが起こっている箇所：(ArrayBug.java:9)

//         【解決法】
//         ①String[] name = new String[4];を[５にする]
//         ②[4]に関するデータを代入、表示ともに消す