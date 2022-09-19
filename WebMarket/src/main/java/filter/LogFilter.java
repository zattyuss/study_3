package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("*.jsp")
public class LogFilter extends HttpFilter implements Filter {
       
    public LogFilter() {
        super();
    }

	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("필터적용");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
