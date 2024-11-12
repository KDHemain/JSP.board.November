<%@ page language="java" contentType="text/html; charSet=UTF-8" pageEncoding="UTF-8" %>


<%
int dan = Integer.parseInt(request.getParameter("dan"));
int limit = Integer.parseInt(request.getParameter("limit"));
%>

<h1><%=dan%>단</h1>
<% for(int i = 1; i <= limit ; i++) {%>
<div><%=dan%> * <%=i%> = <%= dan * i%> </div>
<%}%>


<%
    int a = 10;
%>
<div>
    <%=a%>
</div>
<h1>
    <%=a%>
</h1>
<% System.out.println(a);%>