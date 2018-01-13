
$(document).ready(function() {
	setAjaxList();
});

/**
 * function for get apexMembers table
 */
var setAjaxList = function(){
	var q = $('#txtSearch').val();
	q = q.trim();

	console.info(q);
	$.ajax({
        type: "GET",
        url: "/ajax/userTbl",
        data: {
        	ajax:true,
        	q:q
        },
        success: function(data) {
          $("#tblUser").html(data);
       	  $("#tblUser").displayTagAjax();
        },
        error: function(data){
        	
        }
	});
}

$(document).on('click', '#btnSearch', function() {

	setAjaxList();
});
