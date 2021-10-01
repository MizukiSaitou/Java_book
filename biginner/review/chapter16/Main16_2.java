import java.util.*;

public class Main16_2{
  public static void main(String[] args){
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");

    List<Hero> heros = new ArrayList<Hero>();
    heros.add(h1);
    heros.add(h2);
    for(Hero hero : heros){
      System.out.println(hero.getName());
    }
  }
}