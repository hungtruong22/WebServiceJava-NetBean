<%-- 
    Document   : hienthi
    Created on : Jan 10, 2024, 8:49:46 AM
    Author     : Admin
--%>

<%@page import="dichvu.NhanVienBean"%>
<%@page import="dichvu.PhongBanBean"%>
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
        <h1>Bài Thi LTPT</h1>
        <form action="hienthicontroller" method="post">
        <label>Nhập tu khoa:</label>
        <input type="text" placeholder="Nhập tu khoa" name="txttk" >
        <input type="submit" name="kq" value="Search" class="btn btn-primary">
        <a href="thongkecontroller">Thống kê</a>
        <a href="hienthicontroller">Hiển thị tất cả</a>
    </form>
        
        <div class="container-fluid pt-3">
            <div class="row">
                <div class="col-2 ">
                    <div class="col-2 ">
                            <%
                            List<PhongBanBean> dspb = (List<PhongBanBean>) request.getAttribute("dspb");
                                for (int i = 0; i < dspb.size(); i++) {
                                    PhongBanBean pb = dspb.get(i);
                            %>
                            <a class="text-decoration-none" 
                               href="hienthicontroller?mpb=<%=pb.getMaPhongBan()%>"><hr><%=pb.getTenPhongBan()%></hr></a>
                            <%
                                }
                            %>
                        </div>
  </div>

                <div class="col-10 ">
                    <div>
                        <table class="table table-hover table-bordered" border='1' width='100%'>
                            <thead class="table-dark">
                                <tr>	
                                    <th class="col-sm-1 text-center">STT</th>
                                    <th class="col-sm-1 text-center">Mã NV</th>
                                    <th class="col-sm-2 text-center">Họ Tên</th>
                                     <th class="col-sm-2 text-center">Địa Chỉ</th>
                                    <th class="col-sm-2 text-center">Lương</th>
                                    <th class="col-sm-1 text-center">Mã Phòng Ban</th>
                                </tr>
                            </thead>
                            <tbody class="table-warning">
                                <%
                                    List<NhanVienBean> ds = (List<NhanVienBean>) request.getAttribute("dsnv");
                                    for (int i = 0; i < ds.size(); i++) {
                                        NhanVienBean s = ds.get(i);
                                        int stt = i;
                                        stt++;
                                %>

                                <tr>
                                    <td class="text-center align-middle"><%=stt%></td>
                                    <td class="text-center align-middle"><%=s.getMaNhanVien()%></td>
                                    <td class="text-center align-middle"><%=s.getHoTen()%></td>
                                    <td class="text-center align-middle"><%=s.getDiaChi()%></td>
                                    <td class="text-center align-middle"><%=s.getLuong()%></td>
                                    <td class="text-center align-middle"><%=s.getMaPhongBan()%></td>
                                </tr>  
                                <%
                                    }
                                %>
                            </tbody>
                        </table>

                    </div>
                </div>
      
            </div>
        </div>
    </body>
</html>
