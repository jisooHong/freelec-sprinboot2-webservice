package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
        //내장 was 실행
        //내장 was 란? : 별도로 외부에 was를 두지 않고 애플리케이션을 실행할때 내부에서 was를 실행하는것을 이야기 함, 톰캣 설치 필요 없음
    }
}
