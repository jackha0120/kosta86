
var xhr = null;
// 브라우저를 판별
function getRequest() {
    if (window.AcviveXObject) { // IE
        xhr = new AcviveXObject("Microsoft.XMLHTTP");
    } else { //Cross
        xhr = new XMLHttpRequest();
    }
}
function sendRequest(url, param, callback, method, async) {
    //getRequest 호출
    getRequest();
    // 메서드 값이 get이면 메서드 값을 GET를 저장하고 아니면 POST를 저장한다.
    method = (method.toLowerCase() == "get") ? "GET" : "POST";
    // 파라미터 값이 null이거나 공백이면 null을 저장하고 아니면 param그 자체값 저장
    // 파라미터 = 쿼리문
    param = (param == null || param == "") ? null : param;
    //GET방식이고 null이 아닐때 url뒤에 쿼리를 붙여준다.
    if (method == "GET" && param != null) {
        url = url + "?" + param;
    }
    // callback함수 : 서버의 응답이 들어올 때마다 callback함수를 실행.
    xhr.onreadystatechange = callback; // 서버의 응답이 도착하는 함수 지정
    // method : get방식 post방식, url은 get일경우와 post일 경우 
    // async : 비동기식과 동기식 방식을 정하는것.
    xhr.open(method, url, async); // 요청정보 지정
    // 응답을 받을때Header값을 Content-Type를 설정
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // 서버 요청 보내기
    // Post방식일 경우.
    xhr.send((method == "POST") ? param : null);
}
