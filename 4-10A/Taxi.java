public class Taxi extends Vehicle implements Stopable{
    //コンストラクタ
    public Taxi(int crewNum){
        this.crewNum = crewNum;
    }
    //crewNumの値を画面に表示
    public void showCrewNum(){
        System.out.println("タクシーの乗客" + crewNum + "名");
    }   
    //implements Stopable実行のため追加の記述
    public void stop(){
        System.out.println("ここで降ります");
    }
}


//TaxiにもTrainにもcrewNumというメンバ変数がある

//TaxiクラスはVehicleクラスを拡張してStopableインターフェスを実装