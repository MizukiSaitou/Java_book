public class PracticeMain{
  public static void main(String[] args){
    Thief02 t1 = new Thief02("太郎", 100, 20);
    Thief02 t2 = new Thief02("二郎", 200);
    Thief02 t3 = new Thief02("三郎");

    System.out.println(t1.name + ":" + t1.hp + ":" + t1.mp);
    System.out.println(t2.name + ":" + t2.hp + ":" + t2.mp);
    System.out.println(t3.name + ":" + t3.hp + ":" + t3.mp);
  }
}