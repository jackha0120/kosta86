
var xhr = null;
// �������� �Ǻ�
function getRequest() {
    if (window.AcviveXObject) { // IE
        xhr = new AcviveXObject("Microsoft.XMLHTTP");
    } else { //Cross
        xhr = new XMLHttpRequest();
    }
}
function sendRequest(url, param, callback, method, async) {
    //getRequest ȣ��
    getRequest();
    // �޼��� ���� get�̸� �޼��� ���� GET�� �����ϰ� �ƴϸ� POST�� �����Ѵ�.
    method = (method.toLowerCase() == "get") ? "GET" : "POST";
    // �Ķ���� ���� null�̰ų� �����̸� null�� �����ϰ� �ƴϸ� param�� ��ü�� ����
    // �Ķ���� = ������
    param = (param == null || param == "") ? null : param;
    //GET����̰� null�� �ƴҶ� url�ڿ� ������ �ٿ��ش�.
    if (method == "GET" && param != null) {
        url = url + "?" + param;
    }
    // callback�Լ� : ������ ������ ���� ������ callback�Լ��� ����.
    xhr.onreadystatechange = callback; // ������ ������ �����ϴ� �Լ� ����
    // method : get��� post���, url�� get�ϰ��� post�� ��� 
    // async : �񵿱�İ� ����� ����� ���ϴ°�.
    xhr.open(method, url, async); // ��û���� ����
    // ������ ������Header���� Content-Type�� ����
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // ���� ��û ������
    // Post����� ���.
    xhr.send((method == "POST") ? param : null);
}
