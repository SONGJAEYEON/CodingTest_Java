package Programmers.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class programmers_베스트앨범_Lv3 {
	public static void main(String[] args) {
		String[] genres= {"classic", "pop", "classic", "classic", "pop"};
		int[] plays= {500, 600, 150, 800, 2500};
		//삽고수인듯,,,
//		https://sooooooyn.tistory.com/65
        HashMap<String, Integer> g1 = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            g1.put(genres[i], g1.getOrDefault(genres[i], 0) + plays[i]);
        }

        TreeMap<Integer, String> g2 = new TreeMap<>(Collections.reverseOrder());
        g1.forEach((k, v) -> g2.put(v, k));

        ArrayList<Integer> answer2 = new ArrayList<>();

        // 여기 for문에서는 가장 많이 나오는 장르부터 돈다
        for (String genre : g2.values()) {
            ArrayList<Integer> temp = new ArrayList<>();    // 장르에 해당하는 곡 번호가 담김
            for (int i = 0; i < genres.length; i++) {
                if (!genres[i].equals(genre)) continue;

                temp.add(i);
            }

            Collections.sort(temp, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (plays[o1] == plays[o2]) {
                        return Integer.compare(o1, o2);
                    }
                    else {
                        return Integer.compare(plays[o2], plays[o1]);
                    }
                }
            });
            answer2.add(temp.get(0));
            if (temp.size() > 1) {
                answer2.add(temp.get(1));//아,,, 이경우를 생각을 못했네,,, 
            }
        }

        int[] answer = new int[answer2.size()];
        for (int i = 0; i < answer2.size(); i++) {
            answer[i] = answer2.get(i);
        }
//        return answer;
        System.out.println(answer);
	}
}
