/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/3/3 16:05:04                            */
/*==============================================================*/


drop table if exists user;



/*==============================================================*/
/* Table: t_department                                          */
/*==============================================================*/
create table user
(
   id bigint not null auto_increment comment 'id自增长',
   name varchar(100) DEFAULT NULL comment '姓名',
   loginName varchar(100) DEFAULT NULL  comment '登录名',
   sex int(11) comment DEFAULT 0  '性别',
   status int(11) DEFAULT 1  comment '状态',
   create_time datetime  DEFAULT NULL  comment '创建时间',
   update_time  datetime  DEFAULT NULL  comment '更新时间'
   primary key (id)
);
