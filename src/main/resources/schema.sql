-- bookApp

create table if not exists book (
    book_id bigserial primary key,
    book_name varchar(256) not null,
    genre_id int not null,
    author_id int not null,
    public_date date not null
    
);

create table if not exists author (
    author_id bigserial primary key,
    first_name varchar(100) not null,
    middle_name varchar(100),
    last_name varchar(100) not null,
    birth_date date not null,
    country varchar(100) not null
);

create table if not exists genre (
    genre_id bigserial primary key,
    genre_name varchar(256) not null
);

truncate table genre restart identity cascade;
truncate table author restart identity cascade;
truncate table book restart identity cascade;


