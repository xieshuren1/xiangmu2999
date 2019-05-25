dept();
		function dept() {

			$.ajax({
				url : "getconsumer",
				type : "post",
				dataType : "json",
				success : function(data) {
				
					options = "";
					for (i = 0; i < data.length; i++) {
						options += "<option value="+data[i].consumerid+">"
								+ data[i].consumername + "</option>"
					}
					$("#muser").append(options)

				}
			})

		}
		mek();
		function mek() {

			$("#durgt").datagrid(
					{
						type : "post",
						url : "getdurgstock?name=" + $("#minput").val(),
						//fit : true,
						height : 400,

						columns : [ [
								{
									checkbox : true,
									field : '',
									align : 'center',
								},
								{

									field : 'durgname',
									title : '药品名称',
									align : 'center',
									width : 150,

								},
								{
									field : 'durgbarcode',
									title : '药品条码',
									width : 100,
									align : 'center',
								},
								{

									field : 'specifications',
									title : '药品规格',
									align : 'center',
									width : 100,

								},
								{
									field : 'durgunit',
									title : '药品单位',
									width : 100,
									align : 'center',
								},
								{
									field : 'durgbid',
									title : '预设进价',
									width : 100,
									align : 'center',
								},
								{
									field : 'durgprice',
									title : '预设售价',
									width : 100,
									align : 'center',
								},
								{
									field : 'manufacturer',
									title : '药品生产商',
									width : 380,
									align : 'center',
								},
								{
									field : 'stocknum',
									title : '仓库',
									width : 50,
									align : 'center',
									formatter : function(value, row, index) {
										if (row.stk) {
											if (row.stk.stocknum == null
													|| row.stk.stocknum == '') {
												return value;
											} else {
												return row.stk.stocknum;
											}
										}
									}

								} ] ],
						pagination : true,
						pageSize : 4,
						pageList : [ 4, 8, 12 ]
					});
		}
		var p = 0;
		mkeing = {
			d : function() {
				var rows = $('#durgt').datagrid('getSelections');
				if (rows.length > 1) {
					$.messager.alert('警告操作', '编辑记录只能选定一条数据！', 'warning');
				} else if (rows.length == 1) {

					$('#mf').form('load', {
						mbh:rows[0].durgid,
						id : rows[0].durgname,
						xm : 1,
						dlm : rows[0].durgprice,
						mkc : rows[0].stk.stocknum
					}).dialog('open');

				} else {
					$.messager.alert('警告操作', '编辑记录至少选定一条数据！', 'warning');

				}

			},
			out : function() {

				if (p > 0) {
					var number = $("#xm").val();

					var s = number * p;
					var ss = s;
					document.getElementById("dlm").value = ss;

				} else {
					var price = $("#dlm").val();
					var number = $("#xm").val();
					p = price;
					var s = number * p;
					var ss = s;
					document.getElementById("dlm").value = ss;
				}

			},
		}

		$("#mf").dialog({
			title : "销售",
			modal : true,
			closed : true,
			width:300,
			buttons : [ {
				text : "確定",
				handler : function() {
					$.ajax({
						url : "getmarketing",
						type : "post",
						data : {

							stocknum : $("#xm").val(),
							money : $("#dlm").val(),
							durgid : $("#mbh").val(),
							muser : $("#muser").val(),
							payment : $("#payment").val(),
							paymentmoney : $("#paymentmoney").val(),
							

						},
						dataType : "json",
						success : function(data) {
							$("#mf").dialog("close").form("reset");
							$('#durgt').datagrid('reload');
							if (data > 0) {

								$.messager.alert('警告操作', '销售成功！', 'warning');

							} else {

								$.messager.alert('警告操作', '销售失败！', 'warning');

							}

						}

					})
				}

			} ]

		});