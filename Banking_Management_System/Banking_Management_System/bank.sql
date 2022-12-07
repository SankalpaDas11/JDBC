use mydb;
create table bank(
acc_no integer primary key auto_increment,
acc_holder varchar(20) not null,
ifsc_code varchar(20) unique not null,
branch varchar(10),
acc_type varchar(10),
balance numeric(12,2) check(balance >1999),
pin numeric(4) unique not null
);
Update bank set balance = balance+100 where pin =1234;
select * from bank where pin=1234;
delete from bank where acc_no = 121 and pin = 2345;
select * from bank;
select * from bank;
select * from bank where acc_no= 110 and pin = 1234 and ifsc_code='BKID001';