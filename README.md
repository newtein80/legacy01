# init

https://www.youtube.com/watch?v=f3-3WhAseGs
51:45

마우스 우클릭 후 Source Action 누르면 getter/setter 생성

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

create table member(
    userid varchar2(50) not null primary key,
    passwd varchar2(50) not null,
    name varchar2(50) not null,
    email varchar2(50),
    join_date date default sysdate
)

Controller
    MemberController.java
Sevice
    MemberService.java
    MemberserviceImpl.java
Model
    MemberDAO.java
    MemberDAOImpl.java
    MemberDTO.java
    memberMappler.xml
View
    member_list.jsp
    write.jsp
    view.jsp

* 인터페이스의 장점?
** Class(controller)는 [Interface]의 method만 호출하면 된다.
** Class(controller)는 [Interface의 구현 클래스]에 대해서 모르며, [Interface]를 통해서 상세 기능을 호출하여 사용
** [Interface의 구현클래스]의 내용 변경이 Class(controller)에 영향을 미치지 않는다.(??)
** [Interface의 구현클래스]의 내용 변경이 자유롭다.(??)

-- Class(controller) --
public class PersonUse {
    Person p;

    void connect() {
        p = new PersionImpl();
        p.login();
    }
}

-- Interface --
public interface Person {
    void login();
}

-- Interface의 구현 클래스 --
public class PersonImpl implements Person {
    public void login() {
        // do something...
    }
}