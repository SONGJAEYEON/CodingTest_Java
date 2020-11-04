package Programmers.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class programmers_다리를지나는트럭_Lv2 {
	
	public static void main(String[] args) {
		int[] truck_weight= {7,4,5,6};
		int bridge_length=2;
		int weight=10;
		int time=0;
		int total=0;
		Queue<Integer> bridge= new LinkedList<Integer>();
		for(int truck:truck_weight) {
			while(true) {
				if(bridge.isEmpty()) {
					bridge.add(truck);
					time++;
					total+=truck;
					System.out.println(bridge);
					break;
				}else if(bridge.size()==bridge_length){
					System.out.println("모르겠얼,,,"+bridge);
					total-=bridge.poll();
					//아니 도대체 이 부분이 왜 있는지 도저히 모르겠어,,아 맨앞에꺼 빼주네?
				}else{
					if(truck<=weight-total) {
						bridge.add(truck);
						System.out.println(bridge);
						total+=truck;
						time++;
						break;
					}else {
						bridge.add(0);
						System.out.println(bridge);
						time++;
					}
				}
			}
		}
		System.out.println();
		System.out.println(bridge);
		System.out.println(time+bridge_length);
	}
}
