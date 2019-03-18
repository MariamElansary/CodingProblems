   public static int solution(int N) {       
         int firstDigit = 0;
         int noOfDigits = 0;
         int smallest = 0;
         
         if(N >= 10)
         {
             while (N/10 != 0) 
             {
                 noOfDigits++;
                 N = N/10;
             }
             
             firstDigit = Math.floorMod(N,10);
             
             Double power = Math.pow(10,noOfDigits);
             
             smallest = firstDigit * power.intValue();
         }
         return smallest;
  }
