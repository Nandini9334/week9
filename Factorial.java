public class Factorial{
  public static long compute(int n){
    if(n<0){
      throw new IllegalArgumentException("factorial of not defined");
    }
    long r=1;
    for(int i=2;i<=n;i++){
      r*=i;
    }
    return r;
  }
  public static void main(String[] args){
    int n=5;
    System.out.print("factorial of "+n+" "+compute(n));
}
}
