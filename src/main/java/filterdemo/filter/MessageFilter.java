package filterdemo.filter;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
@Order(2)
public class MessageFilter implements Filter {
    private Logger logger=LoggerFactory.getLogger(MessageFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.trace("Message filte");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
