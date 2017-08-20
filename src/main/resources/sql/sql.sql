
-- 级联查询sql

CREATE TABLE `t_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
	`sex` TINYINT(4) DEFAULT NULL,
  `memo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='学生表';


CREATE TABLE `t_student_ifno` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` BIGINT(20) DEFAULT NULL,
  `home_address` varchar(100) DEFAULT NULL,
	`create_time` date DEFAULT NULL,
  `memo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='学生信息表';


CREATE TABLE `t_timetable` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` BIGINT(20) DEFAULT NULL,
  `memo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='课程表';

CREATE TABLE `t_student_score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_id` BIGINT(20) DEFAULT NULL,
  `timetable_id` BIGINT(20) DEFAULT NULL,
	`score` DECIMAL(16,2) DEFAULT NULL,
  `memo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='学生成绩表';



INSERT INTO `t_student` (`name`, `email`, `sex`) VALUES ('song', 'song@qq.com', '0');
INSERT INTO `t_student` (`name`, `email`, `sex`) VALUES ('zhang', 'zhang@qq.com', '1');
INSERT INTO `t_student` (`name`, `email`, `sex`) VALUES ('liang', 'liang@qq.com', '0');

INSERT INTO `t_student_ifno` (`student_id`, `home_address`, `create_time`) VALUES ('7', '深圳', '2017-08-20');
INSERT INTO `t_student_ifno` (`student_id`, `home_address`, `create_time`) VALUES ('8', '深圳1', '2017-08-20');
INSERT INTO `t_student_ifno` (`student_id`, `home_address`, `create_time`) VALUES ('9', '深圳2', '2017-08-20');

INSERT INTO `t_timetable` (`name`) VALUES ('java');
INSERT INTO `t_timetable` (`name`) VALUES ('php');
INSERT INTO `t_timetable` (`name`) VALUES ('python');

INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('7', '7', '100');
INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('7', '8', '100');
INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('7', '9', '100');
INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('8', '7', '100');
INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('8', '8', '100');
INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('8', '9', '100');
INSERT INTO `t_student_score` (`student_id`, `timetable_id`, `score`) VALUES ('9', '7', '100');