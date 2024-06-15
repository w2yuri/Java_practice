public class Person_4_2 {
        // メンバ変数：name
        private String name;
    
        //メソッド① 　名前を設定するsetNameメソッド
        public void setName(String n){
            name = n;
        }
        //メソッド② 　名前を取得するためのgetNameメソッド
        public String getName(){
            return name;
        }
        //メソッド③ 　名前を表示するdisplayメソッド
        public void display(){
            System.out.println("名前" + name);
        }
    }
    
    // 設計図クラス(スーパークラスのPerson)
