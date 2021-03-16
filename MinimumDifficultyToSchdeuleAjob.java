import java.util.ArrayList;
import java.util.List;

public class leetCode2 {
	
	    public static List<String> stringMatching(String[] words) {
	    	ArrayList<String> al = new ArrayList<>();
	    	for(int i = 0 ; i < words.length ; i++) {
	    		for(int j = 0 ; j < words.length;j++) {
	    			if(words[i].contains(words[j])==true && 
	    					words[i].equalsIgnoreCase(words[j])!=true
	    					&& al.contains(words[j])!=true ) {
	    				al.add(words[j]);
	    			}
	    		}
	    	}
			return al;
	        
	    }
	    
	    public static void main(String[] args) {
	    	String [] words = {"leetcode","et","code"};
			System.out.println(stringMatching(words));
		}
	    
	}


