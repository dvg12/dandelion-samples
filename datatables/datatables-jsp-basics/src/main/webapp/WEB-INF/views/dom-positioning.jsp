<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common/taglib.jsp"%>

<div class="row-fluid row-intro">
   <div class="span12">
      <h3>DOM positioning</h3>
      <p>
         The following examples shows how to use the <a href="http://dandelion.github.io/datatables/tutorials/basics/dom-positionning.html">DOM positioning</a> feature. 
      </p>
   </div>
</div>

<datatables:table id="myTableId" data="${persons}" dom="t">
   <datatables:column title="Id" property="id" />
   <datatables:column title="FirstName" property="firstName" />
   <datatables:column title="LastName" property="lastName" />
   <datatables:column title="City" property="address.town.name" />
   <datatables:column title="Mail" property="mail" />
</datatables:table>
