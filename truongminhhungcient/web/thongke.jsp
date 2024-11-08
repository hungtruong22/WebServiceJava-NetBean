<%-- 
    Document   : thongke
    Created on : Jan 10, 2024, 9:12:31 AM
    Author     : Admin
--%>

<%@page import="dichvu.ThongKeBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kiểm Tra LTPT</h1>
        <div>
            <a href="hienthicontroller">Quay lại</a>
                <table class="table table-hover table-bordered" border='1' width='100%'>
                    <thead class="table-dark">
                        <tr>	
                            <th class="col-sm-1 text-center">STT</th>
                            <th class="col-sm-1 text-center">Mã Phòng Ban</th>
                            <th class="col-sm-2 text-center">Tên Phòng Ban</th>
                            <th class="col-sm-2 text-center">Trung Bình Lương</th>
                            
                        </tr>
                    </thead>
                     <tbody class="table-warning">
                    <%
                        List<ThongKeBean> ds = (List<ThongKeBean>) request.getAttribute("dstke");
                        for (int i = 0; i < ds.size(); i++) {
                            ThongKeBean s = ds.get(i);
                            int stt = i;
                            stt++;
                    %>
                   
                        <tr>
                            <td class="text-center align-middle"><%=stt%></td>
                            <td class="text-center align-middle"><%=s.getMaPhongBan()%></td>
                            <td class="text-center align-middle"><%=s.getTenPhongBan() %></td>
                            <td class="text-center align-middle"><%=s.getTrungBinhLuong()%></td>                           
                        </tr>  
                    <%
                        }
                    %>
                     </tbody>
                </table>

            </div>
    </body>
</html>
