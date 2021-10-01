package comment.kouhan;

public class Kouhan6_1{
  public static void callDeae(){
    System.out.println("反抗する言葉");
  }
  public static void showMondokoro() throws Exception{
    try{
        System.out.println("決め台詞");
        Thread.sleep(3000);
        comment.zenhan.Zenhan6_1.doTogame();
        } catch(InterruptedException e){
          e.printStackTrace();
        }
     
  }
}