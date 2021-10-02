public class Pocket<E>{
  private E date;

  public void put(E d){
    this.date = d;
  }
  public E get(){
    return this.date;
  }
}