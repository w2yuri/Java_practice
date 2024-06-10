public class Student5 {
    private String name;
    private int score;

    public Student5(String n){
        name = n;
    }
    public void setScore(int s) {
        //0~100点以内か判別し、それ以外には13〜１４行目を表示
        if(0 <= s && s <= 100){
            score = s;
        }   else  {
            System.out.println(name + "さんの点数が範囲外です");
            score = 0;
        }
    }
    void display(){
        System.out.println(name + "さん" + score + "点");
    }
}
