import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReccuringChar {
	public static void main(String args[]) {
	      List<Integer> list = new ArrayList<>();
	      list.add(1);
	      list.add(2);
	      list.add(2);
	      list.add(1);
	      list.add(3);
	    //   int y=25;
	    //   int z=x+y;

	      System.out.println(findReccurring(list));
	    }
	    
	    static int findReccurring(List list) {
	    	 
	        Set<Integer> arrSet = new HashSet<Integer>();
	        
	        for(int i=0; i<list.size(); i++) {
	        	
	        	if(arrSet.contains(list.get(i))){
	        		return (int) list.get(i);
	        	}
	        	arrSet.add((Integer) list.get(i));
	        	
	        }
	        
	        return (Integer) null; 
	        
	        
	    }
}
