CREATE TABLE `persons` (
  id       int  not null,
  name     text not null,
  email    text not null,
  mobile   text not null,
  password text not null,
  type    varchar(15) check (type in ('Admin', 'Hostess', 'Costumer')),
  created_at datetime,
  updated_at datetime
);
