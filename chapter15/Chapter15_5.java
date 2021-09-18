import java.time.*;
import java.time.format.*;

public class Chapter15_5{
  public static void main(String[] args){
    LocalDate now = LocalDate.now();

    DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM年dd日");

    LocalDate day = now.plusDays(100);
    String future = day.format(f);
    System.out.println(future);
  }
}