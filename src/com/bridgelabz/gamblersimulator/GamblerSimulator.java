package com.bridgelabz.gamblersimulator;

import java.util.Random;

public class GamblerSimulator {

	public static int winOrLoose() {
        Random ran=new Random();
          int num=ran.nextInt();
          return num;

	}
	public static void main(String[] args) {
		final int stake=100;
		final int bets=1;
		if(winOrLoose()==1) {
			System.out.println("gambler is win the game");
		}else {
			System.out.println("gambler is loose the game");
		}

	}

}
