<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<display:table name="userList" id="userList" class="table table-hover table-bordered" export="true" pagesize="5"
 requestURI="/ajax/userTbl" offset="1" length="3" decorator="com.synclones.iventory.view.ActionButton">
	<display:column property="fullName" sortable="true" class="" headerClass="thead-inverse sortable" titleKey="user.fullName"/>
	<display:column property="email" sortable="true" class="" headerClass="thead-inverse" titleKey="user.email"/>
	<display:column property="phoneNumber" sortable="true" class="" headerClass="thead-inverse" titleKey="user.phoneNumber"/>
	<display:column property="epfNumber" sortable="true" headerClass="thead-inverse" titleKey="user.epfNumber" />

	<display:column media="html" class="text-center" headerClass="thead-inverse action-head" titleKey="tbl.actions">
		<button class='btn btn-success btn-sm' onclick='getUserAction("+user+", \"view\");' data-toggle='tooltip' title='View'><i class='fa fa-eye'></i></button>
		<button class='btn btn-primary btn-sm' onclick='getUserAction("+user+",\"edit\");' data-toggle='tooltip' title='Edit'><i class='fa fa-pencil'></i></button>
		<button class='btn btn-danger btn-sm' onclick='getUserAction("+user+",\"delete\");' data-toggle='tooltip' title='Delete'><i class='fa fa-times'></i></button>
		
	</display:column>
	
<%-- <display:column property="userCredentials" media="html" sortable="false" headerClass="thead-inverse" titleKey="user.credentials" /> --%>		  
<%-- <display:column property="userAction" media="html" sortable="false" class="action-btn" headerClass="thead-inverse action-head" titleKey="tbl.actions" /> --%>
				  
</display:table>