package com.lifesoft.legacy01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // 현재 클래스를 스크링에서 관리하는 컨트롤러로 등록(서버가 올라갈 때 스프링에서 HomeController를 자동으로 메모리에 올린다)
public class HomeController {
	
	/*
	 * @Controller : 컨트롤러 bean
	 * @Repository : DAO(데이터베이스 관련 작업) bean
	 * @Service : 서비스(비지니스 관련 로직) bean
	 * @Inject : 의존관계 주입 bean
	 */

	/**
	 * 로그를 수집할 클래스에 변수 선언
	 * private: 외부에서 로그를 가로채지 못하도록 하기 위해서
	 * static final: 로그내용이 바뀌지 않도록
	 */
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 아래의 슬래쉬는 root를 의미 localhost/[site명]/ 을 의미
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		/**
		 * servlet-context.xml의 org.springframework.web.servlet.view.InternalResourceViewResolver을 참고하여
		 * prefix, subfix에 규칙에 따라 페이지명으로 반환하도록함
		 * --> 결국 forward 하는 동작을 하게 됨 
		 */
		
		// servletContext 의 ViewResolver가 동작
		return "home";
	}
	
	//hello.do로 요청이 들어올 때 호출되는 method
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		//hello.jsp로 포워딩 됨
		model.addAttribute("name", "김철수");
		return "hello";
	}
}
