drop table if exists board_tbl; 

create table board_tbl(
	bno int auto_increment primary key, 
    title varchar(300) not null, 
    content text not null, 
    writer varchar(50) not null, 
    regDate timestamp default current_timestamp, 
	updateDate timestamp default current_timestamp
);

insert into board_tbl(title,content, writer)
values ('니 내 아나?','반말하지마라.','정상수');
insert into board_tbl(title,content, writer)
values ('반말하지 말라고','ㅅㅂ럼아','땅뚜');
insert into board_tbl(title,content, writer)
values ('야이 개새기야','맞짱뜨자','땅뚜2');
insert into board_tbl(title,content, writer)
values ('테이저건 발사','으어어어억','테이저건 맞은 땅뚜');

