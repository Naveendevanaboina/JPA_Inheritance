package com.neoteric.japconnection.japconnection.conditionalexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
@ComponentScan(basePackages = {"com.neoteric.japconnection.japconnection.conditionalexample"})
@Configuration
public class ConditionalBeanConfigurationDemo {

    @Conditional({MyRestSimpleCondition.class})
        @Bean
        public IntegrationWebService integrationWebService(){
            return  new RestWebServiceImpl();
        }
        @Conditional({MySoapSimpleCondition.class})
        @Bean
        public IntegrationWebService soapIntegrationWebService(){
            return  new SoapWebServiceImpl();
        }


    }
