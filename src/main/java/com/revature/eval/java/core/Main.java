package com.revature.eval.java.core;

import com.revature.eval.java.core.EvaluationService.RotationalCipher;

public class Main {
	public static void main (String [] args) {
		//Total: 9/20
		//1,2,3,5
		EvaluationService test =  new EvaluationService();
		//
		System.out.println(test.acronym("First In, First Out"));
		System.out.println(test.calculateNthPrime(8));
		//4.
		System.out.println(test.getScrabbleScore("quirky-HI"));
		//
		System.out.println(test.toPigLatin("quick fast run"));
		//9.
		System.out.println(test.isArmstrongNumber(153));
		//11.
		RotationalCipher p = new RotationalCipher(13) ;
		System.out.println(p.rotate("n"));
		//16.
		System.out.println(test.isPangram("five boxing wizards jump quickly at it"));
		//18.
		System.out.println();
		//19.
		int set [] = {4,6};
		System.out.println(test.isLuhnValid("046 454 286"));
		//20.
		System.out.println(test.solveWordProblem("What is 1 plus 10?"));
	}
}
