package com.lifesoft.legacy01.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.lifesoft.legacy01.model.dto.ProductDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//현재 클래스를 스프링에서 관리하는 컨트롤러 빈으로 등록함
@Controller
public class MainController {
	//로깅 선언
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	//URL mapping
	@RequestMapping("/")
	public String main(Model model) {
		//Model에 자료 저장( ==> Servlet의 Request에 해당)
		model.addAttribute("message", "홈페이지 방문을 환영합니다!!. - ParkJongSoo");
		//viewresolver에 의해서 main.jsp로 포워딩됨(WEB-INF/views/main.jsp)
		return "main";
	}
	
	/*@RequestMapping("gugu.do")
	public String gugu_old(Model model) {
		int dan  = 7;
		String result = "";
		
		for(int i=1; i <= 9; i++) {
			result += dan + "x" + i + "=" + dan * i + "<br>";
		}
		model.addAttribute("result", result);
		
		return "test/gugu";
	}*/
	
	/*@RequestMapping("gugu.do")
	public String gugu_old(Model model, HttpServletRequest request) {
		int dan  = 7;
		
		dan  = Integer.parseInt(request.getParameter("dan"));
		String result = "";
		
		for(int i=1; i <= 9; i++) {
			result += dan + "x" + i + "=" + dan * i + "<br>";
		}
		model.addAttribute("result", result);
		
		return "test/gugu";
	}*/
	
	/*@RequestMapping("gugu.do") // param의 이름과 매개변수의 이름이 같으면 된다
	public String gugu_old(Model model, int dan) {
		//int dan  = 7;
		
		//dan  = Integer.parseInt(request.getParameter("dan"));
		String result = "";
		
		for(int i=1; i <= 9; i++) {
			result += dan + "x" + i + "=" + dan * i + "<br>";
		}
		model.addAttribute("result", result);
		
		return "test/gugu";
	}*/
	
    /**
     * 기존에 Servlet에서 쓰는 방식
     */
    @RequestMapping("gugu_servlet.do")
    public String gugu_servlet(Model model, HttpServletRequest request) {

        int dan_request = Integer.parseInt(request.getParameter("dan"));
        String result = "";

        // Something do....
        result = String.valueOf(dan_request);

        model.addAttribute("result", result);
        return "test/gugu";
    }
    
    /**
     * @RequestMapping: method와 url pattern 연결
     * @RequestParam: request.getParameter("")를 대체
     * @RequestParam은 dan이라는 매개변수는 param으로 넘어오는 매개변수라는 선언 추가
     * @RequestParam은 생략가능하지만 기본값을 주기위해서 선언
     * param의 이름과 매개변수의 이름이 같으면 된다
     * http://localhost:8080/legacy01/gugu.do       --> default 3단 출력
     * http://localhost:8080/legacy01/gugu.do?dan=9 --> default 9단 출력
     */
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	public String gugu(@RequestParam(defaultValue="3") int dan, Model model)
	{
		String result = "";
		for(int i=1; i <= 9; i++) {
			
			result += dan + "x" + i + "=" + dan * i + "<br>";
		}
        
        // 모델에 자료 저장
		model.addAttribute("result", result);
		
		return "test/gugu";
	}
	
	@RequestMapping("test.do")
	public String test() {
		//return 값이 없을(void)경우 @RequestMapping과 같은 이름의 페이지로 이동
		return "test";
	}
	
	@RequestMapping("test/doA") // URL 패턴
	public String doA(Model model) {
        //자료저장
        // model.addAttribute(key, value);
		model.addAttribute("message", "방문을 환영합니다.!!!!");
        //포워딩
        // return "test/doB"; <-- doB.jsp로 포워딩 가능
		return "test/doA";
	}
	
	//return 값이 없을(void)경우 @RequestMapping과 같은 이름의 페이지로 이동
	@RequestMapping("test/doB")
	public void doB() {
        logger.info("doB 호출.....");
        // void 인 경우 Method가 종료된 뒤 "Method이름과 똑같은 이름"의 view 페이지로 이동
    }
    
    /**
     * ModelAndView: Model - 데이터 저장, View - 화면
     * 데이터와 포워드할 페이지의 정보
     * forward: 주소 그대로, 화면전환, 대량의 데이터 전달
     * redirect: 주소 바뀜, 화면전환, 소량의 get 방식 데이터
     */
    @RequestMapping("test/doC")
    public ModelAndView doC() {
        Map<String, Object> map = new HashMap<String, Object>();
        // 맵에 객체 저장
        map.put("product", new ProductDTO("샤프", 1000));
        // new MdoelAndView("포워딩할 페이지", "변수명", 값)
        return new ModelAndView("test/doC", "map", map);
    }
	
	@RequestMapping("test/doD")
	public String doD() {
        // redirect 의 경우 return type을 String으로 설정
		//다시 컨트롤러를 실행!
		return "redirect:/test/doE";
	}
	
	@RequestMapping("test/doE")//doE.jsp로 포워딩
	public void doE() {
		// doE.jsp로 포워드
	}
}