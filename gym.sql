
CREATE DATABASE IF NOT EXISTS `gym` DEFAULT CHARACTER SET utf8 ;
USE `gym` ;

-- -----------------------------------------------------
-- Table `gym`.`admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`admin` (
  `admin_id` INT(6) NOT NULL COMMENT '管理员编号',
  `admin_name` VARCHAR(15) NOT NULL COMMENT '管理员姓名',
  `admin_phone` CHAR(11) NOT NULL COMMENT '管理员联系方式',
  `admin_state` CHAR(1) NOT NULL COMMENT '管理员状态',
  `admin_pwd` CHAR(128) NOT NULL COMMENT '管理员密码',
  `admin_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`admin_id`));


-- -----------------------------------------------------
-- Table `gym`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`category` (
  `category_id` INT NOT NULL AUTO_INCREMENT COMMENT '类别id',
  `category_name` VARCHAR(45) NOT NULL COMMENT '类别名称',
  `category_info` TEXT NULL COMMENT '类别信息',
  `category_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`category_id`));


-- -----------------------------------------------------
-- Table `gym`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`product` (
  `product_id` INT(6) NOT NULL COMMENT '商品id',
  `product_name` VARCHAR(45) NOT NULL COMMENT '商品名称',
  `product_price` DOUBLE NOT NULL COMMENT '商品单价',
  `product_quantity` INT(5) NOT NULL COMMENT '商品库存',
  `category_id` INT(6) NOT NULL COMMENT '类别id',
  `product_remark` TEXT NULL COMMENT '备注',
  `product_images` TEXT NOT NULL COMMENT '商品图片',
  PRIMARY KEY (`product_id`),
  INDEX `fk_product_category_id_idx` (`category_id` ASC),
  CONSTRAINT `fk_product_category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `gym`.`category` (`category_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `gym`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`department` (
  `department_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `department_name` VARCHAR(45) NOT NULL COMMENT '部门名称',
  `department_info` TEXT NULL COMMENT '部门信息',
  `department_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`department_id`));


-- -----------------------------------------------------
-- Table `gym`.`staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`staff` (
  `staff_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `staff_name` VARCHAR(45) NOT NULL COMMENT '员工姓名',
  `staff_sex` CHAR(1) NOT NULL DEFAULT '男' COMMENT '员工性别',
  `staff_time` DATE NOT NULL COMMENT '入职时间',
  `staff_address` TEXT NOT NULL,
  `staff_job` VARCHAR(20) NOT NULL COMMENT '员工职位',
  `staff_phone` CHAR(11) NOT NULL COMMENT '员工练习方式',
  `department_id` INT NOT NULL COMMENT '部门编号',
  `staff_birthday` DATE NOT NULL,
  `staff_remark` TEXT NULL,
  PRIMARY KEY (`staff_id`),
  INDEX `fk_staff_department_id_idx` (`department_id` ASC),
  CONSTRAINT `fk_staff_department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `gym`.`department` (`department_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `gym`.`notice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`notice` (
  `notice_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '通知编号',
  `notice_type` CHAR(1) NOT NULL COMMENT '通知类型',
  `notice_content` TEXT NOT NULL COMMENT '通知内容',
  `notice_time` DATETIME NOT NULL DEFAULT now() COMMENT '通知时间',
  `notice_member` INT(6) NOT NULL COMMENT '接受通知对象',
  PRIMARY KEY (`notice_id`));


-- -----------------------------------------------------
-- Table `gym`.`logger`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`logger` (
  `logger_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '日志编号',
  `logger_module` VARCHAR(15) NOT NULL COMMENT '系统模块',
  `logger_type` VARCHAR(4) NOT NULL COMMENT '操作类型',
  `logger_operater` VARCHAR(15) NOT NULL COMMENT '操作人员',
  `logger_datetime` DATETIME NOT NULL DEFAULT now() COMMENT '操作时间',
  `logger_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`logger_id`));


-- -----------------------------------------------------
-- Table `gym`.`experience`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`experience` (
  `experience_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '体验编号',
  `experience_username` VARCHAR(15) NOT NULL COMMENT '用户姓名',
  `experience_phone` CHAR(11) NOT NULL COMMENT '用户联系电话',
  `experience_addres` TEXT NOT NULL COMMENT '用户联系地址',
  `experience_sex` CHAR(1) NOT NULL DEFAULT '男' COMMENT '用户性别',
  `experience_remark` TEXT NULL COMMENT '备注',
  `experience_time` DATETIME NOT NULL DEFAULT now() COMMENT '来店体验时间',
  PRIMARY KEY (`experience_id`));


-- -----------------------------------------------------
-- Table `gym`.`card_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`card_type` (
  `ct_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '会员卡类型编号',
  `ct_name` VARCHAR(45) NOT NULL COMMENT '会员卡类型名称',
  `ct_price` DOUBLE NOT NULL COMMENT '会员卡价格',
  `ct_remark` TEXT NULL COMMENT '会员卡备注',
  PRIMARY KEY (`ct_id`));



-- -----------------------------------------------------
-- Table `gym`.`member_card`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`member_card` (
  `mc_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '会员卡号',
  `mc_name` VARCHAR(10) NOT NULL COMMENT '会员姓名',
  `mc_type_id` INT(6) NOT NULL COMMENT '会员卡类型编号',
  `mc_sex` CHAR(1) NOT NULL DEFAULT '男' COMMENT '会员姓名',
  `mc_opentime` DATETIME NOT NULL DEFAULT now() COMMENT '会员开卡时间',
  `mc_losetime` DATE NOT NULL COMMENT '会员卡 到期时间',
  `mc_sum` DOUBLE NOT NULL COMMENT '消费总额',
  `mc_phone` CHAR(11) NOT NULL COMMENT '会员联系电话',
  `mc_state` CHAR(1) NOT NULL COMMENT '会员状态',
  `mc_birthday` DATE NOT NULL COMMENT '会员生日',
  `mc_coach` INT(6) NOT NULL COMMENT '教练编号',
  `mc_wardrobe` INT(6) COMMENT '衣柜编号',
  `mc_counselor` INT(6) NOT NULL COMMENT '会计顾问',
  `mc_idtype` CHAR(1) NOT NULL COMMENT '证件类型',
  `mc_idnum` VARCHAR(18) NOT NULL COMMENT '证件编号',
  `mc_address` TEXT NOT NULL COMMENT '会员联系地址',
  `mc_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`mc_id`, `mc_state`),
  INDEX `fk_membercard_cardype_id_idx` (`mc_type_id` ASC),
  INDEX `fk_menbercard_staff_id_idx` (`mc_coach` ASC),
  CONSTRAINT `fk_membercard_cardype_id`
    FOREIGN KEY (`mc_type_id`)
    REFERENCES `gym`.`card_type` (`ct_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_menbercard_staff_id`
    FOREIGN KEY (`mc_coach`)
    REFERENCES `gym`.`staff` (`staff_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `gym`.`wardrobe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`wardrobe` (
  `wardrobe_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '衣柜编号',
  `wardrobe_usestate` CHAR(1) NOT NULL COMMENT '使用状态',
  `wardrobe_starttime` DATETIME NOT NULL DEFAULT now() COMMENT '衣柜使用时间',
  `wardrobe_cost` DOUBLE NOT NULL COMMENT '费用',
  `wardrobe_position` TEXT NOT NULL COMMENT '所在位置',
  `wardrobe_user` INT(6) NOT NULL COMMENT '会员编号',
  `wardrobe_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`wardrobe_id`),
  INDEX `fk_wardrobe_membercard_id_idx` (`wardrobe_user` ASC),
  CONSTRAINT `fk_wardrobe_membercard_id`
    FOREIGN KEY (`wardrobe_user`)
    REFERENCES `gym`.`member_card` (`mc_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);




-- -----------------------------------------------------
-- Table `gym`.`member_get`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`member_get` (
  `mg_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '来访编号',
  `mg_time` DATETIME NOT NULL DEFAULT now() COMMENT '登记日期',
  `mg_remark` TEXT NULL COMMENT '备注',
  `member_cardid` INT(6) NOT NULL COMMENT '会员卡编号',
  PRIMARY KEY (`mg_id`),
  INDEX `fk_memberget_membercard_id_idx` (`member_cardid` ASC),
  CONSTRAINT `fk_memberget_membercard_id`
    FOREIGN KEY (`member_cardid`)
    REFERENCES `gym`.`member_card` (`mc_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `gym`.`course_instruction`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`course_instruction` (
  `ci_id` INT(6) NOT NULL COMMENT '课程编号',
  `ci_name` VARCHAR(50) NOT NULL COMMENT '课程名称',
  `ci_capacity` INT(2) NOT NULL COMMENT '课程容纳人数',
  `ci_cost` DOUBLE NOT NULL COMMENT '课程费用',
  `ci_introduction` TEXT NOT NULL COMMENT '课程介绍',
  `ci_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`ci_id`));


-- -----------------------------------------------------
-- Table `gym`.`member_expense`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`member_expense` (
  `me_id` INT(6) NOT NULL AUTO_INCREMENT COMMENT '消费编号',
  `mc_id` INT(6) NOT NULL COMMENT '会员编号',
  `product_id` INT(6) NOT NULL COMMENT '商品id',
  `course_id` INT(6) NOT NULL COMMENT '课程id',
  `me_cost` DOUBLE NOT NULL COMMENT '总费用',
  `me_quantity` INT NOT NULL COMMENT '购买数量',
  `me_remark` TEXT NULL COMMENT '消费备注',
  `me_time` DATETIME NOT NULL DEFAULT now() COMMENT '会员消费时间',
  PRIMARY KEY (`me_id`),
  INDEX `fk_me_mc_id_idx` (`mc_id` ASC),
  INDEX `fk_me_product_id_idx` (`product_id` ASC),
  INDEX `fk_me_course_id_idx` (`course_id` ASC),
  CONSTRAINT `fk_me_mc_id`
    FOREIGN KEY (`mc_id`)
    REFERENCES `gym`.`member_card` (`mc_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_me_product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `gym`.`product` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_me_course_id`
    FOREIGN KEY (`course_id`)
    REFERENCES `gym`.`course_instruction` (`ci_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `gym`.`vip_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`vip_course` (
  `vc_id` INT(6) NOT NULL COMMENT '编号',
  `mc_id` TEXT NOT NULL COMMENT '会员编号',
  `course_id` INT(6) NOT NULL COMMENT '课程编号',
  `vc_remark` VARCHAR(45) NULL COMMENT '备注',
  PRIMARY KEY (`vc_id`));


-- -----------------------------------------------------
-- Table `gym`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gym`.`course` (
  `course_id` INT(6) NOT NULL COMMENT '课程编号',
  `course_position` TEXT NOT NULL COMMENT '上课地点',
  `course_classtime` TEXT NOT NULL COMMENT '上课时间',
  `course_starttime` INT NOT NULL COMMENT '开课时间',
  `course_endtime` DATE NOT NULL COMMENT '结课时间',
  `course_coach` INT(6) NOT NULL COMMENT '课程教练',
  `ci_id` INT(6) NOT NULL COMMENT '课程介绍编号',
  `course_remark` TEXT NULL COMMENT '备注',
  PRIMARY KEY (`course_id`),
  INDEX `fk_course_courseinstruction_id_idx` (`ci_id` ASC),
  CONSTRAINT `fk_course_courseinstruction_id`
    FOREIGN KEY (`ci_id`)
    REFERENCES `gym`.`course_instruction` (`ci_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
