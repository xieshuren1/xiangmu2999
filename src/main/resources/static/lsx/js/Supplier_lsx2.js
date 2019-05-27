$(function() {
	
	findsupplier();
	$('#bt_selctSupplier').click(function() {
		findsupplier();
	})
	
		$('#Supplieradd').click(function() {

		 var ddd4 = jqueryAlert({
				'content' : '<h3>供货商信息新增</h3><br><br>'
					+'<br>供货商名称:&nbsp;&nbsp;<input id="ghname1" type="test" /><br><br>'
					+'联系人:&nbsp;&nbsp;&nbsp;<input id="gh1" type="test"/><br><br>'
					+'电&nbsp;&nbsp;&nbsp;&nbsp;话:&nbsp;<input id="ghtell1" type="test"/><br><br>'
					+'地&nbsp;&nbsp;&nbsp;&nbsp;址:&nbsp;<input id="ghdz1" type="test"/><br><br>'
					+'备&nbsp;&nbsp;&nbsp;&nbsp;注:&nbsp;<input id="ghbz1" type="test" /><br>',
				'width' :'600px',
				'height' :'550px',
				'modal' : true,
				'buttons' : {
					'确定' : function() {
						var ypname=$('#ghname1').val();
						var ypcode=$('#gh1').val();
						var ypsize=$('#ghtell1').val();
						var ypdw=$('#ghdz1').val();
						var ypjj=$('#ghbz1').val();
						if(ypname==''){
							jqueryAlert({
								'content' : '供货商不能为空哦！',
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
							url:'addsSupplier',
							data:{
								supplierid:1,
								suppliername:ypname,
								suppliercontacts:ypcode,
								supplierphone:ypsize,
								address:ypdw,
								remarks:ypjj,
							},
							success : function(du) {
								findsupplier();
							
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
			                                + "</td><td><button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:delsupplier("
			                                + data.rows[i].supplierid
			                                + ")'>删除</button>&nbsp;<button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:upsupplier("
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
function delsupplier(id) {
	   
	   var ddd1 = jqueryAlert({
			'content' : '确定删除？',
			'width' :'350px',
			'height' :'120px',
			'modal' : true,
			'buttons' : {
				'确定' : function() {
					$.ajax({
						 url:'delSuppliers',
						 data:{
							 ids:id,
						 },
						 success : function(te) {
							 findsupplier();
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

function upsupplier(id){
		$.ajax({
			url:'upSupplierIDs',
			data:{ids:id},
			success : function(te1) {
				
				if(te1!=null){
					 var ddd4 = jqueryAlert({
							'content' : '<h5>供货商信息</h5><br>客户编号:&nbsp;&nbsp;&nbsp;&nbsp;<b>'+te1.supplierid+ '</b><br>'
								+'<br>供货商名称:&nbsp;&nbsp;<input id="ghname" type="test"  value="'+te1.suppliername+'"/><br><br>'
								+'联系人:&nbsp;&nbsp;&nbsp;<input id="gh" type="test"value="'+te1.suppliercontacts+'"/><br><br>'
								+'电&nbsp;&nbsp;&nbsp;&nbsp;话:&nbsp;<input id="ghtell" type="test" value="'+te1.supplierphone+'"/><br><br>'
								+'地&nbsp;&nbsp;&nbsp;&nbsp;址:&nbsp;<input id="ghdz" type="test" value="'+te1.address+'"/><br><br>'
								+'备&nbsp;&nbsp;&nbsp;&nbsp;注:&nbsp;<input id="ghbz" type="test" value="'+te1.remarks+'"/><br>',
							'width' :'600px',
							'height' :'550px',
							'modal' : true,
							'buttons' : {
								'确定' : function() {
									//alert(te1.supplierid)
									var ypname1=$('#ghname').val();
									var ypcode1=$('#gh').val();
									var ypsize1=$('#ghtell').val();
									var ypdw1=$('#ghdz').val();
									var ypjj1=$('#ghbz').val();
								
										
										$.ajax({
											url:'UPsSupplier',
											data:{
												supplierid:te1.supplierid,
												suppliername:ypname1,
												suppliercontacts:ypcode1,
												supplierphone:ypsize1,
												address:ypdw1,
												remarks:ypjj1,
											},
											success : function(du) {
												findsupplier();
												if(du>0){
													var ddd1 = jqueryAlert({
														'content' : '修改成功！！！！',
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