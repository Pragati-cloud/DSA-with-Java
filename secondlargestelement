import java.util.*;

public class Ques1 {
  public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    System.out.print("No. of elements in array");

    int num= sc.nextInt();
    int[] arr = new int[num];
    System.out.println("Enter Numbers");
    for(int i =0 ; i<num; i++){
      arr[i]= sc.nextInt();
      System.out.println("Next element");
      
    }
    System.out.print("Array : " + Arrays.toString(arr));
    System.out.print(" Second Smallest Element : " + secondsmallelement(arr));
    sc.close();

  }
  
  public static int secondsmallelement(int[] arr){

    int largest =-1;
    int secondlargest = -1;
    int nums = arr.length;

    for(int i =0;i<nums;i++){
       if(arr[i] >largest){
         largest=arr[i];
       }
        else if(arr[i]<largest && arr[i]>secondlargest){
      secondlargest=arr[i];
    }
    }return secondlargest;
   
  }
}
