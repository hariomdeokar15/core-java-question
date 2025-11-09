class Animal{
  public void sound(){
   System.out.println("Animals make sounds");
}
}

class Dog extends	 Animal{
  public void sound(){
  System.out.println("Dog can bark");
}
}
public class CastingWithObjectAndClasses{
public static void main(String args[]){
  Animal a = new Dog();// upcasting / implicit casting
  a.sound();
  
  Dog d =  (Dog)a;
  d.sound();
  
}
}