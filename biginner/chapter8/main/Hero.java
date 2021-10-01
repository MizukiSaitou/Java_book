public class Hero{
  /*フィールド・・・クラスブロックに宣言された変数
    属性を宣言するにはクラスブロックの中に変数宣言を記述する。*/
  String name;
  int hp;

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec){
    // 難病座るか引数で受け取る
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した！");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }
  public void run(){
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}