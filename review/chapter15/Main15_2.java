public class Main15_2{
  public static void main(String[] args){
    String folder;
    String file;

    fileName("c:¥javadev", "readme.txt");
    fileName("c:¥user¥", "readme.text");
    }

    public static void fileName(String folder, String file){
      if(folder.endWith("¥¥")){
        System.out.println(folder + file);
      }else{
        System.out.println(folder + "¥" + file);
    }
  }
}