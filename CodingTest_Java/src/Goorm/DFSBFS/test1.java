package Goorm.DFSBFS;

import java.util.Arrays;

public class test1 {
 public static void main(String[] args) {
	 int numOfAllPlayers=6;//게임에 참여하는 사람의 수
	 int numOfQuickPlayers=2;//달리기가 빨라 술래에 절대 걸리지 않는 사람의 수
	 char[] nameOfQuickPlayers= {'B','C'};// 달리기가 빨라 술레에 절대 걸리지 않는 사람들의 이름/ 이거 스테틱으로 빼도 되겠다,,
//	 'B','D','I','M','P'
	 int numOfGames=2;// 게임 진행 횟수
	 int[] numOfMovesPerGame= {3,-2};// 게임 진행 횟수 만큼 술래가 수건을 내려놓기 위해 이동하는 칸 수
//	 3,-4,5,6,-7,-8,10,-12,-15,-20,23 나누기로 인덱스 랄랄라 해볼까?! 
	 String quickPlayer=new String(nameOfQuickPlayers);
	 int[] score=new int[numOfAllPlayers];
	 for (int i = 0; i < score.length; i++)	score[i]=(i==0?1:0);
	 System.out.println(Arrays.toString(score));
	 
	 int seat=numOfAllPlayers-1;//좌석의 수 
	 String[] players=new String[seat];
	 for (int i = 0; i < players.length; i++) {
		players[i]=String.valueOf((char)('A'+(i+1)));
	}
	 System.out.println(Arrays.toString(players));
	 char nowName='A';
	 int nowPlayerIdx=0;//현재 술래의 인덱스
	 int nowPositionIdx=0;//현재 술래 위치의 인덱스 
	 for (int i = 0; i < numOfGames; i++) {
		//맨처음에 
		 if(quickPlayer.contains(players[nowPositionIdx+numOfMovesPerGame[i]])) {
			 //만약에 지금 하는애가 quick 플레이어라면! 
			 //현재 
		 }
		 
	}
	 
	 
	 
//	 수건돌리기!!
//	 6
//	 2
//	 B C
//	 2
//	 3 -2
//	 
//	 B 0
//	 C 0
//	 D 0
//	 A 1
//	 F 0
//	 E 2
//	 
//	 17
//	 5
//	 B D I M P
//	 11
//	 3 -4 5 6 -7 -8 10 -12 -15 -20 23
//	 
//	 
//	 B 0
//	 C 0
//	 D 0
//	 L 1
//	 Q 1
//	 A 3
//	 F 2
//	 I 0
//	 J 0
//	 G 1
//	 K 1
//	 M 0
//	 N 0
//	 H 1
//	 P 0
//	 E 1
//	 O 1
}

private static String String(char[] nameOfQuickPlayers) {
	// TODO Auto-generated method stub
	return null;
}
}
