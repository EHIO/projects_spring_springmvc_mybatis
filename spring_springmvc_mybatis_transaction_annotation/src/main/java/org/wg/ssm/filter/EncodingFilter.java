package org.wg.ssm.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by run on 2017/5/2.
 */
public class EncodingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html; charset=UTF-8");
        HttpServletRequest req = (HttpServletRequest) request;
        if ("GET".equalsIgnoreCase(req.getMethod())) {
            req = new GetRequest(req);
        } else {
            request.setCharacterEncoding("utf-8");
        }
        chain.doFilter(req, response);
    }

    @Override
    public void destroy() {

    }
}
