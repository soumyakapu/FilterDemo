package filterdemo.config;

import filterdemo.filter.MessageFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean<MessageFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<MessageFilter> filterFilterRegistrationBean=new FilterRegistrationBean<MessageFilter>();
        filterFilterRegistrationBean.setFilter(new MessageFilter());
        filterFilterRegistrationBean.addUrlPatterns("/message/*");
        return filterFilterRegistrationBean;
    }
}
