class Triangle {
    public static void main(String[] args) {
        // コマンドラインから受け取った文字列をint型に変換
        int height = Integer.parseInt(args[0]);  
        int width = Integer.parseInt(args[1]);   
        int area;

        //面積の計算
        area = height * width / 2;

        //高さ・幅・面積の表示
        System. out.println("高さ：" + height);
        System. out.println("幅 ：" + width);
        System. out.println("面積：" + area);
    }
}
