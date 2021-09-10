public class PoisonMatango02 extends Matango02{
  int count = 5;

  public PoisonMatango02(char suffix){
    super(suffix);
  }

  public void poisonattack(Hero h){
    super.attack(h);
    if(this.count > 0){
      System.out.println("さらに胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.count -= 1;
    }
  }
}