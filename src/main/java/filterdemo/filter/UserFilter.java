package filterdemo.filter;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
@Order(1)
public class UserFilter implements Filter {
    private Logger logger= LoggerFactory.getLogger(UserFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       logger.trace("userfilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
