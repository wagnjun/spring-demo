insert into grampus(id, gmt_create, gmt_modified, name, deleted) values(2001, '2016-05-10 16:45:21', '2016-05-10 16:45:21', 'grampus1', 0);
insert into grampus(id, gmt_create, gmt_modified, name, deleted) values(2002, '2016-05-10 16:45:22', '2016-05-10 16:45:21', 'grampus2', 0);
insert into grampus(id, gmt_create, gmt_modified, name, deleted) values(2003, '2016-05-10 16:45:23', '2016-05-10 16:45:21', 'grampus3', 0);


insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2001, '2016-05-10 16:45:21', '2016-05-10 16:45:22', 'tuna1', 2001, 0);
insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2002, '2016-05-10 16:45:22', '2016-05-10 16:45:22', 'tuna2', 2001, 0);
insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2003, '2016-05-10 16:45:23', '2016-05-10 16:45:22', 'tuna3', 2001, 0);
insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2004, '2016-05-10 16:45:24', '2016-05-10 16:45:22', 'tuna4', 2002, 0);
insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2005, '2016-05-10 16:45:25', '2016-05-10 16:45:22', 'tuna5', 2002, 0);
insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2006, '2016-05-10 16:45:26', '2016-05-10 16:45:22', 'tuna6', 2003, 0);
insert into tuna(id, gmt_create, gmt_modified, name, parent_id, deleted) values(2007, '2016-05-10 16:45:27', '2016-05-10 16:45:22', 'tuna7', 2003, 1);



insert into whale(id, gmt_create, gmt_modified, name, deleted) values(2001, '2016-05-10 16:45:21', '2016-05-10 16:45:21', 'whale1', 0);
insert into whale(id, gmt_create, gmt_modified, name, deleted) values(2002, '2016-05-10 16:45:22', '2016-05-10 16:45:21', 'whale2', 0);
insert into whale(id, gmt_create, gmt_modified, name, deleted) values(2003, '2016-05-10 16:45:23', '2016-05-10 16:45:21', 'whale3', 0);
