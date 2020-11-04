package Prgrammers.Greedy;

import java.util.Stack;

public class Programmers_큰수만들기_Lv2 {
	
	public static void main(String[] args) {
		String number="1111";
		int k=2;
		String[] numList= number.split("");
//				Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
		Stack<String> selected = new Stack<String>();
		String answer="";
		for(int i=0;i<numList.length;i++) {
			while(!selected.isEmpty() && Integer.parseInt(selected.peek())<Integer.parseInt(numList[i])&&k>0) {
				selected.pop();
				k--;
			}
			selected.add(numList[i]);
		}
		for(int i=0;i<k;i++) {
			selected.pop();
		}
		System.out.println(String.join("", selected));
//		return String.join("", selected);
		
	}

}
