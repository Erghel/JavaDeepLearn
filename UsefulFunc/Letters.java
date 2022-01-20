import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    ont n - in.nextInt();
    int i,j;
    for (i=1; i<=n; i++)
    {
      for (j=1; j<=i; j++)
      { 
        System.out.print((char)(j+64));
        System.out.print((char)(j+96));
      }
      System.out.print("");
    }
  }
}
