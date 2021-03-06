<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>

<div class="row-fluid">
   <div class="span12">
      <h3>Custom column rendering</h3>
      <br />
   </div>
</div>

<script src="<c:url value="/js/customrendering.js" />"></script>
<c:url var="datasource" value="/persons1" />

<datatables:table id="myTableId" url="${datasource}" serverSide="true" processing="true">
   <datatables:column title="Id" property="id" />
   <datatables:column title="FirstName" property="firstName" />
   <datatables:column title="LastName" property="lastName" />
   <datatables:column title="City" property="address.town.name" />
   <datatables:column title="Mail" property="mail" renderFunction="mailify" />
</datatables:table>
