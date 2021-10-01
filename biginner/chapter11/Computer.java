public class Computer extends TangibleAsset{
  String makeName;

  public Book(String name, int price, String color, String isbn){
    super(name, price, color);
    this.makeName = makeName;
  }

  public String getMakeName{return this.makeName;}
}