package me.recontact.primeFactors;

public class Calcul {
	
	private static String answer;
	private static int restToReduce;
	private static int nextPrimeNumberToTry;

	public static String showPrimeFactors(int number) {
		if(number <= 1) return number+"";
		initialize(number);
		while(nextPrimeNumberToTry <=(Math.sqrt(restToReduce))){
			decomposeBy(nextPrimeNumberToTry);
			nextPrimeNumberToTry++;
		}
		return displayResult();
	}

	private static void decomposeBy(int primeNumber){
		while (restToReduce % primeNumber == 0 && restToReduce > primeNumber) {
			restToReduce = restToReduce/primeNumber;
			answer += primeNumber+"x";			
		}
	}
	
	private static void initialize(int number) {
		restToReduce = number;
		answer = "";
		nextPrimeNumberToTry = 2;
	}
	
	private static String displayResult() {
		return answer + ((restToReduce == 1) ?  null : restToReduce);
	}
}