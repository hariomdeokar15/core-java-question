  import java.util.Scanner;
class Sum{

public int addition(int a, int b){
return a+b;
}
public int additionOfTwoNumbers(int a, int b, int c){
  return a+b+c;
}

public static void main(String args[]){

Sum s = new Sum();

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number a");
int a = sc.nextInt();

System.out.println("Enter a number b");
int b = sc.nextInt();

System.out.println("Enter a number c");
int c = sc.nextInt();


int answer = s.addition(a, b);
int answer2 = s.additionOfTwoNumbers(a, b, c);

System.out.println("The Sum of Two numbers are: "+answer);
System.out.println("The Sum of Three numbers are: "+answer2);

}

}

  