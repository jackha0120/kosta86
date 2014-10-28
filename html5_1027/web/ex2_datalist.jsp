<%-- 
    Document   : ex2_datalist
    Created on : 2014. 10. 27, 오전 10:33:35
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html> <!-- 무슨 버전인지 명시해주는 것 html5를 명시-->
<!-- html을 먼저 연다 -->
<!-- head는 사용자에게 보여지지 않는 정보를 넣어두는 공간-->
<!-- body부분이 사용자에게 보여지는 부분-->
<html>
    <body>
        <form>
            <fieldset>
                <legend>datalist연습</legend>
                <!--for 는 바라보고있는 아이디를 명시 -->
                <label for="ss">Homepage:</label
                <!-- id : 고유의 이름. 페이지에서 하나여야 한다 -->
                <input type="url" id="ss"
                       list="s_data" required >
                <datalist id="s_data">
                    <!---데이터 루프 영역--->
                    <option value="http://www.shinhan.com"
                            label="신한"/>
                    <option value="http://www.naver.com"
                            label="네이버"/>
                    <option value="http://www.kosta.or.kr"
                            label="kosta"/>
                </datalist>
                <p><button type="submit">SEND</button></p>
            </fieldset>
        </form>
    </body>
</html>