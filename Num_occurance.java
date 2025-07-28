//Number of occurance using brute force

public class numoccurence {
  public static void main(String[] args){
    int num =3;

    int[] arr = {3,6,3,8,2,1,3,965,3};
    int res= numoccure(num, arr);
    System.out.print(res);
  }
  public static int numoccure(int num , int[] arr){
     int count =0;
    for(int i=0;i<arr.length; i++){
      if(arr[i]== num)  count++;
    }
    return count;
  }
}
