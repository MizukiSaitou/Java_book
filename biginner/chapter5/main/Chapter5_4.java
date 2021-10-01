public class Chapter5_4{
  public static void main(String[] args){
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は" + triangleArea + "平方cm");
    
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の半径が5.0cmの場合、面積は" + circleArea + "平方cm");
  }
  public static double calcTriangleArea(double bottom, double height){
    double t_area = bottom * height / 2;
    return t_area;
  }
  public static double calcCircleArea(double radius){
    double c_area = radius * radius * 3.14;
    return c_area;
  } 
}