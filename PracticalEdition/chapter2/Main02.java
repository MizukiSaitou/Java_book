public class Main02{
  public static void main(String[] args){
    StrongBox<String> box = new StrongBox<String>(KeyType.PADLOCK);
    box.put("解錠");
    String s = box.get();
    System.out.println(s);
  }
}