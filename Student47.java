public class Student47 {
    private String name;      // 氏名
    private Club club;       //Clubオブジェクト
  
    public Student47(String name, Club club){
      this.name = name;
      this.club = club;
    }
    public void display(){
      System.out.println("名前:" + name);
      club.display();
    }
    public void practice(){
      club.practice();
    }
}