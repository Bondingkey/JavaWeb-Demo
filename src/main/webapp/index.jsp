<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="helloServlet">Hello Servlet</a><br>
<a href="ServletContext">ServletContext</a><br>
<a href="Request">RequestTest</a>
<form action="Request" method="get">
    姓名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    性别:<input type="radio" name="sex" value="nan">男
        <input type="radio" name="sex" value="nv">女
    爱好:<input type="checkbox" name="hobbies" value="singsong">唱
        <input type="checkbox" name="hobbies" value="dance">跳
        <input type="checkbox" name="hobbies" value="rap"> rap
    <input type="submit" value="按钮">
</form>


</body>
</html>