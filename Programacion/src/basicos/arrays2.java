/**
 * 
 */
package basicos;

/**
 * @author Nayra
 *
 */
public class arrays2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Array de 2 dimensiones de tipo String
		String[][] names = {
	            {"Mr. ", "Mrs. ", "Ms. "},
	            {"Smith", "Jones"},
	            {"Nayra", "Pilar", "Nacho"}
	        };
	        // Mr. Smith
	        System.out.println(names[2][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println(names[0][2] + names[1][1]);

	        
	        int[][][] array3D = new int[][][] {
	    			{
	    				{1, 7, 9},
	    				{5, 9, 3},
	    				{7, 9, 9}
	    			},
	    			{
	    	    		{1, 7, 9},
	    	    		{5, 9, 3},
	    	    		{7, 9, 9}
	    	    	}
	    		   };
	    		   
	    	System.out.println(array3D[0][0][0]);
	    	System.out.println(array3D[1][0][0]);
	    	System.out.println(array3D[0][0][1]);
	    	System.out.println(array3D[0][1][1]);
	    	
	    
	    
	}

}
