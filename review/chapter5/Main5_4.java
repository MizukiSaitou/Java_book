public class Main5_4{
  public static void main(String[] args){
    System.out.println(calcTriangleArea(10.2, 8.4));
    System.out.println(calcCircleArea(10.2));
  }

  public static double calcTriangleArea(double bottom, double height){
    return bottom * height /2;
  }
  public static double calcCircleArea(double radius){
    return radius * radius * 3.14;
  }
}