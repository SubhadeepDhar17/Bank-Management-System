create database bankManagemnetSystem;
show databases;
use bankManagemnetSystem;

create table signUp(formNo varchar(30), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), mStatus varchar(20), address varchar(40), state varchar(25), city varchar(25), pin varchar(20));
select * from signUp;

create table signUpTwo(formNo varchar(20), religion varchar(10), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(10), aadhar varchar(12), sStatus varchar(8), accStatus varchar(8));
select * from signUpTwo;

create table signUpThree(formNo varchar(20), accType varchar(20), cardNo varChar(16), pinNo varchar(4), services varChar(100));
alter table signUpThree MODIFY column cardNo varchar(20); 
alter table signUpThree MODIFY column pinNo varchar(10);
alter table signUpThree add column accNo varchar(20);
select * from signUpThree;

create table logIn(formNo varchar(20), cardNo varchar(20), pinNo varchar(10));
alter table logIn add column accNo varchar(20);
select * from login;

create table bank(pinNo varchar(10), date varchar(20), type varchar(20), amount varchar(20));
alter table bank modify column date varchar(50);
select * from bank;