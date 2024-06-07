class Branch3 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    
    switch( num ) {     //数値によって処理を分岐させている(コマンドラインで入力したのが1~3)
        case 1:
          System. out.println("入園料金：8,400円");
          break;
        case 2: 
          System. out.println("入園料金：7,000円");
          break;
        case 3:
          System. out.println("入園料金：5,000円");
          break;
        default:
          System. out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
    }
  }
}

// メモ　breakを消しても動くが、例としてcase1と2のbreakを消すとdefault以外の1~3までの実行結果が全て表示されてしまう。