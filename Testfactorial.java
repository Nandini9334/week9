public class TestFactorial{
  public static void main(String[] args){
    try{
    if(Factorial.compute(5)!=120){
      throw new AssertionError("test passed for 5");
    } 
     if(Factorial.compute(0)!=1){
      throw new AssertionError("test passed for 0");
        }
      System.out.println("All tests are passed");
    }
      catch(AssertionError e){
        System.out.println(e.getMessage());
      }
  }
}
    
