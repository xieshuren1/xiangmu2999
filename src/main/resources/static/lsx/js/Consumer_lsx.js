$(function() {
	
	findConsumer();
	$("#bt_selctConsumer").click(function() {
		findConsumer();
	})
	
	$('#Consumeradd').click(function() {

		 var ddd4 = jqueryAlert({
				'content' : '<h5>客户信息新增</h5><br><br>'
					+'<br>客户名称:&nbsp;&nbsp;<input id="khname1" type="test" /><br><br>'
					+'联系人:&nbsp;&nbsp;&nbsp;<input id="kh1" type="test"/><br><br>'
					+'电&nbsp;&nbsp;&nbsp;&nbsp;话:&nbsp;<input id="khtell1" type="test"/><br><br>'
					+'地&nbsp;&nbsp;&nbsp;&nbsp;址:&nbsp;<input id="khdz1" type="test"/><br><br>'
					+'备&nbsp;&nbsp;&nbsp;&nbsp;注:&nbsp;<input id="bz1" type="test" /><br>',
				'width' :'600px',
				'height' :'550px',
				'modal' : true,
				'buttons' : {
					'确定' : function() {
						var ypname=$('#khname1').val();
						var ypcode=$('#kh1').val();
						var ypsize=$('#khtell1').val();
						var ypdw=$('#khdz1').val();
						var ypjj=$('#bz1').val();
						if(ypname==''){
							jqueryAlert({
								'content' : '姓名不能为空哦！',
								'width' :'300px',
								'height' :'100px',
								'modal' : true,
							})
						}else if(ypcode==''){
							jqueryAlert({
								'content' : '联系人不能为空哦！',
								'width' :'300px',
								'height' :'100px',
								'modal' : true,
							})
						}else if(!(/^1(3|4|5|7|8)\d{9}$/.test(ypsize))){
							jqueryAlert({
								'content' : '请填写正确的号码！！',
								'width' :'300px',
								'height' :'100px',
								'modal' : true,
							})
						}else if (ypsize==''){
							jqueryAlert({
								'content' : '电话号码不能为空哦！！',
								'width' :'300px',
								'height' :'100px',
								'modal' : true,
							})
						}else if(ypdw==''){
							jqueryAlert({
								'content' : '地址不能为空哦！！',
								'width' :'300px',
								'height' :'100px',
								'modal' : true,
							})
						}else{
							$.ajax({
								url:'addsConsumer1s',
								data:{
									consumerid:1,
									consumername:ypname,
									consumercontacts:ypcode,
									consumerphone:ypsize,
									address:ypdw,
									remarks:ypjj,
								},
								success : function(du) {
									findConsumer();
								
									if(du>0){
										var ddd1 = jqueryAlert({
											'content' : '新增成功！！！！',
											'width' :'350px',
											'height' :'120px',
											'modal' : true,
											'buttons' : {
												'确定' : function() {
													ddd1.close();
												}
											}
										})
										ddd4.close();
									}
								}
								
							})
						}
						
						
					},
		 '取消' : function() {
			 ddd4.close();
		 }
				}
			})
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

   
         
         function delconsumer(id){
 			
 			var ddd1 = jqueryAlert({
 				'content' : '确定删除？',
 				'width' :'350px',
 				'height' :'120px',
 				'modal' : true,
 				'buttons' : {
 					'确定' : function() {
 						
 						$.ajax({
 							 url:'delConsumers',
 							 data:{
 								 ids:id,
 							 },
 							 success : function(te) {
 								findConsumer();
 								 if(te>0){
 									 var ddd2 = jqueryAlert({
 											'content' : '删除成功！！！！',
 											'width' :'350px',
 											'height' :'120px',
 											'modal' : true,
 											'buttons' : {
 												'确定' : function() {
 													
 													ddd2.close();
 												}
 											}
 										})
 										ddd1.close();
 								 }
 								 
 								 
 							 }
 						 })
 					},
 					'取消' : function() {
 						ddd1.close();
 					}
 				}
 			})
 			
              }
         
         function upconsumer(did){
 			$.ajax({
 				url:'upConsumerIDs',
 				data:{ids:did},
 				success : function(te) {
 					
 					
 					if(te!=null){
 						 var ddd4 = jqueryAlert({
 								'content' : '<h5>客户信息</h5><br>客户编号:&nbsp;&nbsp;&nbsp;&nbsp;<b>'+te.consumerid+ '</b><br>'
 									+'<br>客户名称:&nbsp;&nbsp;<input id="khname" type="test" value="'+te.consumername+'"/><br><br>'
 									+'联系人:&nbsp;&nbsp;&nbsp;<input id="kh" type="test" value="'+te.consumercontacts+'"/><br><br>'
 									+'电&nbsp;&nbsp;&nbsp;&nbsp;话:&nbsp;<input id="khtell" type="test" value="'+te.consumerphone+'"/><br><br>'
 									+'地&nbsp;&nbsp;&nbsp;&nbsp;址:&nbsp;<input id="khdz" type="test" value="'+te.address+'"/><br><br>'
 									+'备&nbsp;&nbsp;&nbsp;&nbsp;注:&nbsp;<input id="bz" type="test" value="'+te.remarks+'"/><br>',
 								'width' :'600px',
 								'height' :'550px',
 								'modal' : true,
 								'buttons' : {
 									'确定' : function() {
 										var ypname=$('#khname').val();
 										var ypcode=$('#kh').val();
 										var ypsize=$('#khtell').val();
 										var ypdw=$('#khdz').val();
 										var ypjj=$('#bz').val();
 										$.ajax({
 											url:'UpConsumer1s',
 											data:{
 												consumerid:te.consumerid,
 												consumername:ypname,
 												consumercontacts:ypcode,
 												consumerphone:ypsize,
 												address:ypdw,
 												remarks:ypjj,
 											},
 											success : function(du) {
 												findConsumer();
 											//	findallemp();
 												if(du>0){
 													var ddd1 = jqueryAlert({
 														'content' : '药品修改成功！！！！',
 														'width' :'350px',
 														'height' :'120px',
 														'modal' : true,
 														'buttons' : {
 															'确定' : function() {
 																ddd1.close();
 															}
 														}
 													})
 													ddd4.close();
 												}
 											}
 											
 										})
 									},
 						 '取消' : function() {
 							 ddd4.close();
 						 }
 								}
 							})
 					}
 				}
 				
 			})
 			
 			
 		}