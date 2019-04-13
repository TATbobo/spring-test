package com.dreamtucker.springtest.Controller;


import com.dreamtucker.springtest.Pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @Autowired
    private Message message;
        @RequestMapping("/")
    String index(){
            return "我的名字是"+message.getName()+"我的id是"+message.getId();
        }
}
