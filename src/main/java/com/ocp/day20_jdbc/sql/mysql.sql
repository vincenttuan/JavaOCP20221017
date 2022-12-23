use mydb;
-- 刪除資料表
drop table employee;
drop table department;
-- 建立資料表
create table department(
    id int not null generated always as identity,
    name varchar(50) not null,
    primary key(id)
);

create table employee(
    id int not null generated always as identity,
    name varchar(50) not null,
    salary int,
    dept_id int not null,
    primary key(id),
    foreign key(dept_id) references department(id)
);
-- 建立紀錄
insert into department(name) values('IT');
insert into department(name) values('Sales');
insert into employee(name, salary, dept_id) values('John', 55000, 1);
insert into employee(name, salary, dept_id) values('Mary', 65000, 2);
insert into employee(name, salary, dept_id) values('Jack', 75000, 1);


