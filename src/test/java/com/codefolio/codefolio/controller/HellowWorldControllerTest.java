package com.codefolio.codefolio.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HellowWorldController.class)    // 테스트 할 controller 지정
public class HellowWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;    // MockMvc 객체를 통해 컨트롤러 테스트

    @Test
    void sayHello_ShouldReturnHelloMessage() throws Exception {
        // MockMvc를 사용해 /api/hello 호출
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())    // HTTP 상태 코드가 200인지 검증
                .andExpect(content().string("Hello, Spring Boot!"));    // 응답 본문 내용 검증
    }
}
