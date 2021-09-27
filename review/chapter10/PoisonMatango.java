public class PoisonMatango extends Matango{

  int count = 5;

  public PoisonMatango(char suffix){
    super(suffix);
  }
  public void attack(Hero h){
    super.attack(h);
    if(count > 0){
      System.out.println("さらに毒の奉仕をばらまいた！");
      int point;
      point = h.hp / 5;
      h.hp -= point;
      System.out.println(point + "ポイントのダメージ！");
      this.count --;
    }
  }
}