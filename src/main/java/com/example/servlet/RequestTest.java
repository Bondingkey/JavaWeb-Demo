package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/04/19  18:09  周三
 * @Project: JavaWebTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@WebServlet("/Request")
public class RequestTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数列表
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        String password = request.getParameter("password");
        System.out.println("password = " + password);

        String sex = request.getParameter("sex");
        System.out.println("sex = " + sex);

        String[] hobbies = request.getParameterValues("hobbies");
        for (String hobby : hobbies) {
            System.out.println("hobby = " + hobby);
        }

        System.out.println("-----------------------");

        //获取所有的参数键值对,以map的形式返回
        Map<String, String[]> parameterMap = request.getParameterMap();
        //获取map集合的所有key值,返回到Set集合中
        Set<String> KeySet = parameterMap.keySet();
        //遍历Set集合拿到所有的key值并拿着key值操作
        for (String key : KeySet) {
            System.out.println("key = " + key);
            //通过遍历出来的key去Map集合中找对应的value
            String[] value = parameterMap.get(key);
            for (String s : value) {
                System.out.println("value = " + s);
            }
        }

//        //获取请求头信息
//        //获取用户产品
//        String header = request.getHeader("User-Agent");
//        System.out.println("header = " + header);
//
//        //获取数据来源
//        String referer = request.getHeader("Referer");
//        System.out.println("referer = " + referer);
//
//        //获取上下文路径
//        String contextPath = request.getContextPath();
//        System.out.println("contextPath = " + contextPath);
//
//        String serverName = request.getServerName();
//        System.out.println("serverName = " + serverName);
//
//        int serverPort = request.getServerPort();
//        System.out.println("serverPort = " + serverPort);
//
//        //获取请求信息
//        String method = request.getMethod();
//        System.out.println("method = " + method);

    }
}