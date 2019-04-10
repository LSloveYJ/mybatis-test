CREATE TABLE `course` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `course_name` varchar(20) NOT NULL,
  `t_remark` varchar(255) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




CREATE TABLE `student` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '0',
  `school_no` varchar(20) NOT NULL,
  `level` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4;


INSERT INTO `student` (`id`, `name`, `age`, `status`, `school_no`, `level`) VALUES ('35', '1', '1', '0', '1', '0');
INSERT INTO .`student` (`id`, `name`, `age`, `status`, `school_no`, `level`) VALUES ('36', '2', '3', '3', '4', '1');
INSERT INTO `course` (`id`, `course_name`, `t_remark`, `student_id`) VALUES ('3', '1', '1', '35');



