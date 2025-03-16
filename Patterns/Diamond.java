package Patterns;

public class Diamond 
{
    public static void main(String[] args) 
    {
        int num  = 5 ;
        for(int i=0;i<num*2;i++)
        {
            int formula = i>num ? num*2-i:i;
            int space = num - formula ;

            if(i==num)
            {
                for(int k=0;k<formula;k++)
            {
                System.out.print("* ");
            }
                System.out.println();
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<formula;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
}
