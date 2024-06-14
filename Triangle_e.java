public class Triangle_e {
    public static void main(String[] args){
        //①Javaプログラムを実行する際に、コマンドライン（ターミナル）から引数を与えることができる。
        //この場合、argsという名前の配列に引数が格納される。
        //②args[0]は配列argsの最初の要素を指す。これがコマンドライン引数として与えられた文字列。
        //③この文字列をInteger.parseIntメソッドを使って整数型に変換し、heightという変数に代入。
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int area;

        area = height * width / 2 ;

        System.out.println("高さ" + height);
        System.out.println("幅" + width);
        System.out.println("面積" + area);
    }
}



// intは、Javaや他の多くのプログラミング言語で使用される基本的なデータ型の一つ。
// 具体的には、整数（整数値）を表現するためのデータ型。
//整数（integer）は、数学およびコンピュータサイエンスにおける基本的な数値の概念.
