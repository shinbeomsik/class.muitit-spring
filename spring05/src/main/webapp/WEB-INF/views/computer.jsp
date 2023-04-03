<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- computer 호출 했을때 결과 담는 곳 -->
<table border=1>
<tr>
	<td>항목명</td>
	<td>가격</td>
</tr>
<tr>
	<td>${vo.com}</td>
	<td>${vo.price}원</td>
</tr>
<tr>
	<td>${vo.mouse}</td>
	<td>${vo.price2}원</td>
</tr>
<tr>
	<td>총계</td>
	<td>${vo.sum}원</td>
</tr>
</table>