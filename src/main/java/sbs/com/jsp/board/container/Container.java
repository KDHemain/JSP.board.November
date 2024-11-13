package sbs.com.jsp.board.container;

import sbs.com.jsp.board.article.ArticleController;
import sbs.com.jsp.board.member.MemberController;

public class Container {
    public static ArticleController articleController;
    public static MemberController memberController;

    static {
        articleController = new ArticleController();
        memberController = new MemberController();
    }
}


