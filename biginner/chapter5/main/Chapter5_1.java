public class Chapter5_1{
  public static void introduceOneself(){
    String name = "鈴木";
    int age = 20;
    double height = 160.5;
    char zodiac = '戌';
    System.out.println("名前：" + name + "、年齢：" + age + "歳、身長：" + height + "cm、干支：" + zodiac);
  }
  public static void main(String[] args){
    System.out.println("自己紹介");
    introduceOneself();
  }
}