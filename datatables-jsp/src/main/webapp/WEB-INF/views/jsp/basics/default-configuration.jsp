<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<div class="row-fluid">
   <div class="span12">
      <h3>Default configuration</h3>
      <br />
   </div>
</div>

<div class="row-fluid">
   <div class="span12">
      <datatables:table id="myTableId" data="${persons}">
         <datatables:column title="Id" property="id" />
         <datatables:column title="LastName" property="lastName" />
         <datatables:column title="FirstName" property="firstName" />
         <datatables:column title="City" property="address.town.name" />
         <datatables:column title="Mail" property="mail" />
         <datatables:column title="Pocket money" property="pocketMoney" />
         <datatables:column title="Birthdate" property="birthDate" format="{0,date,dd-MM-yyyy}" />
         <datatables:column title="Company" property="company.name" />
      </datatables:table>
   </div>
</div>