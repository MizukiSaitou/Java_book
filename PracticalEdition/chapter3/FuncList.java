public class FuncList{
  public static boolean isOdd(int x){
    return (x % 2 == 1);
  }
  public String passCheck(int point, String name){
    return name + "さんは" + (point > 65 ? "合格" : "不合格");
    // pointが65より大きいなら”合格”に、以下なら”不合格”に化ける（三項条件演算子）
  }
}