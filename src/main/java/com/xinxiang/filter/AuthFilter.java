package com.xinxiang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {
/*        System.out.println("i am in AuthFilter-->doFilter()-before servlet-(request come here)");
        chain.doFilter(request, response);
        System.out.println("i am in AuthFilter-->doFilter()-after servlet-(response come here)");*/
        System.out.println("In AuthFilter before doFilter"+System.currentTimeMillis());
        HttpServletRequest request2= (HttpServletRequest) servletRequest;
        System.out.println("getRequestURL:"+request2.getRequestURL());
        System.out.println("getScheme:"+request2.getScheme());
        System.out.println("getServerName:"+request2.getServerName());
        System.out.println("getServerPort:"+request2.getServerPort());
        System.out.println("getRequestURI:"+request2.getRequestURI());
        System.out.println("getServletPath:"+request2.getServletPath());
        System.out.println("getQueryString:"+request2.getQueryString());
        System.out.println("getMethod:"+request2.getMethod());
        chain.doFilter(servletRequest,servletResponse);
        System.out.println("In AuthFilter after doFilter"+System.currentTimeMillis());
    }
}
