$(function() {
	
	findConsumer();
	$("#bt_selctConsumer").click(function() {
		findConsumer();
	})
})

 function findConsumer(page) {
				var name=$('#Consumername').val();
				var tell=$('#ConsumerPhone').val();
			        page = page == null ? 1 : page;
			        
			           $.ajax({
			                url : "showConsumers",
			                type : "post",
			                datatype : "json",
			                data : {
			                    page : page,
			                    rows : 5,
			                    names:name,
			                    phones:tell,
			                },
			                success : function(data) {
			                    $("#todsy").html("");
			                    for (var i = 0; i < data.rows.length; i++) {
			                        $("#todsy")
			                            .append(
			                                "<tr><td>"
			                                + data.rows[i].consumerid
			                                + "</td><td>"
			                                + data.rows[i].consumername
			                                + "</td><td>"
			                                + data.rows[i].consumercontacts
			                                + "</td><td>"
			                                + data.rows[i].consumerphone
			                                + "</td><td>"
			                                + data.rows[i].address
			                                + "</td><td>"
			                                + data.rows[i].remarks		                             
			                                + "</td><td><button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:delconsumer("
			                                + data.rows[i].consumerid
			                                + ")'>删除</button>&nbsp;<button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:upconsumer("
			                                + data.rows[i].consumerid
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
			                            	findConsumer(page);
			                            }
			                        }); 
			                },
			            });
			    }