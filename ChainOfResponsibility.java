package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChainOfResponsibility {
	
	 //2 pointers -> start & end , start will update by sliding window- end normally move
	public static void main(String[] args) {
	Map<Character, Integer> map=new HashMap<>();
	
	String str="abcaabcd";
	int start=0;
	String output="";
	
	
	for (int end=0;end<str.length() ;end++) {
	Character	currChar=str.charAt(end);
		 
	   if (map.containsKey(currChar)) {
		   //if char is repeating, start needs to be updated
		   start= Math.max(start,map.get(currChar)+1 );
	   }
	    if (output.length()<(end-start+1)){
	    	output=str.substring(start,end+1);
	    }
	    map.put(currChar,end);
		 
		
	}
	System.out.print("=="+output);
	

}
}
