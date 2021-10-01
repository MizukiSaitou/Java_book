public class Radar{
  public static void main(String[] args){
    System.out.println("★レーダー★");

    int target = 67;
    int range = 8;

    System.out.println("ゲームを開始します。");
    System.out.println("ターゲットが設定されました。");

    for(int i = 0; i < 6; i++){
      System.out.println("位置は？");
      int position = new java.util.Scanner(System.in).nextInt();
      System.out.println("範囲は？");
      int r = target - position;
      System.out.println(r);

      if(r == 0){
        System.out.println("正解！！！");
      }else if(r < range){
        System.out.println("ヒットです！");
      }else{
        System.out.println("はずれです・・・");
      }
    }
  }
}