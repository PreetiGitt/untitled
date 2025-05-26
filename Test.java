package practice;

import java.util.*;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Valid Paranthesis

class Test {

	public static void main(String[] args) {
		
		String str="([)]";
		Stack<Character> stack=new Stack<Character>();
		 
		for (char ch: str.toCharArray()) {
			if (ch=='[' || ch== '(' ||ch== '{')
				stack.push(ch);
			else {
				if(!stack.isEmpty())
					if(!stack.isEmpty());
				
			 char top=stack.pop();
			if (ch==']' && top!='['
					|| ch== ')' && top!='('
					||ch== '}' && top!='{')
				 System.out.print(false);
			
			}
		}
		System.out.print(stack.isEmpty()+"___");
		
	}
}
            



