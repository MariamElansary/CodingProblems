public static int solution(String S) {        
    	int result = -1, value1=0, value2=0;
        Stack<Integer> opStack = new Stack<Integer>();

        String[] inputs = S.trim().split("\\s"); // trim spaces
        
        
        for(int i = 0; i<inputs.length; i++){
        	try{
            	switch(inputs[i]){
    	        	case "+":
    	        	{
    	        			value1 = opStack.pop();
    	    				value2 = opStack.pop();
    	
    	        			opStack.push(value1+value2);
    	        			break;
    	        	}
    	        	case "-":
    	        	{
    	        			value1 = opStack.pop();
    						value2 = opStack.pop();
    		
    		    			if(value1>value2){
    							opStack.push(value1-value2);
    		        			break;
    						}
    						else{
    							System.out.println("Error in the machine: Negative Value");
    		    				return result;
    						}	
    	        	}
    	        	case "DUP":
    	        	{
    	        			value1 = opStack.peek();
    	        			opStack.push(value1);
    	        			break;
    	        	}
    	        	case "POP":
    	        	{
    	        			opStack.pop();
    	        			break;
    	        	}
    	        	default:
            			opStack.push(Integer.parseInt(inputs[i]));
        	   }
        	}catch(EmptyStackException e){
    			System.out.println("Error in the machine: Empty Stack Exception");
    			return result;
        	}
        }

		result = opStack.peek();

        return result;
    }
