package com.yhgm.servlet;

/**
 * Author:yanghua
 * Date:2023/10/13 8:07
 */

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("CharacterEncodingFilter is running...");
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest hreq = (HttpServletRequest)request;
        hreq.setCharacterEncoding("UTF-8");
        HttpServletResponse hresp = (HttpServletResponse)response;
        hresp.setContentType("text/html;charset=UTF-8");
        chain.doFilter(request, response);
    }
}
