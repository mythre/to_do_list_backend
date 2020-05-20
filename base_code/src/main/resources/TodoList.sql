create database TodoList;
create table login( userId serial PRIMARY KEY ,username varchar(50) UNIQUE NOT NULL ,password varchar(50) NOT NULL );

CREATE TABLE tasks
(
    taskId integer NOT NULL PRIMARY KEY ,
    taskItem text NOT NULL,
    createdDate timestamp without time zone,
    modifiedDate timestamp without time zone,
    completed boolean default FALSE,
    userId serial,
    CONSTRAINT tasks_useId_fkey FOREIGN KEY (userId)
        REFERENCES login (userId) MATCH SIMPLE
        ON UPDATE NO ACTION ON DELETE NO ACTION
);
