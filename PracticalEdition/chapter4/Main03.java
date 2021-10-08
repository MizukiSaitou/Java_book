import java.util.*;

public class Main03{
  public static void main(String[] args){
    TimeZone tz = TimeZone.getDefault();
    System.out.print("現在のタイムゾーン：");
    System.out.println(tz.getDisplayName());
    if(tz.useDaylightTime()){
      System.out.println("夏時間を採用しています");
    }else{
      System.out.println("夏時間を採用していません");
    }
    System.out.print("世界基準との時差は");
    System.out.println(tz.getRawOffset() / 3600000 + "時間");
    // 3600000で割るのはミリ秒を時間に変換するため
  }
}