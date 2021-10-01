public class Cleric02{
  String name;
  int hp;
  int mp;
  final int MAXHP = 50;
  final int MAXMP = 10;

  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAXHP;
    System.out.println(this.name + "は体力を回復した!");
  } 
}