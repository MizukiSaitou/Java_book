public class Main_p{
  public static void main(String[] args){
    Thief t1 = new Thief("ヤマダ", 100, 100);
    Thief t2 = new Thief("タナカ", 30);
    Thief t3 = new Thief("ナカムラ");

    System.out.println(t1.name + "HP : " + t1.hp + ", MP : " + t1.mp);
    System.out.println(t2.name + "HP : " + t2.hp + ", MP : " + t2.mp);
    System.out.println(t3.name + "HP : " + t3.hp + ", MP : " + t3.mp);
  }
}