public class Chapter5_2{
  public static void main(String[] args){
    String title = "example";
    String address = "example@example.com";
    String text = "テストメールです";
    email(title, address, text);
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}