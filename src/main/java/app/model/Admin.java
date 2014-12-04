package app.model;
///   vim: ft=java

public class Admin extends Person{
	
	public Admin(){ this.type = "Admin"; }

  public boolean verifyPayment(int scheduleId){
    /// Procurar o Schedule
    Schedule schedule = Schedule.find(scheduleId);
    return schedule.getStatus();
  }

  // TODO: Mudar o ST_SCHEDULE
  public void changeStatusSchedule(int scheduleId, boolean status){
    Schedule s = Schedule.find(scheduleId);
    s.setStatus((boolean) status);
  }

}
