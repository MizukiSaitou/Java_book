public class Thief02{
  String name;
  int hp;
  int mp;

  public Thief02(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public Thief02(String name, int hp){
    this(name, hp, 5);
  }
  public Thief02(String name){
    this(name, 40, 5);
  }
}