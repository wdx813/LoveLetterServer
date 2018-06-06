/*
Navicat MySQL Data Transfer

Source Server         : LoveLetter
Source Server Version : 50560
Source Host           : 192.168.12.79:3306
Source Database       : love_letter

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-06-06 10:30:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_letter
-- ----------------------------
DROP TABLE IF EXISTS `t_letter`;
CREATE TABLE `t_letter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `receiver` int(11) DEFAULT NULL COMMENT '收件人ID',
  `sender` int(11) DEFAULT NULL COMMENT '寄信人的ID',
  `content` text COMMENT '内容',
  `selected` varchar(50) DEFAULT NULL COMMENT '选自',
  `type` int(2) DEFAULT NULL COMMENT '类型',
  `video` varchar(50) DEFAULT NULL COMMENT '录音的链接',
  `is_system` int(2) DEFAULT NULL,
  `time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_letter
-- ----------------------------
INSERT INTO `t_letter` VALUES ('1', null, null, '我能得到你这般坦率、真诚的言语是我的幸福，更使我快乐的是，我竟然在如此仓促的机遇中，得到你这样真诚见人的友人。', '曹禺写给黄永玉', '0', null, '1', '');
INSERT INTO `t_letter` VALUES ('2', null, null, '我对普通朋友这四个字的理解很简单：我在路上走着，遇到了你，大家点头微笑，结伴一程。缘深缘浅，缘聚缘散，该分手时分手，该重逢时重逢。', '大冰《乖，摸摸头》', '0', null, '1', null);
INSERT INTO `t_letter` VALUES ('3', null, null, '亲爱的，\r\n如果你不打扮好自己，\r\n请不要出门，\r\n哪怕只是五分钟，\r\n因为也许就在这一天，\r\n你会遇到生命里最重要的男人。', '《当我足够好，才会遇见你》', '0', null, '1', null);
INSERT INTO `t_letter` VALUES ('4', null, null, '我不能决定怎么生，\r\n怎么死，\r\n但我可以决定怎样爱，\r\n怎样活。', '萧红', '0', null, '1', null);
INSERT INTO `t_letter` VALUES ('5', null, null, '我想爱的不是他，\r\n我爱的是有他的那段时间。', '安妮宝贝《八月未央》', '0', null, '1', null);
INSERT INTO `t_letter` VALUES ('6', null, null, '得之我幸，\r\n不得我不信，\r\n再不得我不幸，\r\n无非就是这样。', '韩寒《青春》', '0', null, '1', null);
INSERT INTO `t_letter` VALUES ('7', null, null, '我一直相信，\r\n分离有好的分离，\r\n也有不好、\r\n不完全的分离。\r\n心里有亏欠，\r\n就会过意不去。', '曾世杰写给两个儿子', '1', null, '1', null);
INSERT INTO `t_letter` VALUES ('8', null, null, '以后你千万要记住，\r\n大人的心思你是看不透的，\r\n别以为自己灵光，\r\n别人都是老傻，\r\n人犯傻的时候，\r\n往往自己不知道。', '郑国强致儿子', '1', null, '1', null);
INSERT INTO `t_letter` VALUES ('9', null, null, '一想到你，\r\n我这张丑脸上就泛起微笑。', '王小波《爱你就像爱生命》', '2', null, '1', null);
INSERT INTO `t_letter` VALUES ('10', null, null, '爱，贫穷，咳嗽，\r\n是最无法掩饰的三件事情。', '匪我思存《爱如繁星》', '2', null, '1', null);
INSERT INTO `t_letter` VALUES ('11', null, null, '我不介意等你，\r\n只要最后等到的是你，\r\n就好。', '丁墨《如果蜗牛有爱情》', '2', null, '1', null);
INSERT INTO `t_letter` VALUES ('12', null, null, '那一天我二十一岁，在我一生的黄金时代。我有好多奢望。我想爱，想吃，还想子啊一瞬间变成天上半明半暗的云。后来我才知道，生活就是个缓慢受锤的过程，人一天天的老下去，奢望也一天天的消失，最后变得像挨了锤的牛一样。可是我过二十一岁生日时没有预见到这一点。我觉得自己会永远生猛下去，什么也锤不了我。', '王小波《黄金时代》', '0', null, '1', null);
INSERT INTO `t_letter` VALUES ('13', null, null, '我喜欢你是寂静的，\r\n仿佛你消失了一样，\r\n你从远处聆听我，\r\n我的声音却无法触及你。\r\n好想你的双眼已经飞离去，\r\n如同一个吻，\r\n封缄了你的嘴。\r\n如同所有的事物充满了我的灵魂，\r\n你从所有的事物中浮现，\r\n充满了我的灵魂。', '聂鲁达《我喜欢你是寂静的》', '2', null, '1', null);
