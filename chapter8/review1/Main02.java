public class Main02{
  public static void main(String[] args){
    Hero02 h = new Hero02();
    h.name = "勇者";
    h.hp = 200;

    Matango02 m = new Matango02();
    m.suffix = 'A';
    m.hp = 20;

    Cleric02 c = new Cleric02();
    c.name = "聖職者";
    c.hp = 40;
    c.mp = 10;

    h.attack();
    m.attacked();
    c.selfAid();
    h.sit(3);
    m.run();
  }
}