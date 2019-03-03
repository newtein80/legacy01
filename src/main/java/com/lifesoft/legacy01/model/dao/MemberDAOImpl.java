package com.lifesoft.legacy01.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.lifesoft.legacy01.model.dto.MemberDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * MemberDAOImpl
 * 현재 클래스를 스프링에서 관리하는 dao bean으로 설정(서버가 올라올 때 single-ton으로 메모리에 올라옴)
 */
@Repository
public class MemberDAOImpl implements MemberDAO {

    //mybatis의 SqlSession 객체를 스프링에서 주입시킴
    /**
     * <bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate"	destroy-method="clearCache">
	    <!-- constructor : 생성자를 의미 -->
		<constructor-arg name="sqlSessionFactory" ref="sqlSessionFactory"></constructor-arg>
	   </bean>
     */
    @Inject
    SqlSession sqlSession;

    @Override
    public List<MemberDTO> memberList() {
        return sqlSession.selectList("member.memberList");
    }

    @Override
    public void insertMember(MemberDTO dto) {

        // auto commit, auto close
		sqlSession.insert("member.insertMember", dto);
    }

    @Override
    public MemberDTO viewMember(String userid) {
        //전달할 record가 1개 : selectOne
		//			  2개 : selectList
		return sqlSession.selectOne("member.viewMember", userid);
    }

    @Override
    public void deleteMember(String userid) {
        sqlSession.delete("member.deleteMember", userid);
    }

    @Override
    public void updateMember(MemberDTO dto) {
        sqlSession.update("member.updateMember",dto);
    }

    @Override
    public boolean checkPw(String userid, String passwd) {
        boolean result = false;
		
		Map<String, String> map = new HashMap<>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		
		int count = sqlSession.selectOne("member.checkPw",map);
		
		if(count == 1) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
    }

    
}