import java.util.*;

public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Введите число: ");
  int n = in.nextInt();
  int i,j;
  for (i=1; i<=n; i++)
  {
    for (j=1; j<n; j++)
      System.out.print(" ");
    for (j=1; j<=i; j++)
      if (j==1 || j==i)
        System.out.print("* ");
    else 
      System.out.print(" ");
    System.out.println("");
  }
  }
}
