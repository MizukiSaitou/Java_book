public class Multiplication{
  public static void main(String[] args){
    for(int i = 1; i < 10; i++){
      for(int j = 1; j < 10; j++){
        // i * j　で掛け算
        System.out.println(i * j);
        // 空白の出力
        System.out.println(" ");
      }
      // jのループが終了すると改行を出力
      System.out.println("");
    }
  }
}