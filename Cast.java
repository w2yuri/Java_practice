class Cast {
    public static void main (String[] args) {
        // コマンドラインににゅうりょっくされた数値を文字列型からint型に変換して変数priceに代入
        int price = Integer.parseInt(args[0]);
        double rate = 0.08;  //消費税率：８％
        // 税込金額を格納する変数
        int amount;

        // int型にキャストしてamountに代入
        // (1 + rate)→今回は1.08→これに価格priceを掛け算し税込金額を計算
        amount = (int)(price * (1 + rate));
        System. out.println("税込金額" + amount + "円");
    }
}

// コマンドラインから価格の数値を受け取って、
// 消費税８％を加えた場合の税込金額を表示するプログラム。