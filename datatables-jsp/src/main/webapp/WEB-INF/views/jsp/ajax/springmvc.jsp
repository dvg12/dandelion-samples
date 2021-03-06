<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<c:url var="datasource" value="/persons2" />

<div class="row-fluid">
   <div class="span12">
      <h3>Spring MVC integration</h3>
      <br />
   </div>
</div>

<datatables:table id="myTableId" url="${datasource}" serverSide="true" processing="true">
   <datatables:column title="Id" property="id" />
   <datatables:column title="FirstName" property="firstName" />
   <datatables:column title="LastName" property="lastName" />
   <datatables:column title="City" property="address.town.name" />
   <datatables:column title="Mail" property="mail" />
</datatables:table>
