public class Main5_4{
  public static double calcTriangleArea(double bottom, double height){
    return bottom * height / 2;
  }
  public static double calcCircleeArea(double radius){
    return radius * radius * 3.14;
  }
  public static void main(String[] args){
    System.out.println("三角形の面積は" + calcTriangleArea(10, 30));
    System.out.println("円の面積は" + calcCircleeArea(10));
  }
}