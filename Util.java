  private int solution(int[]A, int[]B) 
  {    
     int n = A.length; 
    	int[] diff = new int[1000];
    	int notEmpty =0;
    	
    	for (int i = 0; i < n; i++){
            if ((Arrays.binarySearch(A, B[i]))<0){
            	diff[i] = A[i];
            	notEmpty ++;
            }
        } 
        
    	if(notEmpty==0)
    		return 0;
    	
        int min = Integer.MAX_VALUE;
        for (Integer x: diff)
        	if(x.intValue() != 0)
                min = Math.min(min, x);
       
        
        //Math.floorMod(x, y);
        //Math.pow(a, b)(a, b)(a, b)
        
        return Arrays.binarySearch(diff, min)+1; 
  }      


    private static boolean isIntegerValue (Double d)
    {   
      try {
             String someString = d.toString();
             if (someString.matches("\\d+")){//optional minus and at least one digit
                 return true;
             } else {
                 return false;
             }
      } catch (Exception e) {
             System.out.println("Exception:"+e.getMessage());
             return false;
      }        
    }


    private static int getSqrtRoot (int x){
    	
    	Double sqrt = Math.sqrt(x);
    	if (!isIntegerValue(sqrt))
    		return 1;
    	else
    		return sqrt.intValue();
    }
