<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF8">
    <title>Index</title>
</head>
<body>
<p>
	    用于验证集成了Spring和SpringMVC是否正常
	 <br>
	 <br>
	    页面以及服务器时间正常展示--->OK
</p>

<p>	
	通过mv传递过来的now视图参数,获取服务器时间
   	 服务器时间：<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>
</p>
</body>
</html>