package springhibernateudemy.springdemo;

public class FootballCoach implements Coach{

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for the dependency injection
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "patea 100 tiros al arco";
	}

	@Override
	public String getDailyFortune() {
		return "Messi " + fortuneService.getFortune();
	}

}
