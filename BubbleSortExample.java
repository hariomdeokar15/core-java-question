import java.util.Scanner;
class BubbleSortExample{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the array of size 5");

int[] arr = new int[5];

for(int i = 0; i<arr.length; i++){
arr[i] = sc.nextInt();
}

System.out.println("Original array is :");
printarray(arr);
Bubblesort(arr);

System.out.println("Sorted array is :");
printarray(arr);

}

public static void Bubblesort(int[] arr){ 
  int n = arr.length;
   boolean isSorted;
   for (int i=0; i<n-1; i++){
      isSorted = false;
     for(int j=0; j<n-i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
           isSorted = true;
       }
    }
     if(!isSorted) break;
}
}
public static void printarray(int[] arr){
  for(int num: arr){
    System.out.print(num+" ");
}
System.out.println();
}

}