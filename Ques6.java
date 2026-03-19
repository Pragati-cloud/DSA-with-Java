import java.util.Scanner;

public class Ques6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter no.of wheels: ");
    int w =sc.nextInt();
    System.out.println("Enter no.of vehicles: ");
    int v = sc.nextInt();

    if(w%2!=0 || w<2*v ||w>4*v){
      System.out.println("No vehicles");
    }

    int cars= (w-2*v)/2;
    int bikes = v-cars;
    System.out.println("Cars: "+cars);
    System.out.println("Bikes: "+bikes);
  }
  
}
