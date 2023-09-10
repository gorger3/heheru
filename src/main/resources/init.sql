create user gorger with password 'gorger';
create database heheru with owner gorger;

\c heheru

create table resumes
(
    id serial primary key,
    full_name text
);

alter table resumes owner to gorger;