function 로그인() {
	id2 = 'root';
	
	id = prompt('아이디입력');
	
	if (id == id2) { //==
		alert('로그인성공');
	} else {
		alert('로그인실패');
	}
}

function 비교(){
	 n1 = 100;
	 n2 = 200;
	 //두 숫자가 동일한지 동일하지않은지 판별
	 
	 if (n1 == n2) {
		alert('동일합니다');
	} else {
		alert('다릅니다.');
	}
}

//친구의 기분 (굿, 별로, 나빠) 입력
//나의 기분 (굿, 별로, 나빠) 입력
//동일한지 않은지 판별하여 프린트
function 기분() {
	me = prompt("나의기분 (굿, 별로, 나빠) 입력");
	you = prompt("친구의기분 (굿, 별로, 나빠) 입력");
	
	if (me==you) {
		alert('동일합니다.');
	} else {
		alert('다릅니다.');
	}
	
}