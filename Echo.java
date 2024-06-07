class Echo {
    public static void main(String[] args) {
        //コマンドラインの入力文字を表示(for文)
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

//①for(int i = 0;　　　カウンタ変数iをint型で初期化
// ②i < args.length;　iの値がコマンドラインから入力された数だけ処理を繰り返す(for文の条件式)
// ③System.out.println(args[i]) 　args.length分だけ繰り返す

// 【変数(int i = 0;)は宣言したブロック内でしか使えない】
// 今回だとfor文内でしか使えない