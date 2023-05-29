create table Student{
(
    id bigint NOT NULL,
    name varchar(200) NOT NULL,
    address varchar(200) NOT NULL,
    primary key (id)
)};

create table Customer{
(
    id bigint NOT NULL,
    name varchar(200) NOT NULL,
    payment_type varchar(200) NOT NULL,
    payment_amount varchar(200) NOT NULL,
    primary key (id)
)};