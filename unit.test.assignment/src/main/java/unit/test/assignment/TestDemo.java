package unit.test.assignment;

import java.util.Random;

public class TestDemo {
	
	public int addPositive (int a, int b) {
		if (a+b > 1) {
			return a+b;
		}
		
		throw IllegalAccessException {
			 System.out.println("Both parameters must be positive!");
		}
	
	}
	int randomNumberSquared() {
		
		return getRandomInt()*getRandomInt();
	}

	int getRandomInt() {
		Random random = new Random();
		
		return random.nextInt(10) + 1;
	}

}
