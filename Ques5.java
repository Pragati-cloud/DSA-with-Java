import java.util.*;
public class Ques5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int res=0;
    int count=0;
  
      for(char ch:s.toCharArray()){
        if(ch=='1'){
          count++;
        }else{
          res+=count*(count+1)/2;
          count=0;
        }
      }
      res+=count*(count+1)/2;
      System.out.println(res);
      
    }

  }
  
