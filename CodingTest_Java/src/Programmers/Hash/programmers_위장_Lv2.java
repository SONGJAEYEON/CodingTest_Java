package Programmers.Hash;

import java.util.HashMap;
import java.util.Iterator;

public class programmers_위장_Lv2 {
	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"},
					{"blue_sunglasses", "eyewear"},
					{"green_turban", "headgear"}};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < clothes.length; i++) {
			if(map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1], map.get(clothes[i][1])+1);
			}else {
				map.put(clothes[i][1], 1);
			}
		}
		int answer=1;
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key=keys.next();
			answer*=map.get(key)+1;
		}
//		System.out.println(answer-1);
	}	
}
