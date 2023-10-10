package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
	  public static void main(String[] args)   
	    {   
	        // creating LinkedHashSet using the Set  
	        HashSet<String> data = new LinkedHashSet<String>();   
	    
	        data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example");   
	        data.add("Set");   
	    
	        System.out.println(data);   
	    }   
}
