<%-- 
    Document   : index
    Created on : 2014. 10. 31, 오후 1:55:18
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
                console.log('\n $란?\n' +$);      
                console.log('\n jQuery 란?\n'+jQuery);
            });
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
