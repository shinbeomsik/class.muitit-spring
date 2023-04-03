<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border=1 style="text-align: center;">
<tr>
	<td>영화제목</td>
	<td>영화가격</td>
</tr>

<tr>
	<td>${vo.title}</td>
	<td>${vo.price}원</td>
</tr>
<tr>
	<td colspan=2> <a href = "">관람후기</a></td>
</tr>
</table>