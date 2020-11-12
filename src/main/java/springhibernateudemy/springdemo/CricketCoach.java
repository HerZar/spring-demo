package springhibernateudemy.springdemo;

public class CricketCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	private String email;
	private String team;

	public CricketCoach() {
		System.out.println("chricket Coach: inside no arg contructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("chricket Coach: inside setter method - setFornumeService");
		this.fortuneService = fortuneService;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("chricket Coach: inside set email ");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("chricket Coach: inside seter team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "pegale a la pelota";
	}

	@Override
	public String getDailyFortune() {
		return "good " + fortuneService.getFortune();
	}



}
