//package FootballTeamGenerator;

public class Player {
	String name;
	int endurance;
	int sprint;
	int dribble;
	int passing;
	int shooting;
	
	public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) throws Exception {
		setName(name);
		setEndurance(endurance);
		setSprint(sprint);
		setDribble(dribble);
		setPassing(passing);
		setShooting(shooting);
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) throws Exception {
		if (name == null ||
				name.trim().isEmpty()){
			throw new Exception("A name should not be empty.");
		}
		
		this.name = name;
	}
	
	public int getEndurance() {
		return endurance;
	}
	
	private void setEndurance(int endurance) throws Exception {
		if (endurance < 0 || endurance > 100) {
			throw new Exception("Endurance should be between 0 and 100.");
		}
		
		this.endurance = endurance;
	}
	
	public int getSprint() {
		return sprint;
	}
	
	private void setSprint(int sprint) throws Exception {
		if (sprint < 0 || sprint > 100) {
			throw new Exception("Sprint should be between 0 and 100.");
		}
		
		this.sprint = sprint;
	}
	
	public int getDribble() {
		return dribble;
	}
	
	private void setDribble(int dribble) throws Exception {
		if (dribble < 0 || dribble > 100) {
			throw new Exception("Dribble should be between 0 and 100.");
		}
		
		this.dribble = dribble;
	}
	
	public int getPassing() {
		return passing;
	}
	
	private void setPassing(int passing) throws Exception {
		if (passing < 0 || passing > 100) {
			throw new Exception("Passing should be between 0 and 100.");
		}
		
		this.passing = passing;
	}
	
	public int getShooting() {
		return shooting;
	}
	
	private void setShooting(int shooting) throws Exception {
		if (shooting < 0 || shooting > 100) {
			throw new Exception("Shooting should be between 0 and 100.");
		}
		
		this.shooting = shooting;
	}
	
	public double overallSkillLevel() {
		double totalStats = 0;
		totalStats += this.getEndurance();
		totalStats += this.getDribble();
		totalStats += this.getSprint();
		totalStats += this.getPassing();
		totalStats += this.getShooting();
		
		return totalStats / 5;
	}
}
