public class Main13{
  public static void main(String[] args){
    Hero h = new Hero();
    h.setName("勇者");
    h.setHp(200);

    Wand wa = new Wand();
    wa.setName("魔法の杖");
    wa.setPower(23.1);

    Wizard w = new Wizard();
    w.setName("魔法使い");
    w.setHp(100);
    w.setMp(100);
    w.setWand(wa);
    w.heal(h);
  }
}