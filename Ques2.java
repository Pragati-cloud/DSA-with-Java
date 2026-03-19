import java.util.Scanner;
import java.util.*;

public class Ques2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();
    System.out.println("Enter the elements:");
    int[] arr =new int[n] ;
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    
    int sum = arr[0]+arr[n-1];
    int count=0;
    for(int i =0;i<n/2;i++){
      if(arr[i]+arr[n-1-i]==sum){
        count++;
      }
    }
    System.out.println(count);

    sc.close();
  }

}
