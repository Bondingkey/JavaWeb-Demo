package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/04/19  16:14  周三
 * @Project: JavaWebTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@WebServlet("/ServletContext")
public class ServletConTextTest implements Servlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        //通过ServletRequest方式获得ServletContext
        ServletContext servletContext = req.getServletContext();

        //1,测试获得项目的上下文路径
        String contextPath = servletContext.getContextPath();
        System.out.println("contextPath = " + contextPath);

        //2,获取项目的全局初始化参数
        String cccc = servletContext.getInitParameter("cccc");
        System.out.println("cccc = " + cccc);

        //3,操作作用域
        servletContext.setAttribute("first","这是第一个数据");
        //存完数据就移除,其他Servlet还是获取不到
        servletContext.removeAttribute("first");



    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void init(ServletConfig config) throws ServletException {

    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {

    }
}