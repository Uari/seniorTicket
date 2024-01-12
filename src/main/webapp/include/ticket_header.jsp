<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  String nickname = (String)session.getAttribute("nickname");
  //로그인을 하지 않았다면 null이 출력됨
  //out.print(s_nickname);
%>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="">여기내GYM</a>
    <div class="collapse navbar-collapse">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="/auth/loginForm.jsp">로그인</a>
        </li>
        <li class="nav-item">
          <!-- 
        확장자가 jsp이면 서블릿을 경유하지 않는다. - 목록에 보여줄 데이터가 없다?
        조회버튼 -> /notice/noticeList.gd요청하자 -  오라클 서버를 경유함
        확장자가 .gd이면 오라클 서버를 경유하니까 조회결과를 쥐고 있다.
        쥔다 - request.setAttribute() - 화면 출력하기
         -->
          <a class="nav-link active" href="/notice/noticeList">공지사항</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/board/boardList">게시판</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/member/memberList.jsp">회원관리</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">QnA게시판</a>
        </li>
        
      </ul>
      <!-- 
        세션이 있는지 비교 - 스크립틀릿 -1번
        로그아웃 디자인 코드 삽입 -2번
        이벤트 처리 - 3번 - 자바스크립트 

      -->
      <%
        if(nickname != null){
        }
      %>
      <!-- 여기가 디자인 코드 삽입 위치  -->
      <form class="d-flex mb-2 mb-lg-0" role="search">
        <div class="me-auto mt-2 mb-lg-0"><%=nickname %>님.&nbsp;</div>
        <input type="button" class="btn btn-outline-success" onclick="logout()" value="로그아웃">
      </form>
      <script>
        const logout = () =>{
          console.log("로그아웃 버튼 클릭");
          location.href="/authc/logout";
        }
      </script>
    </div>
  </div>
</nav>
