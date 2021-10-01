import java.util.*;

public class Cleric{
  String name;
  int hp = 50;
  final int MaxHP = 50;
  int mp = 10;
  final int MaxMP = 10;

  public void selfAid(){
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MaxHP;
    System.out.println("HPが最大値まで回復した！");
  }

  public int pray(int sec){
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");
    int recover = new Random().nextInt(3) + sec;
    int recoverActual = Math.min(this.MaxMP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}