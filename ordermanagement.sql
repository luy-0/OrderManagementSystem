drop database if exists ordermanagement;
create database ordermanagement;
use ordermanagement;
create table manager(
manager_id int not null auto_increment,
manager_name varchar(30) not null,
manager_password varchar(20) not null,
manager_address varchar(100),
primary key(manager_id)
);

create table employee(
employee_id int not null auto_increment,
employee_name varchar(30) not null,
employee_password varchar(20) not null,
employee_address varchar(100),
primary key(employee_id)
);

create table merchant(
merchant_id int not null auto_increment,
merchant_name varchar(30) not null,
merchant_password varchar(20) not null,
merchant_address varchar(100),
primary key(merchant_id)
);

create table dish(
dish_id int not null auto_increment,
dish_name varchar(30) not null,
dish_photo_url varchar(200),
unit_price numeric(12,2),
discount_price numeric(12,2),
is_discount bool,
primary key(dish_id),
constraint check_unit_price check(unit_price>=0),
constraint check_discount_price check(discount_price>=0)
);

create table menu(
menu_id int not null auto_increment,
menu_name varchar(20) not null,
merchant_id int,
primary key(menu_id),
foreign key(merchant_id) references merchant(merchant_id)
);

create table menu_has_dishes(
menu_id int,
dish_id int,
foreign key(menu_id) references menu(menu_id),
foreign key(dish_id) references dish(dish_id)
);

create table order0(
order_id int not null auto_increment,
employee_id int not null,
merchant_id int not null,
total_price numeric(12,2),
order_state int,
destitation varchar(100) not null,
primary key(order_id),
foreign key(employee_id) references employee(employee_id),
foreign key(merchant_id) references merchant(merchant_id),
constraint check_total_price check(total_price>=0)
);

create table order_has_dishes(
order_id int,
dish_id int,
foreign key(order_id) references order0(order_id),
foreign key(dish_id) references dish(dish_id)
);

create table bill(
bill_id int not null auto_increment,
order_id int,
primary key(bill_id),
foreign key(order_id) references order0(order_id)
);

create table complaint(
complaint_id int not null auto_increment,
content text,
is_handled bool,
result text,
manager_id int,
employee_id int,
merchant_id int,
primary key(complaint_id),
foreign key(manager_id) references manager(manager_id),
foreign key(employee_id) references employee(employee_id),
foreign key(merchant_id) references merchant(merchant_id)
);





