package sbs.com.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sbs.com.jsp.board.Rq;
import sbs.com.jsp.board.article.ArticleController;
import sbs.com.jsp.board.container.Container;
import sbs.com.jsp.board.member.MemberController;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Rq rq = new Rq(req,resp);

        MemberController memberController = Container.memberController;
        ArticleController articleController = Container.articleController;

        //http://localhost:8081/usr/article/list
        String url = req.getRequestURI();
        System.out.println(url);

        switch (url) {
            case "/usr/article/list" -> articleController.showList(rq);
            case "/usr/member/join" -> memberController.showJoin(rq);
        }
    }
}
