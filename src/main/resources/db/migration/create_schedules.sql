CREATE TABLE `schedules` (
  id  integer,
  status boolean,
  period_in  datetime,
  period_out datetime,
  room_id integer,
  person_id integer,
  created_at datetime,
  updated_at datetime
);
