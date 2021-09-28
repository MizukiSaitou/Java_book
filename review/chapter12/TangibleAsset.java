public abstract class TangibleAsser extends Asset implements Thing{
  String color;
  double weight;

  public TangibleAsser(String name, int price, String color){
    super(name, price);
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }
  public double getWeight(){
    return this.weight;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
}