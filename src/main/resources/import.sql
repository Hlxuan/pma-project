-- 插入学生
insert into student (name, wechat_id, email) values ('赖波弛', 'Warton', 'warton@gmail.com');
insert into student (name, wechat_id, email) values ('毕咏湛', 'Lanister', 'lanister@gmail.com');
insert into student (name, wechat_id, email) values ('孙斐恋', 'Reeves', 'Reeves@gmail.com');
insert into student (name, wechat_id, email) values ('成骥坤', 'Connor', 'connor@gmail.com');
insert into student (name, wechat_id, email) values ('单琦习', 'Salvator', 'Sal@gmail.com');
insert into student (name, wechat_id, email) values ('单仪柳', 'Henley', 'henley@gmail.com');
insert into student (name, wechat_id, email) values ('翁列标', 'Carson', 'carson@gmail.com');
insert into student (name, wechat_id, email) values ('支奕辰', 'Miles', 'miles@gmail.com');
insert into student (name, wechat_id, email) values ('伍柳妍', 'Roggers', 'roggers@gmail.com');

-- 插入项目
insert into project (name, stage, description) values ('大规模生产部署', '未开始', '这需要所有的人都参与到软件的最终部署生产中来。');
insert into project (name, stage, description) values ('学习微服务架构', '已完成', '通过微服务，可将大型应用分解成多个独立的组件，其中每个组件都有各自的责任领域。');
insert into project (name, stage, description) values ('软件测试', '进行中', '在规定的条件下对程序进行操作，以发现程序错误，衡量软件质量。');
insert into project (name, stage, description) values ('毕业设计规划', '进行中', '独立完成一个应用软件或较大软件中的一个或数个模块设计、调试');

-- 插入PROJECT_STUDENT关系（注意：自增ID从1开始）
insert into project_student (student_id, project_id) values (1, 1);
insert into project_student (student_id, project_id) values (1, 2);
insert into project_student (student_id, project_id) values (1, 3);
insert into project_student (student_id, project_id) values (3, 1);
insert into project_student (student_id, project_id) values (6, 3);
insert into project_student (student_id, project_id) values (6, 4);