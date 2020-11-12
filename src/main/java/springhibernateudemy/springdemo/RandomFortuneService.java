package springhibernateudemy.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Corre",
			"has encontrado al amor de tu vida",
			"mala suerte e infortunion te acompañaran por el resto de tu miserable vida."
			
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		return data[myRandom.nextInt(data.length)];
	}

}
