create table departments
(
    department_id   int primary key,
    department_name varchar(50)
);

CREATE TABLE employees
(
    employee_id   INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id)
    REFERENCES departments (department_id)
);

CREATE TABLE projects
(
    project_id   INT PRIMARY KEY,
    project_name VARCHAR(50)
);

CREATE TABLE employee_projects
(
    employee_id INT,
    project_id  INT,
    FOREIGN KEY (employee_id) REFERENCES employees (employee_id),
    FOREIGN KEY (project_id) REFERENCES projects (project_id)
);

select * from departments d;
select * from employee_projects ep;
select * from employees e;
select * from projects p;

insert into departments (department_id, department_name)
values (1, 'Software Engineering'),
       (2, 'Hardware Engineering'),
       (3, 'Logistic'),
       (4, 'Testing');

insert into projects (project_id, project_name)
values (1, 'API development with Spring Boot'),
       (2, 'Assembling of 100 PCs'),
       (3, 'Developing of Tekwil Iphone App');

insert into employees (employee_id, employee_name, department_id)
values (1, 'Serghei Petuhov', 1),
       (2, 'Maxim Kolenkov', 2),
       (3, 'Bob Marley', 4),
       (4, 'Anton Solenkov', null),
       (5,'Nikolaj Melnikov',1),
       (6,'Olga Saharova',1);

insert into employee_projects (employee_id, project_id)
values (1, 1),
       (2, 2),
       (3, 3);
--a.
select e.employee_name, d.department_name
from employees e
inner join departments d on e.department_id = d.department_id;
--b.
select *
from employees
where department_id = null;
--c.
select p.project_name, e.employee_name
from projects p
inner join employee_projects ep on p.project_id = ep.project_id
inner join employees e on ep.employee_id = e.employee_id;
--d.
select e.employee_name, d.department_name
from employees e
left join departments d on e.department_id = d.department_id;
--e.
select count(e.employee_name) as software_engineering_employees_number
from employees e
inner join departments d on e.department_id = d.department_id
where department_name = 'Software Engineering';

select count(e.employee_name) as hardware_engineering_employees_number
from employees e
inner join departments d on e.department_id = d.department_id
where department_name = 'Hardware Engineering';

select count(e.employee_name) as logistic_employees_number
from employees e
inner join departments d on e.department_id = d.department_id
where department_name = 'Logistic';

select count(e.employee_name) as testing_employees_number
from employees e
inner join departments d on e.department_id = d.department_id
where department_name = 'Testing';