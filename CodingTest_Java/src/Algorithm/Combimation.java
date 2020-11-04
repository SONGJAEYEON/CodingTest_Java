package Algorithm;

import java.util.Arrays;

public class Combimation {
	static int[] arr= { 1, 2, 3, 4, 5 };
	
	public static void main(String[] args) {
//		int[] arr = {1, 3, 5, 7, 9};
//		int n = arr.length;
//		int r = 3;
//		// 크기가 5인 수열 arr에서 r인 3r개를 뽑은 경우를 출력한다. 
//		int[] combArr = new int[n]; // 뽑은 원소의 인덱스를 저장하는 배열 
//		
//		doCombination(combArr, n, r, 0, 0, arr);
//		System.out.println(Arrays.toString(combArr));
////		https://limkydev.tistory.com/178
		int n=3;
		int r=2;
        //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
        System.out.println("***중복조합(0,1,2)***");
        int[] reComArr = new int[r];
        int[] comArr = new int[r];
        reCombination(comArr, n, r, 0, 0);
	}
//	https://seungahyoo.tistory.com/76
	public static void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr) {
		if(r == 0) {
			// 다 뽑았을 때 
			for(int i=0; i<index; i++)
				System.out.print(arr[combArr[i]] + " ");
			System.out.println();
		} else if (target == n) 
			return;
			//r개를 다 못뽑았는데 arr의 모든 원소를 다 검사했을 때, 실패 -> 아무것도 안하고 끝난다. 
		else {
			combArr[index] = target;
			doCombination(combArr, n, r-1, index+1, target+1, arr); // (i) 원소를 뽑는 경우 
			doCombination(combArr, n, r, index, target+1, arr); // (ii) 원소를 안뽑는 경우 
		}
	}
    //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
//	https://limkydev.tistory.com/178
    private static void reCombination(int[] reComArr, int n, int r, int index, int target) {
        if(r==0){
            for(int i : reComArr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }       
        if(target == n)return;
         
        reComArr[index] = target;
        reCombination(reComArr, n, r-1, index+1, target);//뽑는경우
        reCombination(reComArr, n, r, index, target+1);//안뽑는경우
         
    }

	
}
