package com.zs.ecms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.zs.ecms.mapper")
public class EcmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EcmsApplication.class, args);
    }

}
