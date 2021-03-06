/*
 Navicat Premium Data Transfer

 Source Server         : Oracle
 Source Server Type    : Oracle
 Source Server Version : 110100
 Source Host           : 39.101.201.188:1521
 Source Schema         : SCOTT

 Target Server Type    : Oracle
 Target Server Version : 110100
 File Encoding         : 65001

 Date: 15/08/2020 14:25:42
*/


-- ----------------------------
-- Table structure for EMP
-- ----------------------------
DROP TABLE "SCOTT"."EMP";
CREATE TABLE "SCOTT"."EMP" (
  "EMPNO" NUMBER(4,0) NOT NULL,
  "ENAME" VARCHAR2(10 BYTE),
  "JOB" VARCHAR2(9 BYTE),
  "MGR" NUMBER(4,0),
  "HIREDATE" DATE,
  "SAL" NUMBER(7,2),
  "COMM" NUMBER(7,2),
  "DEPTNO" NUMBER(2,0)
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of EMP
-- ----------------------------
INSERT INTO "SCOTT"."EMP" VALUES ('9527', '蔡徐坤', '唱歌', '9541', TO_DATE('2020-08-06 16:15:06', 'SYYYY-MM-DD HH24:MI:SS'), '135', '99', NULL);
INSERT INTO "SCOTT"."EMP" VALUES ('9528', '蔡碧', '直播搬砖', '8888', TO_DATE('2020-07-26 10:37:42', 'SYYYY-MM-DD HH24:MI:SS'), '1000', '200', NULL);
INSERT INTO "SCOTT"."EMP" VALUES ('1086', '鲁智深', '保安队长', '2000', TO_DATE('2020-07-28 00:27:03', 'SYYYY-MM-DD HH24:MI:SS'), '5000', '200', '50');
INSERT INTO "SCOTT"."EMP" VALUES ('9530', '好蔡啊', 'rop', '6868', TO_DATE('2020-04-13 10:37:53', 'SYYYY-MM-DD HH24:MI:SS'), '888', '22', '20');
INSERT INTO "SCOTT"."EMP" VALUES ('9531', '蔡', 'sasasa', '8682', TO_DATE('2020-07-29 10:38:00', 'SYYYY-MM-DD HH24:MI:SS'), '99', '5944', NULL);
INSERT INTO "SCOTT"."EMP" VALUES ('1087', '秦明', '保安', '1800', TO_DATE('2020-07-28 00:27:03', 'SYYYY-MM-DD HH24:MI:SS'), '1499', NULL, '50');
INSERT INTO "SCOTT"."EMP" VALUES ('1088', '宋江', '保安', '1800', TO_DATE('2020-07-28 00:27:03', 'SYYYY-MM-DD HH24:MI:SS'), '1800', NULL, '50');
INSERT INTO "SCOTT"."EMP" VALUES ('7369', 'SMITH', 'CLERK', '7902', TO_DATE('1980-12-17 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '800', NULL, '20');
INSERT INTO "SCOTT"."EMP" VALUES ('7499', 'ALLEN', 'SALESMAN', '7698', TO_DATE('1981-02-20 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '1600', '300', '30');
INSERT INTO "SCOTT"."EMP" VALUES ('7521', 'WARD', 'SALESMAN', '7698', TO_DATE('1981-02-22 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '1250', '500', '30');
INSERT INTO "SCOTT"."EMP" VALUES ('7566', 'JONES', 'MANAGER', '7839', TO_DATE('1981-04-02 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '2975', NULL, '20');
INSERT INTO "SCOTT"."EMP" VALUES ('7654', 'MARTIN', 'SALESMAN', '7698', TO_DATE('1981-09-28 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '1250', '1400', '30');
INSERT INTO "SCOTT"."EMP" VALUES ('7698', 'BLAKE', 'MANAGER', '7839', TO_DATE('1981-05-01 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '2850', NULL, '30');
INSERT INTO "SCOTT"."EMP" VALUES ('7782', 'CLARK', 'MANAGER', '7839', TO_DATE('1981-06-09 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '2450', NULL, '10');
INSERT INTO "SCOTT"."EMP" VALUES ('7788', 'SCOTT', 'ANALYST', '7566', TO_DATE('1987-04-19 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '3000', NULL, '20');
INSERT INTO "SCOTT"."EMP" VALUES ('7844', 'TURNER', 'SALESMAN', '7698', TO_DATE('1981-09-08 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '1500', '0', '30');
INSERT INTO "SCOTT"."EMP" VALUES ('7876', 'ADAMS', 'CLERK', '7788', TO_DATE('1987-05-23 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '1100', NULL, '20');
INSERT INTO "SCOTT"."EMP" VALUES ('7900', 'JAMES', 'CLERK', '7698', TO_DATE('1981-12-03 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '950', NULL, '30');
INSERT INTO "SCOTT"."EMP" VALUES ('7902', 'FORD', 'ANALYST', '7566', TO_DATE('1981-12-03 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '3000', NULL, '20');
INSERT INTO "SCOTT"."EMP" VALUES ('7934', 'MILLER', 'CLERK', '7782', TO_DATE('1982-01-23 00:00:00', 'SYYYY-MM-DD HH24:MI:SS'), '1300', NULL, '10');
INSERT INTO "SCOTT"."EMP" VALUES ('1089', '公孙胜', '键盘侠', '2000', TO_DATE('2020-07-28 00:01:51', 'SYYYY-MM-DD HH24:MI:SS'), '1999', '200', '60');

-- ----------------------------
-- Primary Key structure for table EMP
-- ----------------------------
ALTER TABLE "SCOTT"."EMP" ADD CONSTRAINT "PK_EMP" PRIMARY KEY ("EMPNO");

-- ----------------------------
-- Foreign Keys structure for table EMP
-- ----------------------------
ALTER TABLE "SCOTT"."EMP" ADD CONSTRAINT "FK_DEPTNO" FOREIGN KEY ("DEPTNO") REFERENCES "SCOTT"."DEPT" ("DEPTNO") NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
