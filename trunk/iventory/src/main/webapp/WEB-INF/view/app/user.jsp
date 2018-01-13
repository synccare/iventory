<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

        <script src="<c:url value="/scripts/plugins/jquery/2.0.2/jquery.min.js"/>"></script>
<script src="<c:url value="/scripts/app/user.js"/>"></script>

 <!-- Content Header (Page header) -->
 <section class="content-header">
     <h1>
         Users
         <small>Manage your organization users</small>
     </h1>
     <ol class="breadcrumb">
         <li><a href="#"><i class="fa fa-home"></i></a></li>
         <li class="active">Users</li>
     </ol>
 </section>

 <!-- Main content -->
 <section class="content">
 
                     <div class="row">
                        <div class="col-md-12">
                            <!-- Custom Tabs -->
                            <div class="nav-tabs-custom">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#tab_1" data-toggle="tab"><i class="fa fa-table"></i> View</a></li>
                                    <li><a href="#tab_2" data-toggle="tab"><i class="fa fa-edit"></i> Modify</a></li>

                                    <li class="pull-right"><a href="#" class="text-muted"><i class="fa fa-gear"></i></a></li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane active" id="tab_1">
<div class="row">
    <div class="col-xs-12">
    
          <div class="box box-info">
            <div class="box-body">
<!--                 <h3 class="box-title">Responsive Hover Table</h3> -->
                <div class="box-tools">
                    <div class="input-group">
                        <input type="text" id="txtSearch" class="form-control input-sm pull-right" style="width: 40%;" placeholder="Search"/>
                        <div class="input-group-btn">
                            <button class="btn btn-sm btn-default" id="btnSearch"><i class="fa fa-search"></i></button>
                        </div>
                    </div>
                </div>
            </div><!-- /.box-header -->
            
        </div><!-- /.box -->
        
        
            <div class="table-responsive" id="tblUser">

             </div>
             
    
    

    </div>
</div>
                                    </div><!-- /.tab-pane -->
                                    <div class="tab-pane" id="tab_2">
  <div class="row">
     <!-- left column -->
     <div class="col-md-12">
     
               <!-- Horizontal Form -->
       <div class="box box-info">
<!--          <div class="box-header with-border"> -->
<!--            <h3 class="box-title">Horizontal Form</h3> -->
<!--          </div> -->
         <!-- /.box-header -->
         <!-- form start -->
         <form class="form-horizontal">
           <div class="box-body">
             <div class="form-group col-md-6">
               <label for="inputEmail3" class="col-sm-3 control-label">Email</label>

               <div class="col-sm-9">
                 <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
               </div>
             </div>
             <div class="form-group col-md-6">
               <label for="inputPassword3" class="col-sm-3 control-label">Password</label>

               <div class="col-sm-9">
                 <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
               </div>
             </div>
             <div class="form-group">
               <div class="col-sm-offset-2 col-sm-10">
                 <div class="checkbox">
                   <label>
                     <input type="checkbox"> Remember me
                   </label>
                 </div>
               </div>
             </div>
           </div>
           <!-- /.box-body -->
           <div class="box-footer">
             <button type="submit" class="btn btn-info">Sign in</button>
             <button type="submit" class="btn btn-default">Cancel</button>
           </div>
           <!-- /.box-footer -->
         </form>
         </div>
         
         </div>
   	</div>
                                    </div><!-- /.tab-pane -->
                                </div><!-- /.tab-content -->
                            </div><!-- nav-tabs-custom -->
                        </div><!-- /.col -->
                      </div>

</section>


