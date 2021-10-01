public class Hero extends Character{
  public void attack(Matango m){
    System.out.println("20ポイントの攻撃を与えた!");
    m.hp -= 20;
  }
}