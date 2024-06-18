package 4-10A;

public class Taxi extends Vehicle{
    //コンストラクタ
    public Taxi(int crewNum){
        this.crewNum = crewNum;
    }
    //crewNumの値を画面に表示
    public void showcrewNum(){
        System.out.println("タクシーの乗客" + crewNum + "名");
    }   
}


//TaxiにもTrainにもcrewNumというメンバ変数がある
