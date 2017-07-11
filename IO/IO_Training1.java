import java.util.Arrays;
public class HelloWorld{
    
    //echo the given float upto the given precisin
    private static void Echo(float val, int precision)
    {
        String formatString = "%."+precision+"f\n";
        System.out.printf(formatString,val);
        
    }
    
    //prints pie to n digits after the decimal point
    private static void PrintPie(int n)
    {
        float pie = 22.0f/7.0f;
        String formatString = "%."+n+"f\n";
        System.out.println("Rounding up pie upto "+n+" digits...");
        System.out.printf(formatString,pie);
    }

    //prints all the distinct integers in sorted order
    private static void PrintDistinct(int [] numbers)
    {
        System.out.println("sorting the numbers...");
        Arrays.sort(numbers);
        System.out.println("printing the distinct numbers...");
        System.out.printf("%d ",numbers[0]);
        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] != numbers[i-1])
                System.out.printf("%d ",numbers[i]);
        }
        System.out.println("");
    }
    
     public static void main(String []args)
     {
        //System.out.printf("%8.3f\n",123.0f);
        //System.out.printf("%.3f\n",123.0f);
        Echo(123.0f,3);
        Echo(1.234267889f,3);
        Echo(1.234867889f,3);
        PrintPie(1);
        PrintPie(5);
        PrintPie(10);
        int[] values1 = {22,123,34,3223,1231,23,34};
        PrintDistinct(values1);
     }
}
