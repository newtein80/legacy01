# init

1. 패키징 후 Server 에 war 디버깅 선택
2. Open browser 후 접속 확인
3. Java 파일 수정 후 Ctrl + Shift + F5 눌러서 재접속 (재접속하지 않아도 됨!! --> 바로 브라우저 새로고침으로 확인가능)
4. 변경 사항 확인
--> 패키징이나 서버 재시작이 필요없음

* 단, jsp 파일 수정한 것은 확인 불가..??

1. Tomcat Server Stop
2. war 파일 제거
3. re 패키징
4. Tomcat Server war 선택
5. Tomcat Server Debugging war

sqlplus system/xxxxxx

alter session set "_ORACLE_SCRIPT" = true;

create tablespace spring
datafile {path}/spring.dbf size 50m
autoextend on
next 10m
maxsize unlimited;

create user spring identified by xxxxxx
default tablespace spring;

grant connect,resource,dba to spring