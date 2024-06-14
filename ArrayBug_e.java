class ArrayBug_e {
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