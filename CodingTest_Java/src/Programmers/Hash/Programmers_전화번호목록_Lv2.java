package Programmers.Hash;
public class Programmers_전화번호목록_Lv2 {

	public static void main(String[] args) {
		String[] phone_book= {"119", "97674223","119456789"};
		boolean answer=true;
		for(int i=0;i<phone_book.length;i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if(i!=j && phone_book[i].startsWith(phone_book[j])) {
					answer=false;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}


