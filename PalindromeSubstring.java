package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeSubstring {
	
public static void main(String[] args) {
		
		String str="aaabcbdaadbc";
		System.out.println(findSubstringPalindrome(str));
}
	static  String findSubstringPalindrome(String str) {
						 
			if (str == null || str.length()==0) 
				 return null;
			 Long max=(long) 0;
			 String freqElement=null;
				
			 List<String> list = Arrays.asList(str.replaceAll("[-+.^:,]","").split(" "));
			 
			
		   Map<String, Long> map= list.stream().map(word->word.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		   
		  /* for (Entry<String, Long> entry: map.entrySet()) {
			   if (entry.getValue()>max && !entry.getKey().equals(bannedWord) ) {
				   max=entry.getValue();
			   
				   freqElement=entry.getKey();
					
			   }
			*/  
			   
		   }
	
		      return freqElement;
		   
		}

}
