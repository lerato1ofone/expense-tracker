DROP DATABASE expensetrackerdb;
DROP USER expensetracker;
CREATE USER expensetracker WITH PASSWORD 'password' CREATEDB;
CREATE DATABASE expensetrackerdb WITH template=template0 owner=expensetracker;
\connect expensetrackerdb;
ALTER default privileges grant all on tables to expensetracker;
ALTER default privileges grant all on sequences to expensetracker;

CREATE TABLE et_users(
user_id integer primary key not null,
first_name varchar(20) not null,
last_name varchar(20) not null,
email varchar(30) not null,
password text not null
);

CREATE TABLE et_categories(
category_id integer primary key not null,
user_id integer not null,
title varchar(20) not null,
description varchar(50) not null
);
ALTER table et_categories add constraint cat_users_fk
foreign key (user_id) references et_users(user_id);

CREATE TABLE et_transactions(
transaction_id integer primary key not null,
category_id integer not null,
user_id integer not null,
amount numeric(10,2) not null,
note varchar(50) not null,
transaction_date bigint not null
);
ALTER TABLE et_transactions add constraint trans_cat_fk
foreign key (category_id) references et_categories(category_id);
alter table et_transactions add constraint trans_users_fk
foreign key (user_id) references et_users(user_id);

CREATE sequence et_users_seq increment 1 start 1;
CREATE sequence et_categories_seq increment 1 start 1;
CREATE sequence et_transactions_seq increment 1 start 1000;