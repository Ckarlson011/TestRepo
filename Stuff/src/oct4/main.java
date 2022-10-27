package oct4;
@FunctionalInterface
interface MyFunctionalInterface {
  public Integer sqr(int a);

  default String sqr(String a) {
    return a + a;
  }
}

public class main {
  public static void main(String[] args) {
    MyFunctionalInterface fi = n -> {
      return n * n;
    };
    System.out.println(fi.sqr(5));
  }
}