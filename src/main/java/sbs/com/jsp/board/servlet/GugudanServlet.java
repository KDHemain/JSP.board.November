package sbs.com.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sbs.com.jsp.board.Rq;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // 들어오는 데이터를 UTF-8로 인식
        resp.setCharacterEncoding("UTF-8"); // 완성되는 HTML의 인코딩을 UTF-8로 하겠다.
        resp.setContentType("text/html;charset=UTF-8"); // 브라우저에게 우리가 만든 결과물이 UTF-8 이다. 라고 알리는것

        Rq rq = new Rq(req,resp);

//        int dan = Integer.parseInt(req.getParameter("dan"));
        int dan = rq.getIntparam("dan",9);
        int limit = rq.getIntparam("limit",9);

        rq.writer("<h1>==%d단==</h1>".formatted(dan));

        for(int i =0; i< limit; i++ ) {
            rq.writer("<div>%d * %d = = %d <div>".formatted(dan, i, dan * i));
        }
    }
}
