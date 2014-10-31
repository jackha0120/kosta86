<%-- 
    Document   : testloadService
    Created on : 2014. 10. 30, 오전 10:24:05
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script>
            $(document).ready(function() {
                $('div').css({'width': '200px', 'background': 'yellow'});
            });
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% for(int i=0; i<5; i++){ %>
        <p>하이<%=i%></p>
        <% }%>
        <div>여기는 서비스영역</div>
    </body>
</html>
