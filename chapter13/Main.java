public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.setName("勇者");
    h.setHp(200);

    Wand wa = new Wand();
    wa.setName("魔法の杖");
    wa.setPower(14.8);

    Wizard w = new Wizard();
    w.setName("荒地の魔女");
    w.setHp(100);
    w.setMp(80);
    w.setWand(wa);

    w.heal(h);
  }
}