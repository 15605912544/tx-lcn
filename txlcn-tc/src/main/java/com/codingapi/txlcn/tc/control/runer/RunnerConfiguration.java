package com.codingapi.txlcn.tc.control.runer;

import com.codingapi.txlcn.tc.control.TransactionStepRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lorne
 * @date 2020/3/5
 * @description
 */
@Configuration
public class RunnerConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TransactionStepRunner createTransaction(){
        return new CreateTransaction();
    }


}
