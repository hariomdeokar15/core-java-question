import java.util.Scanner;
class Evenodd{

  public void findEven(int arr[]){
     System.out.println("Even numbers are: ");
     for(int i = 0; i<arr.length; i++){
       if(arr[i]%2==0){
        System.out.print(arr[i]+" ");
        
       }
     }
     System.out.println();

  }
  public void findOdd(int arr[]){
     System.out.println("Odd numbers are: ");
     for(int i = 0; i<arr.length; i++){
       if(arr[i]%2!=0){
        System.out.print(arr[i]+" ");
       }
     }

  }
  public static void main(String args[]){
    Evenodd e = new Evenodd();
     
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers :");

    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    
    e.findEven(arr);
    e.findOdd(arr);


  }
}