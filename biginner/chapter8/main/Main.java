public class Main{
  public static void main(String[] args){
    // 勇者1を生成
    Hero h = new Hero();
    // フィールドに初期値をセット
    h.name = "ミナト";
    h.hp = 100;

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    Cleric c = new Cleric();
    c.name = "魔術師";

    System.out.println("勇者" + h.name + "を生み出した！");
    // 勇者のメソッドを呼び出していく
    h.sit(5);
    h.slip();
    h.sit(25);
    m1.run();
    m2.run();
    h.run();
    c.selfAid();
    c.pray(2);
  }
}