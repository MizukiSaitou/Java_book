public abstract class TangibleAsset extends Assets implements Thing{
  // String name;
  // int price;
  String color;
  double weight;

  public TangibleAsset(String name, int price, String color){
    // this.name = name;
    // this.price = price;
    super(name, price);
    this.color = color;
  }

  // public String getName(){return this.name;}
  // public int getPrice(){return this.price;}
  public String getColor(){return this.color;}
  public double getWeight(){return this.weight;}
  public void setWeight(double weight){this.weight = weight;}
}