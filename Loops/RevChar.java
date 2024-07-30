public class RevChar 
{
  public static void main(String[] args) 
  {
     String name = "Blade", rev = " ";

     int num = name.length();

     for(int i = num-1; i>=0; i--)
     {
        rev = rev + name.charAt(i);
     }
     System.out.println(rev);
  }  
}
