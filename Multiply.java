
class Multiply{
  public float a;
  public float b;
  public Multiply(float a, float b){
    this.a = a;
    this.b = b;

  }
  public float multiplication(){
    return a*b;
  }
  public static void main (String args[]){
    Multiply m = new Multiply(20.3f, 20f);
    float x =  m.multiplication();

    System.out.println("The Multiplication is : "+ x);

  }
}