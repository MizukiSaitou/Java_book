import java.util.Calendar;
import java.util.Date;

public class Day02{
  public static void main(String[] args){
    Calendar c = Calendar.getInstance();
    // 6つのint型からDateインスタンスを生成
    c.set(2019,8,22,1,23,45);
    c.set(Calendar.MONTH, 9); //月を10月に変更、月は0〜11の数字で表すため
    Date d = c.getTime();
    System.out.println(d);
    // Dateインスタンスからint価を生成
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
  }
}