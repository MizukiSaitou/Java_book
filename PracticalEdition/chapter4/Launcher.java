public class Launcher{
  public static void main(String[] args){
    String[] fqcn = args[0];
    String[] sm = args[1];
    showMemory();

    
  
    public static void showMemory(){
      long free = Runtime.getRuntime().freeMemory() / 1024 / 1024;
      long total = Runtime.getRuntime().totalMemory() / 1024 / 1024;
      long use = total - free;
      System.out.println("現在のメモリ使用量：" + use + "MB です");
      // System.out.println(free);
      // System.out.println(total);
    }
  }
}