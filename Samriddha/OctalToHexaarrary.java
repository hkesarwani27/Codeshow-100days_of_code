import java.util.Scanner;
class OctalToHexa
{
    public static void main(String arg[])
    {
        int oct, dec=0, i=0, t,rem;
        char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexdec="";
        Scanner sc = new Scanner(System.in);		
        System.out.println("Enter Octal Number : ");
        oct = sc.nextInt();				
        while(oct != 0)
        {
            dec =dec + (oct%10) *(int)Math.pow(8, i);
            i++;
            oct = oct/10;
        }	
       while(dec!= 0)
       {
	rem=dec%16;
	hexdec= a[rem] + hexdec;
               dec= dec/16;
       }	     
        System.out.println("Hexadecimal number is :"+hexdec);   
  }
}