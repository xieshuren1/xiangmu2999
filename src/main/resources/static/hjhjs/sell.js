$(function() {
	sell();

})
function sell() {
	$("#sell").datagrid(
			{
				type : "post",
				url : "getsell?name=" + $("#minput").val(),
				// fit : true,
				height : 400,

				columns : [ [
						{
							checkbox : true,
							field : 'sellid',
							align : 'center',
						},
						{

							field : 'durgname',
							title : '药品名称',
							align : 'center',
							width : 150,
							formatter : function(value, row, index) {
								if (row.f.d) {
									if (row.f.d.durgname == null
											|| row.f.d.durgname == '') {
										return value;
									} else {
										return row.f.d.durgname;
									}
								}
							}

						},

						{
							field : 'num',
							title : '销售数量',
							width : 100,
							align : 'center',
							formatter : function(value, row, index) {
								if (row.f) {
									if (row.f.num == null || row.f.num == '') {
										return value;
									} else {
										return row.f.num;
									}
								}
							}
						},
						{

							field : 'financialmoney',
							title : '销售金额',
							align : 'center',
							width : 100,
							formatter : function(value, row, index) {
								if (row.f) {
									if (row.f.financialmoney == null
											|| row.f.financialmoney == '') {
										return value;
									} else {
										return row.f.financialmoney;
									}
								}
							}

						},
						{
							field : 'consumername',
							title : '购买人',
							width : 100,
							align : 'center',
							formatter : function(value, row, index) {
								if (row.c) {
									if (row.c.consumername == null
											|| row.c.consumername == '') {
										return value;
									} else {
										return row.c.consumername;
									}
								}
							}
						},
						{
							field : 'financialdate',
							title : '销售时间',
							width : 100,
							align : 'center',
							formatter : function(value, row, index) {
								if (row.f) {
									if (row.f.financialdate == null
											|| row.f.financialdate == '') {
										return value;
									} else {
										return row.f.financialdate;
									}
								}
							}
						},
						{
							field : 'ptype',
							title : '支付方式',
							width : 100,
							align : 'center',
							formatter : function(value, row, index) {
								if (row.p) {
									if (row.p.ptype == null
											|| row.p.ptype == '') {
										return value;
									} else {
										return row.p.ptype;
									}
								}
							}
						}, ] ],
				pagination : true,
				pageSize : 4,
				pageList : [ 4, 8, 12 ]
			});
}

var p = 0;
mkeing = {
	d : function() {
		var rows = $('#sell').datagrid('getSelections');
		if (rows.length > 1) {
			$.messager.alert('警告操作', '编辑记录只能选定一条数据！', 'warning');
		} else if (rows.length == 1) {

			$('#mf').form('load', {
				mbh : rows[0].sellid,
				id : rows[0].c.consumername,
				xm : 1,
				dlm : (rows[0].f.financialmoney / rows[0].f.num),

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
	title : "销售退货",
	modal : true,
	closed : true,
	width : 300,
	buttons : [ {
		text : "確定",
		handler : function() {
			$.ajax({
				url : "getsellnext",
				type : "post",
				data : {

					sellid : $("#mbh").val(),
					cname : $("#id").val(),
					number : $("#xm").val(),
					fmoney : $("#dlm").val(),

				},
				dataType : "json",
				success : function(data) {
					$("#mf").dialog("close").form("reset");
					$('#sell').datagrid('reload');
					if (data > 0) {

						$.messager.alert('警告操作', '退货成功！', 'warning');

					} else {

						$.messager.alert('警告操作', '退货失败！', 'warning');

					}

				}

			})
		}

	} ]

});