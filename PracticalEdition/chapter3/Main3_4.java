import java.util.*;
import java.util.stream.*;

public class Main3_4{
  public static void main(String[] args){
    List<String> members = new ArrayList<String>();
    members.add("菅原拓真");
    members.add("湊雄輔");
    members.add("朝香あゆみ");
    members.add("大江岳人");

    members.stream()
            .filter(member -> member.length() <= 4)
            .map(member -> member + "さん")
            .forEach(System.out::println);
    
  }
}