class ScoreArray {
    public static void main (String[] args) {
        // 配列の生成
        int[] data = new int[4];

        // 配列に値を代入
        data[0] = 90;
        data[1] = 80;
        data[2] = 100;
        data[3] = 90;

        // 値を代入
        System. out.println("1人目は" + data[0] + "点");
        System. out.println("2人目は" + data[1] + "点");
        System. out.println("3人目は" + data[2] + "点");
        System. out.println("4人目は" + data[3] + "点");
    }
}

// エラーメモ
// シンボル:   変数 date
// 場所: クラス ScoreArray
// ScoreArray.java:16: エラー: シンボルを見つけられません
//       System. out.println("4人目は" + date[3] + "点");
//       原因：「data」と「date」が混在していた