
package com.tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {
    @Bean//para internalizacion
    public LocaleResolver localeResolver(){
     var slr = new SessionLocaleResolver();
     slr.setDefaultLocale(Locale.getDefault());
     slr.setLocaleAttributeName("session.current.locale");
     slr.setTimeZoneAttributeName("session.current.timezone");
     return slr;
    }
    
    //interceptar cambios de idioma internalizacion
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    @Override
    public void addInterceptors (InterceptorRegistry registro){
    registro.addInterceptor(localeChangeInterceptor());
    }
    
}
