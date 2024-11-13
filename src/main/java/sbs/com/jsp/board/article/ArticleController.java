package sbs.com.jsp.board.article;

import jakarta.servlet.http.HttpServlet;
import sbs.com.jsp.board.Rq;


import java.util.IntSummaryStatistics;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArticleController{
    public void showList(Rq rq) {
        ArrayList<Article> articleList = new ArrayList<>();


        // 테스트 게시물 생성
        IntStream.rangeClosed(1,5).forEach(i->articleList.add(new Article(i, "제목"+i,"내용"+i)));

        rq.setAttr("articleList", articleList);
        rq.view("usr/article/list");
        rq.appendBody("게시물 리스트");
    }
}
