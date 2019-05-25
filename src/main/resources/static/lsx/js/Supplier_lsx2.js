$(function() {
	
	findsupplier();
	$('#bt_selctSupplier').click(function() {
		findsupplier();
	})
})

 function findsupplier(page) {
				var name=$('#Suppliername').val();
				var phone=$('#SupplierPhone').val();
			        page = page == null ? 1 : page;
			        
			           $.ajax({
			                url : "showSuppliers",
			                type : "post",
			                datatype : "json",
			                data : {
			                    page : page,
			                    rows : 5,
			                    names:name,
			                    tells:phone,
			                },
			                success : function(data) {
			                    $("#todsy").html("");
			                    for (var i = 0; i < data.rows.length; i++) {
			                        $("#todsy")
			                            .append(
			                                "<tr><td>"
			                                + data.rows[i].supplierid
			                                + "</td><td>"
			                                + data.rows[i].suppliername
			                                + "</td><td>"
			                                + data.rows[i].suppliercontacts
			                                + "</td><td>"
			                                + data.rows[i].supplierphone
			                                + "</td><td>"
			                                + data.rows[i].address
			                                + "</td><td>"
			                                + data.rows[i].remarks		                             
			                                + "</td><td><button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:delconsumer("
			                                + data.rows[i].supplierid
			                                + ")'>删除</button>&nbsp;<button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:upconsumer("
			                                + data.rows[i].supplierid
			                                + ")'>编辑</button></td></tr>");
			                    }
			                  
			       			 
			                    $(".pagination").bootstrapPaginator(
			                        {
			                            bootstrapMajorVersion : 3,
			                            currentPage : page,
			                            numberOfPages : 5,
			                            totalPages : data.total,
			                            size : "small",
			                            alignment : "center",
			                            onPageClicked : function(event,
			                                                     originalEvent, type, page) {
			                            	findsupplier(page);
			                            }
			                        }); 
			                },
			            });
			    }