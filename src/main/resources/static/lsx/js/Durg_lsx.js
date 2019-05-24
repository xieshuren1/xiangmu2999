
		$(function() {
			 
			
			$.ajax({
				type:'get',
				url:'showsType',
				 success:function(List){
					 if(List!=null){
						// alert(List[1].typename);
						 for(var i=0;i<List.length;i++){
							 var str="<option value='"+List[i].typeid+"'>"+List[i].typename+"</option>";
							 $('#depname').append(str);
							 $('#yptype').append(str);
						 }
					 }
					 
					
				 }
				
			})
			findallemp();
			 $('#bt_selct').click(function() {
				//alert($('#depname').val())
				 findallemp();
			 })
			
			 
			 function findallemp(page) {
				var n=$('#ddname').val();
				var x=$('#depname').val();
			        page = page == null ? 1 : page;
			        
			           $.ajax({
			                url : "showDurgs",
			                type : "post",
			                datatype : "json",
			                data : {
			                    page : page,
			                    rows : 5,
			                    durgname:n,
			                    typeid:x,
			                },
			                success : function(data) {
			                    $("tbody").html("");
			                    for (var i = 0; i < data.rows.length; i++) {
			                        $("tbody")
			                            .append(
			                                "<tr><td>"
			                                + data.rows[i].durgid
			                                + "</td><td>"
			                                + data.rows[i].durgbarcode
			                                + "</td><td>"
			                                + data.rows[i].durgname
			                                + "</td><td>"
			                                + data.rows[i].specifications
			                                + "</td><td>"
			                                + data.rows[i].durgunit
			                                + "</td><td>"
			                                + data.rows[i].typename
			                                + "</td><td>"
			                                + data.rows[i].durgbid
			                                + "</td><td>"
			                                + data.rows[i].durgprice
			                                + "</td><td>"
			                                + data.rows[i].manufacturer			                             
			                                + "</td><td><button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:del("
			                                + data.rows[i].durgid
			                                + ")'>删除</button>&nbsp;<button class='btn btn-primary btn-sm' id='deldurg' onclick='javascript:updurg("
			                                + data.rows[i].durgid
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
			                                findallemp(page);
			                            }
			                        }); 
			                },
			            });
			    }  
			
			 
			
			
			 
			 
			
			 
			 //类型下拉框 新增
			 $('#durgadd').click(function() {
				 $.ajax({
						type:'get',
						url:'showsType',
						 success:function(List){
							 if(List!=null){
								// alert(List[1].typename);
								 for(var i=0;i<List.length;i++){
									 var str="<option value='"+List[i].typeid+"'>"+List[i].typename+"</option>";
									
									 $('#yptype').append(str);
								 }
							 }
							 
							
						 }
						
					})
					//药品xi
				 var ddd4 = jqueryAlert({
						'content' : '<h5>药品添加</h5><br>药品名称:&nbsp;<input id="ypname" type="test"/><br><br>'
							+'条形码:&nbsp;&nbsp;&nbsp;<input id="ypcode" type="test"/><br><br>'
							+'药品规格:&nbsp;<input id="ypsize" type="test"/><br><br>'
							+'药品单位:&nbsp;<input id="ypdw" type="test"/><br><br>'
							+'预设进价:&nbsp;<input id="ypjj" type="test"/><br><br>'
							+'预设售价:&nbsp;<input id="ypsj" type="test"/><br><br>'
							+'药品类型:&nbsp;&nbsp;<select id="yptype"  style="height: 30px;width:220px;">'
			                +'<option value=" ">所有类型</option></select><br><br>'
			                
							+'药品生产商:<input id="ypsc" type="test"/><br>',
						'width' :'750px',
						'height' :'650px',
						'modal' : true,
						'buttons' : {
							'确定' : function() {
								var ypname=$('#ypname').val();
								var ypcode=$('#ypcode').val();
								var ypsize=$('#ypsize').val();
								var ypdw=$('#ypdw').val();
								var ypjj=$('#ypjj').val();
								var ypsj=$('#ypsj').val();
								var yptype=$('#yptype').val();
								var ypsc=$('#ypsc').val();
								
								$.ajax({
									url:'addsDurgs',
									data:{
										durgname:ypname,
										durgbarcode:ypcode,
										specifications:ypsize,
										durgunit:ypdw,
										durgbid:ypjj,
										durgprice:ypsj,
										durgtype:yptype,
										manufacturer:ypsc,
									},
									success : function(du) {
										findallemp();
										if(du>0){
											var ddd1 = jqueryAlert({
												'content' : '新增药品成功！！！！',
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
			 })
			function durgs() {

				var durgname = $('#ypname').val(); //药品名称
				var durgbarcode = $('#ypcode').val();//药品条形码
				alert(durgname + "xxx" + durgbarcode)
				if (durgname != " ") {
					alert("111");
					findDurg(durgname, null);
				} else if (durgbarcode == " ") {
					findDurg(null, durgbarcode);
				} else if (durgname == " " && durgbarcode == " ") {
					findDurg(null, null);
				}

			}
			
		})
		 function del(id){
			
			var ddd1 = jqueryAlert({
				'content' : '确定删除？',
				'width' :'350px',
				'height' :'120px',
				'modal' : true,
				'buttons' : {
					'确定' : function() {
						$.ajax({
							 url:'delDurgs',
							 data:{
								 ids:id,
							 },
							 success : function(te) {
								
								 if(te>0){
									 var ddd2 = jqueryAlert({
											'content' : '药品删除成功！！！！',
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
		
		function updurg(did){
			$.ajax({
				url:'upDurgIDs',
				data:{ids:did},
				success : function(te) {
					if(te!=null){
						 var ddd4 = jqueryAlert({
								'content' : '<h5>药品信息</h5><br>药品编号:&nbsp;&nbsp;&nbsp;&nbsp;<b>'+te.durgid+ '</b><br>'
									+'药品名称:&nbsp;&nbsp;<input id="ypname2" type="test" value="'+te.durgname+'"/><br><br>'
									+'条形码:&nbsp;&nbsp;&nbsp;<input id="ypcode2" type="test" value="'+te.durgbarcode+'"/><br><br>'
									+'药品规格:&nbsp;<input id="ypsize2" type="test" value="'+te.specifications+'"/><br><br>'
									+'药品单位:&nbsp;<input id="ypdw2" type="test" value="'+te.durgunit+'"/><br><br>'
									+'预设进价:&nbsp;<input id="ypjj2" type="test" value="'+te.durgbid+'"/><br><br>'
									+'预设售价:&nbsp;<input id="ypsj2" type="test" value="'+te.durgprice+'"/><br><br>'
									+'药品类型:&nbsp;&nbsp;<select id="yptype2"  style="height: 30px;width:220px;">'
					                +'<option value="1">所有类型</option></select><br><br>'
					                
									+'药品生产商:<input id="ypsc2" type="test" value="'+te.manufacturer+'"/><br>',
								'width' :'750px',
								'height' :'650px',
								'modal' : true,
								'buttons' : {
									'确定' : function() {
										var ypname=$('#ypname2').val();
										var ypcode=$('#ypcode2').val();
										var ypsize=$('#ypsize2').val();
										var ypdw=$('#ypdw2').val();
										var ypjj=$('#ypjj2').val();
										var ypsj=$('#ypsj2').val();
										var yptype=$('#yptype2').val();
										var ypsc=$('#ypsc2').val();
										
										$.ajax({
											url:'UpDurgs',
											data:{
												durgid:te.durgid,
												durgname:ypname,
												durgbarcode:ypcode,
												specifications:ypsize,
												durgunit:ypdw,
												durgbid:ypjj,
												durgprice:ypsj,
												durgtype:yptype,
												manufacturer:ypsc,
											},
											success : function(du) {
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