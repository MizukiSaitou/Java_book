public class Wizard{
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  void heal(Hero h){
    int basePoint = 10;
    int recoverPoint = (int)(basePoint * this.getWand().getPower());
    h.setHp(h.getHp() + recoverPoint);
    System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した!");
  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(name == null || name.length() < 3){
      throw new IllegalArgumentException("名前は3文字以上にしてください");
    }
    this.name = name;
  }
  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    if(hp < 0){
      this.hp = 0;
    }
    this.hp = hp;
  }
  public int getMp(){
    return this.mp;
  }
  public void setMp(int mp){
    if(mp < 0){
      this.mp = 0;
    }
    this.mp = mp;
  }
  public Wand getWand(){
    return this.wand;
  }
  public void setWand(Wand wand){
    if(wand == null){
      throw new IllegalArgumentException("杖は必ず装備する");
    }
    this.wand = wand;
  }
}