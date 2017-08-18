### springboot
springboot demo

已JAR包方式运行,如果需要WAR包部署，请参考分支（war_branch）

###mysql脚本:
####创建数据库
```
CREATE DATABASE IF NOT EXISTS`spring_boot` DEFAULT CHARACTER SET utf8;
USE `spring_boot`;
DROP TABLE IF EXISTS `t_users`;
```
####创建表
```
CREATE TABLE `t_users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
```
####初始化数据
```
insert into `t_users`(`name`,`email`) values ('lisi','lisi@qq.com');
insert into `t_users`(`name`,`email`) values ('wangwu','wangwu@qq.com');
insert into `t_users`(`name`,`email`) values ('zhaoliu','zhaoliu@qq.com');
```
