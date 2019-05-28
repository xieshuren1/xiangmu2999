var yes = 1;
		var count = 1;
		$(function() {

			auditing(yes);

		})

		function nextpage1() {

			if (yes < count) {
				yes++;
				auditing(yes);
			}
		}
		function lastpage1() {

			if (yes > 1) {
				yes--;
			}
			auditing(yes);
		}

		function auditing(yes) {
			$
					.ajax({
						url : "getgostocklist",
						type : "post",
						data : {
							page : yes,
							suppliername : $("#input1").val()
						},
						dataType : "json",
						success : function(data) {
							count = data.num;
							document.getElementById("tableauditing").innerHTML = "";
							var t = document.getElementById("tableauditing");
							var th = "<tr class='table-primary'><th>入库编号</th><th>供应商</th><th>联系人</th><th>号码</th>"
									+ "<th>地址</th><th>购买数量</th><th>金额</th><th>药品名称</th><th>库存数量</th><th>操作</th></tr>";
							t.innerHTML += th;
							for (var i = 0; i < data.list.length; i++) {
								var tr = "<tr><td>"
										+ data.list[i].gsid
										+ "</td><td>"
										+ data.list[i].s.suppliername
										+ "</td><td>"
										+ data.list[i].s.suppliercontacts
										+ "</td><td>"
										+ data.list[i].s.supplierphone
										+ "</td>"
										+ "<td>"
										+ data.list[i].s.address
										+ "</td><td>"
										+ data.list[i].f.num
										+ "</td><td>"
										+ data.list[i].f.financialmoney
										+ "</td><td>"
										+ data.list[i].f.d.durgname
										+ "</td><td>"
										+ data.list[i].f.d.stk.stocknum
										+ "</td><td><a href='#' style='text-decoration:none' onclick='tuihuo("
										+ data.list[i].gsid
										+ ","
										+ data.list[i].f.num
										+ ","
										+ (data.list[i].f.financialmoney / data.list[i].f.num)
										+ ")'>退货</a></td></tr>";

								t.innerHTML += tr;
							}
							document.getElementById("a1").innerText = yes;
							document.getElementById("a3").innerText = data.num;

						}

					})
		}
		var number = 0;
		function tuihuo(s, num, price) {
			$('#f1').form('load', {
				bianhao : s,
				shuliang : num,
				jine : price + "/个"
			}).dialog('open');

			number = num;
		}
		$("#f1").dialog({
			title : "采购退货",
			modal : true,
			closed : true,
			buttons : [ {
				text : "確定",
				handler : function() {
					$.ajax({
						url : "durgrejection",
						type : "post",
						data : {
							bianhao : $("#bianhao").val(),
							shuliang : $("#shuliang").val(),
							jine : $("#jine").val(),
						},
						dataType : "json",
						success : function(data) {
							$("#f1").dialog("close").form("reset");

							if (data > 0) {

								$.messager.alert('警告操作', '采购退货成功！', 'warning');

							} else {

								$.messager.alert('警告操作', '采购退货失败！', 'warning');

							}

						}

					})
				}

			} ]

		});

		function douw() { 
			var n = $("#shuliang").val();
			if (n > number) {

				
				document.getElementById("shuliang").value = number;
			} else if(n=="") {

				document.getElementById("shuliang").value = "1";

			}else{
				document.getElementById("shuliang").value = n;
				
			}
		}