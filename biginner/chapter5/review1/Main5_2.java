public class Main5_2{
  public static void email(String title, String address, String text){
    System.out.println(address + "に以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void email(String address, String text){
    System.out.println(address + "に以下のメールを送信しました。");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
  public static void main(String[] args){
    String title = "業務連絡";
    String address = "exaple@example.com";
    String text = "明日の会議は13時から開始です。";
    email(title, address, text);
    email(address, text);
  }
}