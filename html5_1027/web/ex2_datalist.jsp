<%-- 
    Document   : ex2_datalist
    Created on : 2014. 10. 27, ���� 10:33:35
    Author     : kosta
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html> <!-- ���� �������� ������ִ� �� html5�� ���-->
<!-- html�� ���� ���� -->
<!-- head�� ����ڿ��� �������� �ʴ� ������ �־�δ� ����-->
<!-- body�κ��� ����ڿ��� �������� �κ�-->
<html>
    <body>
        <form>
            <fieldset>
                <legend>datalist����</legend>
                <!--for �� �ٶ󺸰��ִ� ���̵� ��� -->
                <label for="ss">Homepage:</label
                <!-- id : ������ �̸�. ���������� �ϳ����� �Ѵ� -->
                <input type="url" id="ss"
                       list="s_data" required >
                <datalist id="s_data">
                    <!---������ ���� ����--->
                    <option value="http://www.shinhan.com"
                            label="����"/>
                    <option value="http://www.naver.com"
                            label="���̹�"/>
                    <option value="http://www.kosta.or.kr"
                            label="kosta"/>
                </datalist>
                <p><button type="submit">SEND</button></p>
            </fieldset>
        </form>
    </body>
</html>