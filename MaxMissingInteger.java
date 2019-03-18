 public static int solution(int[]A, int[]B) {        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int min = 1, max = 1;
        
        int n = A.length, m = B.length;
        
        for(int i = 0; i < n; i++)
        {
            if(min==A[i])
                min++;
        }
        
        for(int i = 0; i < m; i++)
        {
            if(max==B[i])
                max++;
        }
        
        
        if (max > min)
            return max;
        else
            return min;
 }
