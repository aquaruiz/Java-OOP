package mankind;

import java.text.DecimalFormat;

public class Worker extends Human {
	private final int workDays = 7;
	private double weekSalary; // for 7 days
	private double workHoursPerDay;
	
	public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) throws Exception {
		super(firstName, lastName);
		this.setWeekSalary(weekSalary);
		this.setWorkHoursPerDay(workHoursPerDay);
	}

	@Override
    protected void setLastName(String lastName) throws Exception {
        if (lastName.length() < 4) {
            throw new Exception("Expected length more than 3 symbols!Argument: lastName");
        }
        
        super.setLastName(lastName);
	}
	
	public double getWeekSalary() {
		return weekSalary;
	}
	
	public int getWorkDays() {
		return workDays;
	}
	
	public double getWorkHoursPerDay() {
		return workHoursPerDay;
	}
	
	private void setWeekSalary(double weekSalary) throws Exception {
		if (weekSalary <= 10) {
			throw new Exception("Expected value mismatch!Argument: weekSalary");
		}
		
		this.weekSalary = weekSalary;
	}
	
	private void setWorkHoursPerDay(double workHoursPerDay) throws Exception {
		if (workHoursPerDay < 1 
				|| workHoursPerDay > 12) {
			throw new Exception("Expected value mismatch!Argument: workHoursPerDay");
		}
		this.workHoursPerDay = workHoursPerDay;
	}
	
	private double calcSalaryPerHour() {
		return this.weekSalary / this.workHoursPerDay / workDays;
	}
	@Override
	public String toString() {
		DecimalFormat moneyFormat = new DecimalFormat("0.00");
		return super.toString()
				+ String.format("%nWeek Salary: %s"
						+ "%nHours per day: %s"
						+ "%nSalary per hour: %s",
						moneyFormat.format(this.weekSalary),
						moneyFormat.format(this.workHoursPerDay),
						moneyFormat.format(this.calcSalaryPerHour()));
	}
}