create user gorger with password 'gorger';
create database heheru with owner gorger;

\c heheru

create table resumes
(
    id serial primary key,
    full_name text
);

alter table resumes owner to gorger;

create table contacts
(
    id serial primary key,
    resume_id integer,
    type text,
    value text,
    foreign key (resume_id) references resumes (id)
);
-- Нельзя просто добавить on DELETE cascade.
-- Сначала нужно изменить таблицу, удалив CONSTRAINT.
ALTER TABLE contacts
    drop CONSTRAINT contacts_resume_id_fkey;
-- Потом опять изменить таблицу, добавив CONSTRAINT с on DELETE cascade.
alter table contacts
    add constraint contacts_resume_id_fkey
        foreign key (resume_id)
            references resumes (id)
            on DELETE cascade;
