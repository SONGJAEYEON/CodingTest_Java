package Programmers.BruteForce;

import java.util.HashSet;


public class Programmers_소수찾기_Lv2 {
	
	public static void main(String[] args) {
		String numbers="1234";
		HashSet<Integer> set = new HashSet<Integer>();
		permutation("",numbers,set);
		int cnt=0;
		while(set.iterator().hasNext()) {
			int a= set.iterator().next();
			set.remove(a);
			if(a==2) cnt++;
			if(a%2!=0 && isPrime(a)) {
				cnt++;
			}
		}
//		return cnt;
		
	}
	public static boolean isPrime(int n) {
		if(n==0 || n==1) return false;
		for(int i=3;i<=(int)Math.sqrt(n);i+=2) {
			if(n%i==0)return false; //왜 2가 아니고 3이지,,? 
			//애초에 짝수 거르는 건가봄,,ㅎ
			//어쨋든 나누어 떨어지면 소수가 합성수이니까 바로 false ㄱㄱ!! 
		}
		return true;
	}
	public static void permutation(String prefix,String str, HashSet<Integer> set) {
		int n=str.length();
		if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
		for(int i=0;i<n;i++)
			permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n),set);
	}
	
	
//################################################################################3	
//	public static void main(String[] args) {
//		ArrayList<Integer> primeList=new ArrayList<Integer>();
//		primeNumber(9999999, primeList);
//		String numbers="011";
//		String[] strList=numbers.split("");
//        LinkedList<Integer> perArr = new LinkedList<Integer>(); 
//        ArrayList<String[]> perList = new ArrayList<String[]>();
//        int[] perCheck = new int[strList.length];
//        for(int i=1;i<=perCheck.length;i++) {
//        	permutations(strList,strList.length,i, perArr, perCheck,perList);
//        }
//        ArrayList<Integer> containChk=new ArrayList<Integer>();
//        for(String[] arr:perList) {
//        	String number="";
//			for(String s:arr) {
//				number+=s;
//			}
//			int num=Integer.parseInt(number);
//			if(!containChk.contains(num) && primeList.contains(num)) {
//				containChk.add(num);
//			}
//        }
//        System.out.println(containChk);
//	}
//	private static void permutations(String[] strList,int n,int r,LinkedList<Integer>perArr,int[]perChk,ArrayList<String[]> perList) {
//		String[] answer= new String[perArr.size()];
//		int j=0;
//		if(perArr.size()==r) {
//			for(int i:perArr) {
////				System.out.print(strList[i]+" ");
//				answer[j]=strList[i];
//				j++;
//			}
//			perList.add(answer);
//			return;
//		}
//		
//		for(int i=0;i<n;i++) {
//			if(perChk[i]==0) {
//				perArr.add(i);
//				perChk[i]=1;
//				permutations(strList,n, r, perArr, perChk,perList);
//				perChk[i]=0;
//				perArr.removeLast();
//			}
//		}
//	}
//	private static void combinations(int[] combArr,int n,int r,int idx,int target,String[] strList,ArrayList<String[]> combList) {
//		String[] answer= new String[idx];
//		if(r==0) {
//			for(int i=0;i<idx;i++) {
//				answer[i]=strList[combArr[i]];
////				System.out.print(strList[combArr[i]]+" ");
//			}
////			System.out.println();
//			combList.add(answer);
//			return;
//		}
//		else if(target==n) {
//			return;
//		}else {
//			combArr[idx]=target;
//			combinations(combArr, n, r-1, idx+1, target+1, strList,combList);
//			combinations(combArr, n, r, idx, target+1, strList,combList);
//		}
//	}
//	
//	private static void primeNumber(int n,ArrayList<Integer> primeNumber) {
//		boolean[] primeChk=new boolean[n+1];
//		
//		for(int i=2;i<primeChk.length;i++) {
//			for(int j=i+i;j<primeChk.length;j+=i) {
//				if(primeChk[j]==false) primeChk[j]=true;
//			}
//		}
//		for(int i=2;i<n+1;i++) {
//			if(primeChk[i]==false) primeNumber.add(i);
//		}
//	}
}
