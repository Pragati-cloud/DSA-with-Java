import java.util.Scanner;

public class Ques3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    if(check(word,'A','Z') || check(word,'a','z')|| check(word.substring(1),'a','z')) {
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
  public static boolean check(String word,char start,char end){
    for(int i =0;i<word.length();i++){
      if(word.charAt(i)<start || word.charAt(i)>end){
        return false;
      }
    }
    return true;
  }
  
  
}
