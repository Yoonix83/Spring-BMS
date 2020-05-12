--------------------------------------------------------
--  파일이 생성됨 - 월요일-5월-11-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TBL_BOARD
--------------------------------------------------------

  CREATE TABLE "BOOK_EX"."TBL_BOARD" 
   (	"BNO" NUMBER(10,0), 
	"TITLE" VARCHAR2(200 BYTE), 
	"CONTENT" VARCHAR2(2000 BYTE), 
	"WRITER" VARCHAR2(50 BYTE), 
	"REGDATE" DATE DEFAULT sysdate, 
	"UPDATEDATE" DATE DEFAULT sysdate
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into BOOK_EX.TBL_BOARD
SET DEFINE OFF;
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (181,'Title Test','Text area Test','Writer Test',to_date('20/05/10','RR/MM/DD'),to_date('20/05/10','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (15,'new Title 1','new Content 1','newbie',to_date('19/09/28','RR/MM/DD'),to_date('19/09/28','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (25,'MockMvc Title test','MockMvc Content test','MockMvc',to_date('19/10/03','RR/MM/DD'),to_date('19/10/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (26,'MockMvc Title test','MockMvc Content test','MockMvc',to_date('19/10/03','RR/MM/DD'),to_date('19/10/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (81,'test1114','contenttest1114','contenttest1114',to_date('19/11/14','RR/MM/DD'),to_date('19/11/18','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (105,'new Title 2 select key','new Content 2 select key','newbie',to_date('19/12/03','RR/MM/DD'),to_date('19/12/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (106,'new Title 1','new Content 1','newbie',to_date('19/12/03','RR/MM/DD'),to_date('19/12/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (107,'new Title 2 select key','new Content 2 select key','newbie',to_date('19/12/03','RR/MM/DD'),to_date('19/12/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (45,'i？？e¸？eº？i§？ i？？i？¸i？ⓒ1','i？？e¸？ e¹¨i§？ i？？i？¸i？ⓒ','i？？e¸？i？￢e？？',to_date('19/10/08','RR/MM/DD'),to_date('19/10/08','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (46,'한글꺠짐 확인용2','				내용 수정 테스트2-1','												한글깨짐',to_date('19/10/08','RR/MM/DD'),to_date('20/04/22','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (61,'모달 테스트1','				내용 수정 테스트','수정테스트',to_date('19/10/20','RR/MM/DD'),to_date('20/04/19','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (2,'테스트 제목','테스트 내용','user00',to_date('19/09/25','RR/MM/DD'),to_date('19/09/25','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (24,'MockMvc Title test','MockMvc Content test','MockMvc',to_date('19/10/03','RR/MM/DD'),to_date('19/10/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (5,'Modify Title #1','Modify Content #1','user00',to_date('19/09/25','RR/MM/DD'),to_date('19/12/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (7,'테스트 제목','테스트 내용','user00',to_date('19/09/25','RR/MM/DD'),to_date('19/09/25','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (8,'테스트 제목','테스트 내용','user00',to_date('19/09/25','RR/MM/DD'),to_date('19/09/25','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (9,'테스트 제목','테스트 내용','user00',to_date('19/09/25','RR/MM/DD'),to_date('19/09/25','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (10,'MockMvc Modify Test','MockMvc Modify Content','MockMvc',to_date('19/09/25','RR/MM/DD'),to_date('19/12/03','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (102,'뒤로가기 test','				뒤로가기 test','뒤로가기 test',to_date('19/11/18','RR/MM/DD'),to_date('20/01/01','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (12,'테스트 제목','																												테스트 내용','																								테스트 내용',to_date('19/09/25','RR/MM/DD'),to_date('20/01/01','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (101,'뒤로가기 test','뒤로가기 test','뒤로가기 test',to_date('19/11/18','RR/MM/DD'),to_date('19/11/18','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (103,'뒤로가기 test','뒤로가기 test','뒤로가기 test',to_date('19/11/18','RR/MM/DD'),to_date('19/11/18','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (104,'window history test','window history test','window history test',to_date('19/11/18','RR/MM/DD'),to_date('19/11/18','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (16,'new Title 2 select key','new Content 2 select key','newbie',to_date('19/09/28','RR/MM/DD'),to_date('19/09/28','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (17,'new Title 2 select key','new Content 2 select key','newbie',to_date('19/09/28','RR/MM/DD'),to_date('19/09/28','RR/MM/DD'));
Insert into BOOK_EX.TBL_BOARD (BNO,TITLE,CONTENT,WRITER,REGDATE,UPDATEDATE) values (18,'new Title 1','new Content 1','newbie',to_date('19/09/28','RR/MM/DD'),to_date('19/09/28','RR/MM/DD'));
--------------------------------------------------------
--  DDL for Index PK_BOARD
--------------------------------------------------------

  CREATE UNIQUE INDEX "BOOK_EX"."PK_BOARD" ON "BOOK_EX"."TBL_BOARD" ("BNO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_BOARD
--------------------------------------------------------

  ALTER TABLE "BOOK_EX"."TBL_BOARD" ADD CONSTRAINT "PK_BOARD" PRIMARY KEY ("BNO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "BOOK_EX"."TBL_BOARD" MODIFY ("TITLE" NOT NULL ENABLE);
 
  ALTER TABLE "BOOK_EX"."TBL_BOARD" MODIFY ("CONTENT" NOT NULL ENABLE);
 
  ALTER TABLE "BOOK_EX"."TBL_BOARD" MODIFY ("WRITER" NOT NULL ENABLE);
