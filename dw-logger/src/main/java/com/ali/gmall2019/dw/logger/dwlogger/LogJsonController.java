package com.ali.gmall2019.dw.logger.dwlogger;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogJsonController {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;


    @RequestMapping("log")
    public String doLog(@RequestParam("logString") String logString){
        //1、补充时间戳




        return "success";
    }

}
