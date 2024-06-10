class StuSample3 {
        public static void main(String[] args){
            Student3 stu1 = new Student3("菅原");
            Student3 stu2 = new Student3("村山", 75, 100);
    
            stu1.setScore(90, 80);
            stu1.display();
            stu2.display();
    }
}

//オブジェクトの生成と同時にコンストラクタに値を渡して、データの設定も行なっている。
