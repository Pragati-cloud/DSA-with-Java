public class Genericmethod {

  //generic method

  public <T> void generic(T t){
    System.err.println(t);
  }

  //method with varagrs

  public void printNum(int... num){
    System.out.println("Printing Num: ");

    for(int i : num){
      System.out.println(i +" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Genericmethod obj= new Genericmethod();
    obj.generic("helo");
    obj.generic(123);
    obj.generic(12.7);

    obj.printNum(2,6,5,8,22,6);

  }
}
