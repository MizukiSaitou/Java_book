import java.time.*;
import java.time.format.*;

public class Main15_5{
  public static void main(String[] args){
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    LocalDate now = LocalDate.now();
    LocalDate now_plus = now.plusDays(100);
    String str = now_plus.format(fmt);
    System.out.println("現在の100日後の日付は" + str + "です");
  }
}
