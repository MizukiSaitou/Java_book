public class Chapter15_2{
  public static void main(String[] args){
    String folder;
    Sting file;

    Linking("c:¥javadev", "readme.text");
    Linking("c:¥user¥", "readme.text");

    public String Linking(Sting folder, String file){
      if(!folder.endsWith("¥¥")){
        folder += "¥¥";
      }
      return folder + file;
    }
  }
}


