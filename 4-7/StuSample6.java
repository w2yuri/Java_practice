public class StuSample6{
  public static void main(String[] args){
    TandF taf = new TandF("陸上競技部");
    Football fb = new Football("サッカー部");
    
    Student47 stu1 = new Student47("菅原",taf);
    stu1.display();
    stu1.practice();
    
    Student47 stu2 = new Student47("桜井",fb);
    stu2.display();
    stu2.practice();

  }
}
