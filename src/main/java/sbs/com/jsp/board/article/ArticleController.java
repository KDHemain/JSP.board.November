package sbs.com.jsp.board.article;

import sbs.com.jsp.board.Rq;

public class ArticleController {
    public void showList(Rq rq) {
        rq.appendBody("게시물 리스트");
    }
}
