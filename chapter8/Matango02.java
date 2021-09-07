public class Matango02{
  int hp;
  char suffix;

  public void attacked(){
    this.hp -= 5;
    System.out.println("おばけきのこ" + this.suffix + "は攻撃を受けてHPが5減った");
  }
  public void run(){
    System.out.println("おばけきのこ" + this.suffix + "は逃げ出した");
  }
}