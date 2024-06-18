public class Baseball implements Englishable{
  //日本語表記
  public void display(){
    System.out.println("キャッチボール");
    System.out.println("シートノック");
    System.out.println("バッティング");
  }
  //英語表記
  public void displayEng(){
    System.out.println(Englishable.LANGUAGE);
    System.out.println("catch ball");
    System.out.println("seat knock");
    System.out.println("batting practice");
  }
}
