<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//스크릿트릿 
	JSONObject json = new JSONObject();
	json.put("today", "rain"); 
	json.put("temp", 20); 
	json.put("hu", 90); 
	
	
%><%= json.toJSONString() %>