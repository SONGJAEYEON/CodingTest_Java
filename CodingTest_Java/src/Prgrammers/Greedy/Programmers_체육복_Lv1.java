package Prgrammers.Greedy;

import java.util.HashSet;
import java.util.Iterator;

public class Programmers_체육복_Lv1 {
	
	public static void main(String[] args) {
		
		int n=5;
		int[] lost= {2,4};
		int[] reserve= {1,3,5};
		int answer=n;
		HashSet<Integer> lostList=new HashSet<Integer>();
		HashSet<Integer> reserveList=new HashSet<Integer>();
		for(int i:reserve) {
			reserveList.add(i);
		}
		for(int i:lost) {
			if(reserveList.contains(i)) {
				reserveList.remove(i);
			}else {
				lostList.add(i);
			}
		}
		Iterator<Integer> iter=lostList.iterator();
		while(iter.hasNext()) {
			int num=iter.next();
				if(reserveList.contains(num-1)) {
				reserveList.remove(num-1);
			}else if(reserveList.contains(num+1)) {
				reserveList.remove(num+1);
			}else {
				answer--;
			}
		}
		System.out.println(answer);
//		for(int i:lost) {
//			if(lostList.contains(i)) {
//				if(reserveList.contains(i-1)) {
//					reserveList.remove(i-1);
//				}else if(reserveList.contains(i+1)) {
//					reserveList.remove(i+1);
//				}else {
//					answer--;
//				}
//			}
//		}
	}

}
