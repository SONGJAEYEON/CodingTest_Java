package Programmers.Hash;

import java.util.Arrays;

public class Programmers_완주하지못한선수_Lv1 {
	
	public static void main(String[] args) {
//		https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
	    String[] participant= {"mislav", "stanko", "mislav", "ana"};
	    String[] completion= {"stanko", "ana", "mislav"};
	    Arrays.sort(participant);
	    Arrays.sort(completion);
	    for(int i=0;i<completion.length;i++) {
	    	if(!participant[i].equals(completion[i])) {
	    		System.out.println(participant[i]);
	    	}
	    }
	    

	}
}
