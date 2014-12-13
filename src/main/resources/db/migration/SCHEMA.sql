CREATE ROLE groom WITH createdb login encrypted password 'gaba';

CREATE DATABASE groom owner groom;

\connect groom;

CREATE TABLE people (
	id SERIAL PRIMARY KEY NOT NULL,
	name varchar(100),
	email varchar(70),
	password varchar(20),
	mobile varchar(30),
	type varchar(50),
	created_at timestamp DEFAULT localtimestamp,
	updated_at timestamp DEFAULT localtimestamp,
  CHECK(type IN ('Costumer', 'Hostess', 'Admin', 'Guest'))
);

CREATE TABLE rooms (
	id SERIAL PRIMARY KEY NOT NULL,
	label varchar(140),
	created_at timestamp DEFAULT localtimestamp,
	updated_at timestamp DEFAULT localtimestamp
);

CREATE TABLE schedules (
	id SERIAL PRIMARY KEY NOT NULL,
	status        boolean,
	input  timestamp  NOT NULL,
	output timestamp  NOT NULL,
	person_id     integer,
	room_id       integer,
	created_at timestamp DEFAULT localtimestamp,
	updated_at timestamp DEFAULT localtimestamp,
  FOREIGN KEY(person_id) REFERENCES people(id),
  FOREIGN KEY(room_id) REFERENCES rooms(id)
);

