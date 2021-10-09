import java.lang.reflect.＊＊;

public class Launcher{
  public static void main(String[] args){
    String[] fqcn = args[0];
    String[] sm = args[1];
    showMemory();
    listMethod();
    if(args[1].equals("E")){
      launchE(clazz);
    }else(args.equals("I")){
      launchI(clazz);
    }


    public static void showMemory(){
      long free = Runtime.getRuntime().freeMemory() / 1024 / 1024;
      long total = Runtime.getRuntime().totalMemory() / 1024 / 1024;
      long use = total - free;
      System.out.println("現在のメモリ使用量：" + use + "MB です");
      // System.out.println(free);
      // System.out.println(total);
    }

    public static void listMethod(Class<?> clazz){
      System.out.println("メソッドの一覧");
      Method[] methods = clazz.getDeclaredMethod();
      for(Method method : methods){
        System.out.println(method.getName());
      }
    }

    public static void launchE(Class<?> clazz) throws Exception{
      System.out.println("別プロセスで起動します");
      ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
      Process process = pb.start();
      process.waitFor();
    }

    public static void launchI(Class<?> clazz) throws Exception{
       Method mainMethod = clazz.getMethod("main", String[].class);
       String[] args = {};
       mainMethod.invoke(null, (Object) args);
    }
  }
}