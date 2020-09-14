create database talkroom;

create table lottery(
                        id int primary key ,
                        opendate varchar(16),
                        num varchar(10),
                        redone varchar(2),
                        redtwo varchar(2),
                        redthree varchar(2),
                        redfour varchar(2),
                        redfive varchar(2),
                        redsix varchar(2),
                        blue varchar(2),
                        sale varchar(20),
                        firstprize varchar(4),
                        secondeprize varchar(4)
);
-- https://blog.csdn.net/u014001717/article/details/51250806
CREATE SEQUENCE seqSqq
    INCREMENT BY 1 -- 每次加几个
    START WITH 1 -- 从1开始计数
    NOMAXvalue -- 不设置最大值
    NOCYCLE -- 一直累加，不循环
    CACHE 10; --设置缓存cache个序列，如果系统down掉了或者其它情况将会导致序列不连续，也可以设置为---------NOCACHE