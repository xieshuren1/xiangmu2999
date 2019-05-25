	$(function() {
			dept();
			$.ajax({
				url : "selecttype",
				type : "post",
				dataType : "json",
				success : function(data) {

					for (var i = 0; i < data.length; i++) {

						$("#a" + (i + 1)).text(data[i].typename);
						$("#a" + (i + 1)).attr('onclick',
								"s(" + data[i].typeid + ")");
						$("#a" + (i + 1)).attr('style',
								'color:black;text-decoration: none');

					}

				}

			})

			s(0);

		})
		function dept() {

			$.ajax({
				url : "getDept",
				type : "post",
				dataType : "json",
				success : function(data) {
					options = "";
					for (i = 0; i < data.length; i++) {
						options += "<option value="+data[i].supplierid+">"
								+ data[i].suppliername + "</option>"
					}
					$("#dept").append(options)

				}
			})

		}
		function s(a) {
			if(a>0){
				
				document.getElementById("input").value = "";
				
			}
			var n = $("#input").val();

			$("#ts").datagrid({
				type : "post",
				url : "selectdrug?tyid=" + a + "&&name=" + n,
				//fit : true,
				height : 400,

				columns : [ [ {
					checkbox : true,
					field : '',
					align : 'center',
				}, {

					field : 'durgname',
					title : '药品名称',
					align : 'center',
					width : 200,

				}, {
					field : 'durgbarcode',
					title : '药品条码',
					width : 100,
					align : 'center',
				}, {

					field : 'specifications',
					title : '药品规格',
					align : 'center',
					width : 100,

				}, {
					field : 'durgunit',
					title : '药品单位',
					width : 100,
					align : 'center',
				}, {
					field : 'durgbid',
					title : '预设进价',
					width : 100,
					align : 'center',
				}, {
					field : 'durgprice',
					title : '预设售价',
					width : 100,
					align : 'center',
				}, {
					field : 'manufacturer',
					title : '药品生产商',
					width : 380,
					align : 'center',
				} ] ],
				pagination : true,
				pageSize : 4,
				pageList : [ 4, 8, 12 ]
			});

		}

		var p = 0;

		user = {
			d : function() {
				var rows = $('#ts').datagrid('getSelections');
				if (rows.length > 1) {
					$.messager.alert('警告操作', '编辑记录只能选定一条数据！', 'warning');
				} else if (rows.length == 1) {

					$('#f').form('load', {
						id : rows[0].durgid,
						xm : 1,
						dlm : rows[0].durgbid
					}).dialog('open');

				} else {
					$.messager.alert('警告操作', '编辑记录至少选定一条数据！', 'warning');

				}

			},
			out : function() {

				if (p > 0) {
					var number = $("#xm").val();
					var s = number * p;
					var ss = s + ".00";
					document.getElementById("dlm").value = ss;

				} else {
					var price = $("#dlm").val();
					var number = $("#xm").val();
					p = price;
					var s = number * p;
					var ss = s + ".00";
					document.getElementById("dlm").value = ss;
				}

			},

		}

		$("#f").dialog({
			title : "药品采购",
			modal : true,
			closed : true,
			buttons : [ {
				text : "確定",
				handler : function() {
					$.ajax({
						url : "durgadd",
						type : "post",
						data : {

							stocknum : $("#xm").val(),
							minstock : 10,
							did : $("#id").val(),
							money : $("#dlm").val(),
							supplierid : $("#dept").val()
						},
						dataType : "json",
						success : function(data) {
							$("#f").dialog("close").form("reset");
							$('#ts').datagrid('reload');
							if (data > 0) {

								$.messager.alert('警告操作', '采购成功！', 'warning');

							} else {

								$.messager.alert('警告操作', '采购失败！', 'warning');

							}

						}

					})
				}

			} ]

		});