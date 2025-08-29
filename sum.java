import java.util.Scanner;
class Sum{

public int addition(int a, int b){
return a+b;
}

public static void main(String args[]){

Sum s = new Sum();

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number a");
int a = sc.nextInt();

System.out.println("Enter a number b");
int b = sc.nextInt();


int answer = s.addition(a, b);

System.out.println("The Sum of Two numbers are: "+answer);

}

}

  