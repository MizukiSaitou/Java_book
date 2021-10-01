public class Thief extends Character{
  public void attack(Matango m){
    System.out.println("5ポイントの攻撃を与えた!");
    m.hp -= 5;
  }
}