<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <table border='2'>
 <tr>
 	<td class="top">ID</td>
 	<td class="top">NAME</td>
	<td class="top">CONTENT</td>
 	<td class="top">PRICE</td>
 	<td class="top">COMPANY</td>
 	<td class="top">IMG</td>
 </tr>
<c:forEach items="${list}" var="bag">
<tr>
	<td class="down">${bag.id}</td>
	<td class="down">${bag.name}</td>
	<td class="down">${bag.content}</td>
	<td class="down">${bag.price}</td>
	<td class="down">${bag.company}</td>
	<td class="down">${bag.img}</td>
</tr> 
</c:forEach>
</table>
