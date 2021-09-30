import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main15_4{
  public static void main(String[] args){
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);

    int day = c.get(Calendar.DAY_OF_MONTH);
    int day_plus = day + 100;
    c.set(Calendar.DAY_OF_MONTH, day_plus);

    Date d = c.getTime();

    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    String s = f.format(d);
    System.out.println("現在の100日後の日付は" + s + "です");
  }
}