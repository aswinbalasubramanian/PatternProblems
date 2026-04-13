import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
		    int input = sc.nextInt();
		    print19A(input);
			print19B(input);
		}
        sc.close();
	}
	
	static void print13( int n ){
	    int print = 1;
	    for( int i = 1; i <= n; i++ ){
	        
    	    for( int j = 1; j <= i; j++ ){
    	        System.out.print( print +" ");
    	        print++;
    	    }
    	    System.out.println(); 
	    }
	}
	
	static void print17( int n ){
	    for( int i = 0; i < n; i++){
	        for( int j = 0; j < n - i - 1; j++){
	            System.out.print(" ");
	        }
	        
	        char ch = 'A';
	        int breakpoint = (2*i + 1)/2;
	        for( int j = 1; j <= 2*i+1; j++ ){
	            System.out.print( ch );
	            if( j <= breakpoint) 
	                ch++;
	            else 
	                ch--;
	        }
	        
	        for( int j = 0; j < n - i - 1; j++ ){
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	
	static void print18( int n ){
	    for( int i = 1; i <= n; i++ ){
	        char ch = 'E';
	        ch -= i;
	        ch += 1;
	        for( int j = 1; j <= i; j++ ){
	            System.out.print(ch); ch++;
	        }
	        for( int j = 1; j <= n - i; j++){
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	    
	}

	//19A,19B - first approach - to be optimised
	static void print19A( int n ){
	    for( int i = 1; i <= n/2; i++ ){
	        
	        for( int j = i; j <= n/2; j++ ){
	            System.out.print("*");
	        }
	        for( int j = 1; j < i; j++){
	            System.out.print("  ");
	        }
			for( int j = i; j <= n/2; j++ ){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

	static void print19B( int n ){
	    for( int i = 1; i <= n/2; i++ ){    
	        for( int j = 1; j <= i; j++ ){
	            System.out.print("*");
	        }
	        for( int j = 1; j <= n -(2*i); j++){
	            System.out.print(" ");
	        }
			for( int j = 1; j <= i; j++ ){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
