package com.liutao.filt;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class demo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 初始化方法
        System.out.println("init 初始化方法.");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        // 过滤处理前
        System.out.println("doFilter 过滤处理前.");

        // 继续执行过滤链
        filterChain.doFilter(servletRequest, servletResponse);

        // 过滤处理后
        System.out.println("doFilter 过滤处理后.");
    }

    @Override
    public void destroy() {
        // 销毁处理，释放资源
        System.out.println("destroy 销毁处理");
    }
}
