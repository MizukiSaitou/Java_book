public class Main3_1{
  public static void main(String[] args){
    FuncList funclist = new FuncList();
    Func1 func1 = FuncList::isOdd;
    Func2 func2 = funclist::passCheck;

    System.out.println(func1.call(19));
    System.out.println(func2.call(69, "鈴木"));
  }
}