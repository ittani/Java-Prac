create table course
(
	id bigint not null,
	name varchar(255) not null,
	employeeID varchar(255) not null,
	primary key (id)

);

create table employee
(
    id bigint not null,   -- Use identity for auto-incrementing
    name varchar(255) not null,
    employeeID varchar(255) not null,
    primary key (id)
);

create table Student
(
id bigint not null,
name varchar(255) not null,
StudentId varchar(255) not null,
location varchar(255) not null,
primary key(id)
);