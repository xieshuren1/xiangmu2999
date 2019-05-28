$(function() {

		orders();
	})
	function orders() {
		$("#order")
				.datagrid(
						{
							type : "post",
							url : "selorder?name=" + $("#input").val(),
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
										width : 200,
										formatter : function(value, row, index) {
											if (row.d) {
												if (row.d.durgname == null
														|| row.d.durgname == '') {
													return value;
												} else {
													return row.d.durgname;
												}
											}
										}

									},
									{
										field : 'suppliername',
										title : '供货商',
										width : 100,
										align : 'center',
										formatter : function(value, row, index) {
											if (row.d) {
												if (row.s.suppliername == null
														|| row.s.suppliername == '') {
													return value;
												} else {
													return row.s.suppliername;
												}
											}
										}
									},
									{

										field : 'suppliercontacts',
										title : '联系人',
										align : 'center',
										width : 100,
										formatter : function(value, row, index) {
											if (row.d) {
												if (row.s.suppliercontacts == null
														|| row.s.suppliercontacts == '') {
													return value;
												} else {
													return row.s.suppliercontacts;
												}
											}
										}

									},
									{
										field : 'odnumber',
										title : '药品数量',
										width : 100,
										align : 'center',
									},
									{
										field : 'durgbid',
										title : '单价/￥',
										width : 100,
										align : 'center',
										formatter : function(value, row, index) {
											if (row.d) {
												if (row.d.durgbid == null
														|| row.d.durgbid == '') {
													return value;
												} else {
													return row.d.durgbid;
												}
											}
										}
									},
									{
										field : 'manufacturer',
										title : '生产地址',
										width : 250,
										align : 'center',
										formatter : function(value, row, index) {
											if (row.d) {
												if (row.d.manufacturer == null
														|| row.d.manufacturer == '') {
													return value;
												} else {
													return row.d.manufacturer;
												}
											}
										}
									},
									{
										field : 'odmoney',
										title : '总价格/￥',
										width : 100,
										align : 'center',
									},
									{
										field : 'supplierphone',
										title : '联系人电话',
										width : 100,
										align : 'center',
										formatter : function(value, row, index) {
											if (row.d) {
												if (row.s.supplierphone == null
														|| row.s.supplierphone == '') {
													return value;
												} else {
													return row.s.supplierphone;
												}
											}
										}
									}, ] ],
							pagination : true,
							pageSize : 4,
							pageList : [ 4, 8, 12 ]
						});

	}

	user = {
		rk : function() {
			var rows = $('#order').datagrid('getSelections');
			if (rows.length > 1) {
				$.messager.alert('警告操作', '编辑记录只能选定一条数据！', 'warning');
			} else if (rows.length == 1) {
				alert(rows[0].odnumber);
				alert(rows[0].d.durgid);
				alert(rows[0].odmoney);
				alert(rows[0].s.supplierid);
				$.ajax({
					url : "durgadd",
					type : "post",

					data : {
						stocknum:rows[0].odnumber,
						did:rows[0].d.durgid,
						money:rows[0].odmoney,
						supplierid:rows[0].s.supplierid,
						oid:rows[0].oid
					},
					dataType : "json",
					success:function(data){
						if (data > 0) {

							$.messager.alert('警告操作', '入库成功！', 'warning');
							$('#order').datagrid('reload');
						} else {

							$.messager.alert('警告操作', '入库失败！', 'warning');

						}

						
						
						
					}

				})
				

			} else {
				$.messager.alert('警告操作', '编辑记录至少选定一条数据！', 'warning');

			}

		}

	}