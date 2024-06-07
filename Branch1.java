class Branch1 {
    public static void main(String[] args) {
        // コマンドラインに入力された価格をint型に変換する
        int price = Integer.parseInt(args[0]);
        double rate = 0.10;   //消費税率１０％()
        // int型の変数を2つ指定(discount(値引額)amount)
        int discount, amount;

        if (price >= 3000 ){  //割引額の設定
            discount = 300;   //true=3000円以上で300円の値引き
        }   else  {
            discount = 0;
        }

        // 税込金額を計算した結果が少数なので、int型にキャストする
        amount = (int)((price - discount) * (1 + rate));
        System. out.println("割引金額" + discount + "円");
        System. out.println("税込金額" + amount + "円");
    }
}

// コマンドラインから入力した価格に対して、消費税率8%の場合の税込金額を表示するプログラム。