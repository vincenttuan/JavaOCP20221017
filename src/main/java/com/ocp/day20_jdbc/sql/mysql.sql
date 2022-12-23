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
    dept_id int,
    primary key(id),
    foreign key(dept_id) references department(id)
);


