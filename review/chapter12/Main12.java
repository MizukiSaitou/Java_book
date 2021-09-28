public class Main12{
  public static void main(String[] args){
    Y arrays[] = new Y[2];
    arrays[0] = new A();
    arrays[1] = new B();

    for(Y y : arrays){
      y.b();
    }
  }
}