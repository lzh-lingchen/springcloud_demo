package com.lzh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: li zhihong
 * @Date: 2024/6/28 14:25
 */
@SpringBootApplication
@MapperScan("com.lzh.cloud.mapper")
public class Main8001 {
  public static void main(String[] args)
  {
    SpringApplication.run(Main8001.class,args);
  }
}
