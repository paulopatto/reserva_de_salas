package gaba.model;
///   vim: ft=java

class Admin extends Person{

  public boolean verifyPayment(int schedule_id){
    /// Procurar o Schedule
    schedule = Schedule.find(schdule_id);
    return schedule.status;
  }

  // TODO: Mudar o ST_SCHEDULE
  public changeStatusSchedule(int schedule_id, ST_SCHEDULE){
    s = Schuedule.find(schedule_id);
    s.setStatus(ST_SCHEDULE);
  }
}
