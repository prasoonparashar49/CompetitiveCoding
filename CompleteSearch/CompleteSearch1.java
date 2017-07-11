public class CompleteSearch1{
    
    //returns true if all the digits are distinct
    private static boolean DistinctDigits(int x)
    {
        Integer number = new Integer(x);
        String digits = number.toString();
        for(int i=0; i < digits.length(); i++)
        {
          for(int j = 0; j < digits.length(); j++)
          {
              if((i != j) && (digits.charAt(i) == digits.charAt(j)))
              {
                  return false;
              }
          }
        }
        return true;
    }
    

     public static void main(String []args){
        System.out.println("Finding Pairs...");
        int count = 0;
        int totalPairs = 0;
        //numerator based approach
        for(int numerator = 10234; numerator <= 98765; numerator++)
        {
            if(DistinctDigits(numerator))
            {
                for(int factor = 2; factor <= 62; factor++)
                {
                    count++;
                    if( (numerator%factor == 0) && (numerator/factor >= 1234) && (DistinctDigits(numerator/factor)) )
                    {
                        totalPairs++;
                    }
                }
            }
        }
        System.out.printf("total pairs by enumerating all possible numerators:%d\n",totalPairs);
        System.out.printf("Loop executed for %d times\n",count);
        
        count = 0;
        totalPairs = 0;
        //denominator based approach
        for(int denominator = 1234; denominator <= 98765/2; denominator++)
        {
            if(DistinctDigits(denominator))
            {
                for(int multiplier = 2; multiplier <= 62; multiplier++)
                { 
                    count++;
                    int result = multiplier*denominator;
                    if(result <= 98765 && result > 10000 && DistinctDigits(result))
                    {
                        totalPairs++;
                    }
                }
            }
        }
        System.out.printf("total pairs by enumerating all possible denominators:%d\n",totalPairs);
        System.out.printf("Loop executed for %d times\n",count);
        
     }
}
