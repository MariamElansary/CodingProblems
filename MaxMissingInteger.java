 public static int solution(int[]A) {        
         Arrays.sort(A);     
         
         int min = 1; 
         
         int N = A.length; 

         for (int i = 0; i < N; i++){
             if(A[i] == min){
                 min++;
             }
         }   
        
         return min;   
 }
