package com.selfrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lujiahao
 * @date 2019-08-11 17:40
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // return new RandomRule(); //Ribbon默认是轮询，我自定义为随机
        return new NewRandomRule();
    }
}