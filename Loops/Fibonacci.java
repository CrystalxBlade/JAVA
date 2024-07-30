public class Fibonacci 
{
  public static void main(String[] args) 
  {

    /* 
    int i = 1;
    int j = 1;

     while(j<=55)
     {
        System.out.println(j);

        i = i+j;
        j = i-j;
     }
     */   

     for(int i =1, j =1; j<=55; i=i + j, j = i-j)
     {
        System.out.println(j);
     }
  }  
}
