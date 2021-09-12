public class Wizard extends Character{
  public void attack(Matango m){
    System.out.println("10ポイントの攻撃を与えた!");
    m.hp -= 10;
  }
}