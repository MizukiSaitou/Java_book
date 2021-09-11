public class Main10{
  public static void main(String[] args){
    Hero h = new Hero();
    h.run();
    SuperHero sh = new SuperHero();
    sh.fly();
    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(h);
  }
}