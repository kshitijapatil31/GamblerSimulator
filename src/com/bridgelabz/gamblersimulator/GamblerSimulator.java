package com.bridgelabz.gamblersimulator;

import java.util.Random;
import java.util.Scanner;

public class GamblerSimulator {
	static int stake = 100;
	static final int bets = 1;
	static int flag = 0;
	static int noOfDays = 20;
	static int loosingAmount = (int) Math.round(stake*0.5);
	static int winningAmount = (int) Math.round(stake+(stake*0.5));

	
	
	public static void winOrLoose() {
		Random ran = new Random();
		int num = ran.nextInt(2);

		if (num == 1) {
			System.out.println("gambler is win the game");
			stake++;
		} else {
			System.out.println("gambler is loose the game");
			stake--;
		}

	}

	public static void cumulativeStake() {
		int winningAmount = (int) ((int) stake + (0.5 * stake));
		int loosingAmount = (int) ((int) stake - (0.5 * stake));
		// int winninCash=Math.random();
		//winOrLoose();
		for (int i = 1; i < noOfDays; i++) {
			winOrLoose();
			while (flag == 0) {
				if (stake == winningAmount) {
					System.out.println(i+winningAmount);
					
					flag++;
				}
				if (stake == loosingAmount) {
					System.out.println(i+winningAmount);
					flag++;
				}
			}
		}
	}
	public static void wonOrLoseAmount() {
		Scanner sc=new Scanner(System.in);
		int  m=sc.nextInt();
	int wCount=0,lCount=0;
	cumulativeStake();
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
			int days=31;
		for(int i=1;i<days;i++) {
			if (stake == winningAmount) {
				System.out.println(i+(winningAmount-stake));
				wCount++;
				flag++;
			}
			if (stake == loosingAmount) {
				System.out.println(i+(stake-loosingAmount));
				lCount++;
				flag++;
			}
		}
		}else if(m==2||m==4||m==6||m==9||m==11){
			int days=30;
			for(int i=1;i<days;i++) {
				if (stake == winningAmount) {
					System.out.println(i+(winningAmount-stake));
					wCount++;
					flag++;
				}
				if (stake == loosingAmount) {
					System.out.println(i+(stake-loosingAmount));
					lCount++;
					flag++;
				}
		}
			
		}
		System.out.println("no of days win :"+wCount);
		System.out.println("no of days lose :"+lCount);
	}
		
	


	public static void main(String[] args) {

		//cumulativeStake();
		wonOrLoseAmount();
		
	}

}
