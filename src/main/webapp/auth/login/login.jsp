<%@ page language="java"	contentType="text/html;charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>로그인 페이지</title>
  <%@include file="/common/bootstrap_common.jsp" %>

  <script type="text/javascript">
    /* 자바 스크립트 부분 */

  </script>

</head>
<body>
  <!-- header start -->
	<%@include file="/include/ticket_header.jsp" %>
	<!-- header end -->

  <div class="container mt-5">
		<div class="page-header">
			<h2 class="nav justify-content-center">로그인</h2>
			<hr />
		</div>
  </div>

  <div class='login-footer d-grid gap-2 d-md-flex justify-content-md-center'>
    <button type="button" class="btn btn-primary" style="background-color: #334CA5;" data-bs-toggle="modal" data-bs-target="#fineID">
      아이디 찾기
    </button>
    <button type="button" class="btn btn-primary" style="background-color: #334CA5;" data-bs-toggle="modal" data-bs-target="#finePW">
      비밀번호 찾기
    </button>
  </div>


<!--================================= footer start ==================================-->
	<%@include file="/include/ticket_footer.jsp" %>
<!--================================== footer end ===================================-->

<!-- ========================== [[ find ID Modal Start ]] ========================== -->
	<div class="modal" id="fineID">
	  <div class="modal-dialog modal-dialog-centered">
	    <div class="modal-content">
        
	      <!-- Modal Header -->
	      <div class="modal-header justify-content-center">
	        <h1>아이디 찾기</h1>
	      </div>
	      <!-- Modal body -->
	      <div class="modal-body">
          <form id="" method="get" action="">
            모달 바디
          </form>
	      </div>
          <!-- Modal footer -->	
	      <div class="modal-footer">
	        모달 풋터
	      </div>
	    </div>
	  </div>
	</div>
<!-- ========================== [[ find ID Modal End ]] ========================== -->
<!-- ========================== [[ find PW Modal Start ]] ========================== -->
<div class="modal" id="finePW">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header justify-content-center">
        <h1>비밀번호 찾기</h1>
      </div>
      <!-- Modal body -->
      <div class="modal-body">
        <form id="" method="get" action="">
          모달 바디
        </form>
      </div>
        <!-- Modal footer -->	
      <div class="modal-footer">
        모달 풋터
      </div>
    </div>
  </div>
</div>
<!-- ========================== [[ find PW Modal End ]] ========================== -->

</body>
</html>