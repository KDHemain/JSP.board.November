<%@ page language="java" contentType="text/html; pageEncoding=UTF-8" pageEncoding="UTF-8" %>


<h1> 게시물 작성 </h1>

<form>
    <div>
        <span>제목</span>
        <div>
            <input type = "text" name="subject" placeholder="제목을 입력해주세요" maxlength="50">
        </div>
    </div>

    <div>
        <span>내용</span>
        <div>
            <textarea name="content" placeholder="내용을 입력해주세요"></textarea>
        </div>
    </div>

    <div>
        <div>
            <button type="submit">작성</button>
        </div>
    </div>
</form>
