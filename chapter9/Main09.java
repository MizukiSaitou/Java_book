public class Main09{
  public static void main(String[] args){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero("ミナト");
    // h1.name = "ミナト";
    // h1.hp = 100;
    h1.sword = s;

    Hero h2 = new Hero("アサカ");
    // h2.name = "アサカ";
    // h2.hp = 100;

    System.out.println(h1.name + ":" + h1.hp);
    System.out.println(h2.name + ":" + h2.hp);

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    // 上でh2のHPが回復したうえにさらに10回復する
    w.heal(h2);

    System.out.println("現在の武器は" + h1.sword.name);
    System.out.println(h1.name + "は、" + h1.sword.name + "で攻撃した！");
  }
}