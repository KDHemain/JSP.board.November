<%@ page language="java" contentType="text/html; pageEncoding=UTF-8" pageEncoding="UTF-8" %>

<%@ page import = "java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.stream.IntStream" %>
<%@ page import= "sbs.com.jsp.board.article.Article" %>

<%
    ArrayList<Article> articleList = (ArrayList<Article>) request.getAttribute("articleList");
%>

<h1> 게시물 리스트</h1>

<ul>
    <% for(Article article : articleList) { %>
    <li><%= article.getId()%>번 : <%=article.getSubject()%></li>
    <% } %>
</ul>