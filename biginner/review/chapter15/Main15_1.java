public class Main15_1{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < 100; i++){
      sb.append(i + 1 + ",");
    }
    String s = sb.toString();
    System.out.println(s);

    String[] a = s.split(",");
    System.out.println(a);
  }
}