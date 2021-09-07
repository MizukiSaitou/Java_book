public class Hero02{
  String name;
  int hp;

  public void attack(){
    System.out.println(this.name + "は攻撃した！");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は転んでHPが5減った");
  }
  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "のHPが" + sec + "ポイント回復した！");
  }
}