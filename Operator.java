class Operator {
    public static void main (String[] args) {
        // コマンドラインから入力したデータ(文字列型)を
        // int型に変換する
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System. out.println("a = " + a + ", b = " + b);
        System. out.println("a + b = " + (a + b));
        System. out.println("a - b = " + (a - b));
        System. out.println("a * b = " + (a * b));
        System. out.println("a / b = " + (a / b));
        System. out.println("a % b = " + (a % b));

        // 関係演算子
        System. out.println("a >= b = " + (a >= b));
        // 論理演算子
        System. out.println("(a >= 0) && " + ((a >= 0) && (b >= 0)));
    }
}

// メモ
// 1.コンパイルの後、実行するときに「java Operator 7 2」のように2つの数値を入力すると計算結果を表示するプログラムになっている。
// ２.この７と２はargsに入り文字列型になってしまうので、Integer.parseInt(args[0])”でint型に変換している。

