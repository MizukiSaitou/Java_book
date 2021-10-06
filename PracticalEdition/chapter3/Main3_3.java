import java.util.function.*;

public class Main3_3{
  public static void main(String[] args){
    FuncList funclist = new FuncList();
    IntPredicate func1 = (int x) -> {return (x % 2 == 1);};
    Func2 func2 = (int point, String name) -> {return name + "さんは" + (point > 65 ? "合格" : "不合格");};

    System.out.println(func1.test(19));
    System.out.println(func2.call(69, "鈴木"));
  }
}