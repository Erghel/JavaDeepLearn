public class reboot {
  public static void main(String args[]) throws Exception {
    Runtime r = Runtime.getRuntime();
    r.exec("shutdown -r");
  }
}
