package sbs.com.jsp.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.im.InputMethodRequests;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public Rq(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;

        try {
            req.setCharacterEncoding("UTF-8"); // 들어오는 데이터를 UTF-8로 인식
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8"); // 완성되는 HTML의 인코딩을 UTF-8로 하겠다.
        resp.setContentType("text/html;charset=UTF-8"); // 브라우저에게 우리가 만든 결과물이 UTF-8 이다. 라고 알리는것
    }
    public int getIntparam(String paranName, int defaultValue) {
        String value = req.getParameter(paranName);
        if (value == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException e) {
            return defaultValue;
        }
    }



    public String getparam(String paranName,String defaultValue) {
        String value = req.getParameter(paranName);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    public void writer(String str){
        try {
            resp.getWriter().append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
