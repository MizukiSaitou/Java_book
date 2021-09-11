public class Chapter5_3{
  public static void main(String[] args){
    String title = "example";
    String address = "example@example.com";
    String text = "テストメールです";
    email(address, text);
    email(title, address, text);
  }
  public static void email(String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}