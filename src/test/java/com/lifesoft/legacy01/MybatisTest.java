package com.lifesoft.legacy01;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//JUnit 4 버전으로 테스트
@RunWith(SpringJUnit4ClassRunner.class)
//스프링 설정 파일의 위치를 지정
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MybatisTest {
	
	//로깅
	private static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);
	
	//의존관계 주입 --> root-context.xml에 설정되어있는 org.mybatis.spring.SqlSessionFactoryBean
	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() {
		//fail("Not yet implemented");
		logger.info("sqlFactory:" +  sqlFactory);
	}
	
	@Test
	public void testSession() {
		try(SqlSession sqlSession = sqlFactory.openSession()) {
			logger.info("sqlSession:" + sqlSession);
			logger.info("mybatis Connect Success");
		} catch (Exception e) {

		}
	}
}
