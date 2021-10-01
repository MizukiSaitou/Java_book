public class Main5_2{
  public static void main(String[] args){
    email("業務連絡", "aaa@aaa.com", "17時より全体清掃");
    email("bbb@bbb.com", "明日10時より会議");
  }
  public static void email(String title, String address, String text){
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("【" + title + "】");
    System.out.println("本文：" + text);
  }
  public static void email(String address, String text){
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
}