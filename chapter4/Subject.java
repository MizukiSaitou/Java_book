public class Subject{
  public static void main(String[] args){
    int math = 20;
    int japanese = 30;
    int science = 40;
    int english = 50;
    int social_science = 80;

    int sum = math + japanese + science + english + social_science;
    int avg = sum / 5;

    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avg);
  }
}