DROP TABLE IF EXISTS `tbl_snp`;
CREATE TABLE `tbl_snp` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `chrom` varchar(50) DEFAULT NULL COMMENT '基因名称',
  `pos` varchar(30) DEFAULT NULL COMMENT '基因位置',
  `pos_id` varchar(30) DEFAULT NULL,
  `ref` varchar(30) DEFAULT NULL COMMENT '参考值',
  `alt` varchar(30) DEFAULT NULL COMMENT '变异值',
  `qual` varchar(30) DEFAULT NULL,
  `filter` varchar(30) DEFAULT NULL,
  `info` varchar(4000) DEFAULT NULL,
  `create_time` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `tbl_snp_format`;
CREATE TABLE `tbl_snp_format` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `snp_id` int(11) NOT NULL,
  `sick` varchar(50) DEFAULT NULL,
  `format` varchar(50) DEFAULT NULL,
  `format_val` varchar(50) DEFAULT NULL,
  `format_rate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10347 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `tbl_sick_info`;
CREATE TABLE `tbl_sick_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sick_code` varchar(50) DEFAULT NULL COMMENT '编码',
  `sick_name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(50) DEFAULT NULL COMMENT '性别',
  `birth` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `nation` varchar(50) DEFAULT NULL COMMENT '民族',
  `sample_type` varchar(50) DEFAULT NULL COMMENT '样本类型',
  `sample_time` varchar(50) DEFAULT NULL COMMENT '取样时间',
  `check_company` varchar(100) DEFAULT NULL COMMENT '送检单位',
  `check_office` varchar(100) DEFAULT NULL COMMENT '送检科室',
  `symptom` varchar(500) DEFAULT NULL COMMENT '症状',
  `impression` varchar(500) DEFAULT NULL COMMENT '临床印象',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `tbl_snp_info`;
