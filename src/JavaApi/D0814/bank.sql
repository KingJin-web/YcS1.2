-- 序列生成 id 值
create sequence BANK_SEQ;

-- 银行账户表
create table BANK_ACCOUNT (
                              id      NUMBER(8) not null,
                              name    VARCHAR2(20),
                              balance NUMBER(8,2)
);
alter table BANK_ACCOUNT add constraint PK_BA_ID primary key (ID);

-- 账户流水表
create table BANK_OPRECORD (
                               id     NUMBER(8) not null,
                               aid    NUMBER(8),
                               money  NUMBER(8,2),
                               optime TIMESTAMP(6)
);
alter table BANK_OPRECORD add constraint PK_BO_ID primary key (ID);