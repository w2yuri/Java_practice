package mypack;

public class Train extends Vehicle{
  public Train(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("電車の乗客は" + crewNum + "名");
  }
}
