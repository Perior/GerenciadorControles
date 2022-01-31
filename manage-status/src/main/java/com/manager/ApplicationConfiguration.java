package com.manager;

import com.manager.services.TelevisaoService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    
    //TODO: construir os beans.
    @Bean
    public TelevisaoService controleTvBase(){
        return new TelevisaoService();
    }

}
