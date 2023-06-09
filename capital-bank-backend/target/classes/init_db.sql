create table `users` (
    `id` int not null auto_increment,
    `username` varchar(45) not null,
    `password` varchar(45) not null,
    `enabled` int not null,
    primary key (`id`)
);
create table `authorities` (
    `id` int not null auto_increment,
    `username` varchar(45) not null,
    `authority` varchar(45) not null,
    primary key (`id`)
);

create table `authorities` (
   `id` int not null auto_increment,
   `email` varchar(45) not null,
   `password` varchar(45) not null,
   `role` varchar(45) not null,
   primary key (`id`)
);


insert into `customer` (`email`,`password`,`role`) values ('ahmed@gmail.com', 'pass123', 'admin');