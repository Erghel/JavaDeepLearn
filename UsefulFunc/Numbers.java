import java.util.*;
import java.lang.Math;

public class Main {
  public static void Main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n - in.nextIn();
    int i;
    for (i=(-n+1); i<n; i++)
    {
      if((n-Math.abs(i))%2 == 1) {
        System.out.print(n-Math.abs(i)+" ");
      }
      else {
        System.out.print("@ ");
      }
    }
  }
}
