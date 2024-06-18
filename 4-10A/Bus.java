package 4-10A;

public class Bus extends Vehicle{
    public Taxi(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("バスの乗客" + crewNum + "名");
    } 
}
