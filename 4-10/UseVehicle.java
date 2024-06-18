//インポート
import mypack.*;

public class UseVehicle{
  public static void main(String[] args){
    Vehicle[] v = new Vehicle[3];
    v[0] = new Taxi(4);
    v[1] = new Train(160);
    v[2] = new Bus(80);

    for(int i = 0; i < v.length; i++){
      v[i].showCrewNum();
      if(v[i] instanceof Stopable){
        Stopable s = (Stopable)v[i];
        s.stop();
      }
    }
  }
}


//UseVehicle 以外を手動でmypackフォルダに移動してからjavac -d . *.java、実行としてUseVehicle 実行結果は下記のようになる
// //タクシーの乗客は4名
// 降ります
// 電車の乗客は160名
// バスの乗客は80名
// 次止まります