<%@ page language="java"	contentType="text/html;charset=UTF-8"	pageEncoding="UTF-8"%>
<%
  String nickname = (String)session.getAttribute("nickname");
  //로그인을 하지 않았다면 null이 출력됨
  //out.print(s_nickname);
%>
<nav class="navbar navbar-expand-sm " style="background-color: #f5f5f7;">
  <div class="container-fluid">
    <a  href="/mainpage.jsp" class="navbar-brand fw-bold fs-3" >
      <img src="/images/icon/Ticket.png" alt="" width="47" height="50">
      베스트 시니어 티켓
    </a>

    <div class="collapse navbar-collapse fw-bold fs-4">
      <ul class="navbar-nav nav justify-content-center ms-auto me-auto mb-0 mb-lg-0">
        
          <a class="nav-link" href="/notice/openNotice.jsp">오픈공지</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/community/community.jsp">커뮤니티</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/reservation/ticketList.jsp">티켓팅</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/myPage/myPageForm.jsp">마이페이지</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/QnA/QnA.jsp">고객센터</a>
        </li>
        
      </ul>

      <ul class="navbar-nav me-2 mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="/auth/login/login.jsp">로그인</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/auth/regist/regist.jsp">회원가입</a>
        </li>
      </ul>
      
      <%
        if(nickname != null){
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
      <%
    }
      %>

      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="검색" aria-label="Search">
        <button class="btn btn btn-outline-primary" type="submit">

              <a  href="#">
                <img src="/images/icon/Search.png" alt="" width="30" height="30">
              </a>

        </button>
      </form>
    </div>
  </div>
</nav>
