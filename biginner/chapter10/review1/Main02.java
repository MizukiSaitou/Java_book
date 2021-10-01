public class Main02{
  public static void main(String[] args){
    Hero h = new Hero();
    h.run();
    SuperHero sh = new SuperHero();
    sh.fly();
    PoisonMatango02 pm = new PoisonMatango02('A');
    pm.attack(h);
    pm.poisonattack(h);
  }
}