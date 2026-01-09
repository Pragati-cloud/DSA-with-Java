import java.util.Scanner;

class KadaneAlgo{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no. of element");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("enter elements");
      for(int i =0; i<n;i++){
          arr[i] = sc.nextInt();
          System.out.println("next element");
      }

      System.out.println("Using Kadane Algo : Finding Maximum subarray sum");
      System.out.println(Kadane(arr,n));
  }
  public static int Kadane(int[] arr,int n) {
      int max = arr[0];
      int res =arr[0];
      for(int i =0;i<n;i++){
        max= Math.max(max+ arr[i], arr[i]);
        res = Math.max(res,max);
      }
      return res;
  }
}
