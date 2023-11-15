create table students(
                         studentID int,
                         name text,
                         surname text,
                         age int,
                         sex text
);

insert into students (studentID, name, surname, age, sex)
values
    (1,'Alice','Smith',20,'Female'),
    (2,'Bob','Johnson',22,'Male'),
    (3,'Charlie','Brown',19,'Male'),
    (4,'Diana','Lee',21,'Female'),
    (5,'Emily','Davis',23,'Female');

--1.
update students
set age=24
where name='Emily';

--2.
delete from students
where surname='Brown';

--3.
select name, surname, age from students
where sex='Female';

--4.
select name, surname from students
where surname like 'C%';

select * from students;