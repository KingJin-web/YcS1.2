-- Create table
create table JOB_CHANGE
(
    id         NUMBER(10) not null,
    empno      NUMBER(10),
    oldjob     VARCHAR2(50),
    newjob     VARCHAR2(50),
    oldsal     FLOAT,
    newsal     FLOAT,
    cause      VARCHAR2(500),
    createtime TIMESTAMP(6) default sysdate,
    allow      NUMBER
)
    tablespace USERS
    pctfree 10
  initrans 1
  maxtrans 255;
-- Create/Recreate primary, unique and foreign key constraints
alter table JOB_CHANGE
    add constraint PK_JC_ID primary key (ID)
        using index
    tablespace USERS
    pctfree 10
    initrans 2
    maxtrans 255;