package com.lifesoft.legacy01.controller;

import com.lifesoft.legacy01.model.dto.ProductDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleRestController
 * @RestController: ajax 처리 전용 컨트롤러(백그라운드에서 실행 됨)
 */
@RestController // Spring 4.0 부터 사용가능
public class SampleRestController {

    // @ResponseBody: json 형식으로 데이터를 리턴 (jackson-databind를 사용)
    @ResponseBody
    @RequestMapping("test/doF")
    public ProductDTO doF() {
        // Json Data 가 리턴됨
        return new ProductDTO("냉장고", 5000000);
    }
}