package springhibernateudemy.springdemo;

public class TrackCoach implements Coach {

	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		super();
	}

	// define a constructor for the dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}

}
