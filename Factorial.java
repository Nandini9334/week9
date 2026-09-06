public class Factorial{
  public static long compute(int n){
    if(n<o){
      throw new illegalArgumentException("factorial of not defined");
    }
    long r=1;
    for(int i=2;i<=n;i++){
      r*=i;
    }
    return r;
  }
  public static void main(string[] args){
    int n=5
    System.out.print("factorial of "+n+" "+compute(n));
}
}
