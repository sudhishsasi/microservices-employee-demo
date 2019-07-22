drop table T_EMPLOYEE if exists;

create table T_EMPLOYEE (ID bigint identity  primary key, 
                        NAME varchar(50) not null, AGE int  not null, DOB varchar(20) not null, SEX varchar(20)  not null);
                        
