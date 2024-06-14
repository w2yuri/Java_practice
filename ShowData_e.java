public class ShowData_e {
    public static void main (String[] args){
        int num = 10;
        double pi = 3.14;
        char blood = 'A';
        boolean fun = true;
        String msg = "祝"; 


        System.out.println(num);
        System.out.println(pi);
        System.out.println(blood);
        System.out.println(fun);
        System.out.println(msg);
    }
}


// ⭐️charとStringの違い
// ①char型:
// 単一の文字を表すデータ型です。
// シングルクォート（'）で囲まれます。
// 例: 'A', 'B', '1', '*'

// ②String型:
// 文字のシーケンス（文字列）を表すデータ型です。
// ダブルクォート（"``")で囲まれます。
// 例: "A", "Hello", "123", "!"

// 【理由】
// ⑴データ型の違い:
// char blood = 'A'; のようにシングルクォートを使用すると、'A'は単一の文字を示すchar型の値です。
// 一方、ダブルクォートを使用すると、"A"はString型の文字列を示します。
// ⑵メモリ使用とパフォーマンス:
// charは2バイトの固定サイズを持つ単一の文字です。
// Stringは可変長であり、文字列の長さに応じてメモリを消費します。また、Stringはオブジェクトとして扱われるため、メモリ上での管理が異なります。
// ⑶コンパイルエラー:
// char blood = "A"; のように書くと、コンパイラは型の不一致を検出し、エラーを出します。具体的には、「型の不一致: String から char への変換はできません」というエラーメッセージが表示されます。
// これは、char型の変数には単一の文字（シングルクォートで囲まれた）しか割り当てられないためです。