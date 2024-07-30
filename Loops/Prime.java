



public class Prime 
{
  public static void main(String[] args) 
  {
     
        int num = 88;
        int count=0;
        for(int i = 2; i<=num-1; i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("Not a Prime");
        }
        else
        {
            System.out.println("Prime");
        }
 
    

     /*
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the num: ");
         int num = sc.nextInt();
   
         boolean prime = true;
   
         for(int i=2; i<=num-1; i++)
         {
           if(num%i == 0)
           {
             prime = false;
             break;
           }
         }
         if(prime == true)
         {
           System.out.println("Prime number");
         }
         else
         {
           System.out.println("Not a Prime number");
         }
    */

    /*     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count=0;
        for(int i = 1; i<=num; i++)
        {
           if(num%i == 0)
           {
             count++;
           }
        }
        if(count == 2)
        
          System.out.println("Prime number");
        
        else
        
          System.out.println("Not a Prime number");

    */      
  }  
}
