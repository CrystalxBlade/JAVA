public class Reverse 
{
  public static void main(String[] args) 
  {
    int num = 1234, rem, result=0;

    while(num!=0)
    {
      rem = num % 10;
      result = result * 10 + rem;
      num = num/10;
    }
    System.out.println(result);
  }  
}
