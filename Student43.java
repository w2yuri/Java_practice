public class Student43 extends Person43{
    private int stuNo;

    public Student43(String name){
        this(name, 999);
    }
    public Student43(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }
    public void display(){
        super.display();
        System.out.println("学籍番号:" + stuNo);
    }
}
