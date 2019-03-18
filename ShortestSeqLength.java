public static int solution(int N) {        
   
        int i=N, shortestLen = 1;

        while(i!=1)
        {
            if(i%2==0)
                i=i/2;
            else
                i--;
                
            shortestLen++;
        }
        return shortestLen;
}
