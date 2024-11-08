<%-- 
    Document   : dangnhapcontroller
    Created on : Jan 10, 2024, 9:20:25 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
    </head>
    <style>
        
        #c{
            width: 800px;
            margin: auto;
        }
    </style>
    <body>
        
        <div id="c">
            <h1>Dang Nhap</h1>
            <form class="form-signin" action="dangnhapController" method="post">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Đăng Nhập</h1>
                
                <input name="mavn"  type="text" id="inputEmail" class="form-control" placeholder="MaNV" required="" autofocus="">
                <input name="matkhau"  type="password" id="inputPassword" class="form-control" placeholder="Matkhau" required="">
				
					<p class="text-danger">${thongbaoloi}</p>
				
                

                <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i> Đăng nhập</button>
                
                </div>
                <hr>
                <!-- <button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> Đăng ký</button> -->
            </form>
            <br>

        </div>
    </body>
</html>
