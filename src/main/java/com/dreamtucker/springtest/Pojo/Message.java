package com.dreamtucker.springtest.Pojo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString(of={"name","age"})
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class Message {
    //test
    @Value("${myname}")
    private String name;

    @Value("${myid}")
    private String id;
}
