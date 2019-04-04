package com.zs.ecms.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    Map<String,Object> exceptionMsg(Exception e){
        System.out.println(e);
        Map<String,Object> map = new HashMap<>();
        map.put("错误:",500);
        map.put("错误信息:","网页出现问题....");
        return map;
    }
}
