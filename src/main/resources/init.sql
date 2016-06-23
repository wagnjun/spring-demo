create table grampus (
	id bigint unsigned  not null auto_increment comment '主键',
	gmt_create datetime  not null comment '创建时间',
	gmt_modified datetime  not null comment '修改时间',
	name varchar(200) comment 'name',
	deleted tinyint comment 'deleted',
	primary key (id)
) comment='grampus 测试';

create table tuna (
	id bigint unsigned  not null auto_increment comment '主键',
	gmt_create datetime  not null comment '创建时间',
	gmt_modified datetime  not null comment '修改时间',
	name varchar(200) comment 'name',
	parent_id bigint unsigned comment 'grampus id',
	deleted tinyint comment 'DELETED',
	test bigint comment 'test',
	primary key (id)
) comment='grampus测试';


create table whale (
	id bigint unsigned  not null auto_increment comment '主键',
	gmt_create datetime  not null comment '创建时间',
	gmt_modified datetime  not null comment '修改时间',
	name varchar(200) comment 'name',
	deleted tinyint comment 'deleted',
	primary key (id)
) comment='whale 测试';

