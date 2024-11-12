package sbs.com.jsp.board.member;

import sbs.com.jsp.board.Rq;

public class MemberController {
    public void showJoin(Rq rq) {
        rq.appendBody("회원가입");
    }
}