CREATE TABLE `tbl_snp_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `snp_id` int(11) NOT NULL,
  `ac` varchar(100) DEFAULT NULL,
  `af` varchar(100) DEFAULT NULL,
  `an` varchar(100) DEFAULT NULL,
  `dp` varchar(100) DEFAULT NULL,
  `excesshet` varchar(100) DEFAULT NULL,
  `fs` varchar(100) DEFAULT NULL,
  `mleac` varchar(100) DEFAULT NULL,
  `mleaf` varchar(100) DEFAULT NULL,
  `mq` varchar(100) DEFAULT NULL,
  `qd` varchar(100) DEFAULT NULL,
  `sor` varchar(100) DEFAULT NULL,
  `annovar_date` varchar(100) DEFAULT NULL,
  `func_refgene` varchar(100) DEFAULT NULL,
  `gene_refgene` varchar(400) DEFAULT NULL,
  `genedetail_refgene` varchar(800) DEFAULT NULL,
  `exonicfunc_refgene` varchar(100) DEFAULT NULL,
  `aachange_refgene` varchar(1200) DEFAULT NULL,
  `xref_refgene` varchar(800) DEFAULT NULL,
  `cytoband` varchar(100) DEFAULT NULL,
  `avsnp147` varchar(100) DEFAULT NULL,
  `clinsig` varchar(400) DEFAULT NULL,
  `clndbn` varchar(800) DEFAULT NULL,
  `clnacc` varchar(400) DEFAULT NULL,
  `clndsdb` varchar(400) DEFAULT NULL,
  `clndsdbid` varchar(400) DEFAULT NULL,
  `popfreqmax` varchar(100) DEFAULT NULL,
  `a1000g_all` varchar(100) DEFAULT NULL,
  `a1000g_afr` varchar(100) DEFAULT NULL,
  `a1000g_amr` varchar(100) DEFAULT NULL,
  `a1000g_eas` varchar(100) DEFAULT NULL,
  `a1000g_eur` varchar(100) DEFAULT NULL,
  `a1000g_sas` varchar(100) DEFAULT NULL,
  `exac_all` varchar(100) DEFAULT NULL,
  `exac_afr` varchar(100) DEFAULT NULL,
  `exac_amr` varchar(100) DEFAULT NULL,
  `exac_eas` varchar(100) DEFAULT NULL,
  `exac_fin` varchar(100) DEFAULT NULL,
  `exac_nfe` varchar(100) DEFAULT NULL,
  `exac_oth` varchar(100) DEFAULT NULL,
  `exac_sas` varchar(100) DEFAULT NULL,
  `esp6500siv2_all` varchar(100) DEFAULT NULL,
  `esp6500siv2_aa` varchar(100) DEFAULT NULL,
  `esp6500siv2_ea` varchar(100) DEFAULT NULL,
  `cg46` varchar(100) DEFAULT NULL,
  `sift_score` varchar(100) DEFAULT NULL,
  `sift_pred` varchar(100) DEFAULT NULL,
  `polyphen2_hdiv_score` varchar(100) DEFAULT NULL,
  `polyphen2_hdiv_pred` varchar(100) DEFAULT NULL,
  `polyphen2_hvar_score` varchar(100) DEFAULT NULL,
  `polyphen2_hvar_pred` varchar(100) DEFAULT NULL,
  `lrt_score` varchar(100) DEFAULT NULL,
  `lrt_pred` varchar(100) DEFAULT NULL,
  `mutationtaster_score` varchar(100) DEFAULT NULL,
  `mutationtaster_pred` varchar(100) DEFAULT NULL,
  `mutationassessor_score` varchar(100) DEFAULT NULL,
  `mutationassessor_pred` varchar(100) DEFAULT NULL,
  `fathmm_score` varchar(100) DEFAULT NULL,
  `fathmm_pred` varchar(100) DEFAULT NULL,
  `provean_score` varchar(100) DEFAULT NULL,
  `provean_pred` varchar(100) DEFAULT NULL,
  `vest3_score` varchar(100) DEFAULT NULL,
  `cadd_raw` varchar(100) DEFAULT NULL,
  `cadd_phred` varchar(100) DEFAULT NULL,
  `dann_score` varchar(100) DEFAULT NULL,
  `fathmm_mkl_coding_score` varchar(100) DEFAULT NULL,
  `fathmm_mkl_coding_pred` varchar(100) DEFAULT NULL,
  `metasvm_score` varchar(100) DEFAULT NULL,
  `metasvm_pred` varchar(100) DEFAULT NULL,
  `metalr_score` varchar(100) DEFAULT NULL,
  `metalr_pred` varchar(100) DEFAULT NULL,
  `integrated_fitcons_score` varchar(100) DEFAULT NULL,
  `integrated_confidence_value` varchar(100) DEFAULT NULL,
  `gerp_rs` varchar(100) DEFAULT NULL,
  `phylop7way_vertebrate` varchar(100) DEFAULT NULL,
  `phylop20way_mammalian` varchar(100) DEFAULT NULL,
  `phastcons7way_vertebrate` varchar(100) DEFAULT NULL,
  `phastcons20way_mammalian` varchar(100) DEFAULT NULL,
  `siphy_29way_logodds` varchar(100) DEFAULT NULL,
  `baseqranksum` varchar(100) DEFAULT NULL,
  `clippingranksum` varchar(100) DEFAULT NULL,
  `mqranksum` varchar(100) DEFAULT NULL,
  `readposranksum` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20693 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `tbl_sick`;
CREATE TABLE `tbl_sick` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `sick_code` varchar(100) DEFAULT NULL,
  `sick_name` varchar(100) DEFAULT NULL COMMENT '病人姓名',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `family` varchar(100) DEFAULT NULL COMMENT '家庭成员',
  `disease_gene_focused` varchar(100) DEFAULT NULL COMMENT '疾病基因',
  `medical_history` varchar(200) DEFAULT NULL COMMENT '病史药史',
  `family_history` varchar(200) DEFAULT NULL COMMENT '家族病史',
  `panel_name` varchar(400) DEFAULT NULL COMMENT '病情描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `tbl_sample`;
CREATE TABLE `tbl_sample` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sick_id` int(11) NOT NULL,
  `origin_name` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `upload_time` datetime DEFAULT NULL COMMENT '上传时间',
  `trigger_time` datetime DEFAULT NULL,
  `handler_status` varchar(20) DEFAULT NULL COMMENT '执行状态',
  `handler_time` datetime DEFAULT NULL COMMENT '执行时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

ALTER TABLE `tbl_sample`
ADD COLUMN `store_time`  datetime NULL AFTER `handler_time`;

ALTER TABLE `tbl_sample`
ADD COLUMN `store_status`  varchar(20) NULL AFTER `store_time`,
ADD COLUMN `finish_time`  datetime NULL AFTER `store_status`;


CREATE TABLE `tbl_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_code` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `genes` text,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_sick_product` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`sick_id`  int(11) NULL ,
`product_id`  int(11) NULL ,
PRIMARY KEY (`id`)
);

--- 2018-08-04
ALTER TABLE `xhl_db`.`tbl_snp` 
ADD COLUMN `data_type` varchar(50) NULL AFTER `create_time`;

--- 2018-08-09
ALTER TABLE `tbl_snp_format`
ADD COLUMN `mutation_mode`  varchar(50) NULL COMMENT '突变类型，GT的值进行判断 hex 杂合突变 或者  hom 纯合突变 0/0：hom，0/1：hex，1/1: hom' AFTER `format_rate`,
ADD COLUMN `mutation_ad`  varchar(50) NULL COMMENT 'AD=0,7 逗号转为斜杠/' AFTER `mutation_mode`,
ADD COLUMN `mutation_rate`  varchar(50) NULL COMMENT 'AD第二个数字除以DP的取值' AFTER `mutation_ad`;