public class Main3_3{
  public static void main(String[] args){
    int isHungry = 1;
    String food = "カレー";

    System.out.println("こんにちは");
    if(isHungry == 0){
      System.out.println("お腹がいっぱいです");
    }else{
      System.out.println("空腹です");
    }
    if(isHungry == 1){
      System.out.println(food + "いただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}