package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/04/19  15:46  周三
 * @Project: JavaWebTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */

public class HelloServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

        //ServletConfig为Servlet配置对象,里面存着Servlet的配置信息
        //配置名
        String servletName = config.getServletName();
        System.out.println("servletName = " + servletName);

        //配置的上下文路径
        ServletContext servletContext = config.getServletContext();
        System.out.println("servletContext = " + servletContext);

        //通过配置信息的key值找到对应的value值
        String aaa = config.getInitParameter("aaa");
        System.out.println("aaa = " + aaa);

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("HelloServlet");

        //测试获取ServletContext对象的作用域中的数据
        ServletContext servletContext = req.getServletContext();
        Object first = servletContext.getAttribute("first");
        System.out.println("first = " + first);
    }





    @Override
    public void destroy() {

    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}