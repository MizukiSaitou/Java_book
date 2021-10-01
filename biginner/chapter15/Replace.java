public class Replace{
  public static void main(String[] args){
    String s = "abc,def:ghi";
    String word = s.replaceAll("[ben]", "X");
    System.out.println(word);
  }
}