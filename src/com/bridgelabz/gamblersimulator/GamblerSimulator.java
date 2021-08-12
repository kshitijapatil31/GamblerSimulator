package com.bridgelabz.gamblersimulator;

import java.util.Random;

public class GamblerSimulator {
	static int stake = 100;
	static final int bets = 1;
	static int flag = 0;
	static int noOfDays = 20;

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

	public static void main(String[] args) {

		cumulativeStake();
	}

}
