<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>hello</title>
</head>
<body>
	 <table>
	 	<tr>
	 		<th>编号</th>
	 		<th>图书名称</th>
	 		<th>图书作者</th>
	 		<th>操作</th>
	 	</tr>
	 	<#list bookList as book>
	 		<tr>
	 			<td>${book.id}</td>
	 			<td>${book.name}</td>
	 			<td>${book.author}</td>
	 			<td>
	 				<a href="/book/preupdate/${book.id?c}">修改</a>
	 				<a href="/book/delete?id=${book.id?c}">删除</a>
	 			</td>
	 		</tr>
	 	</#list>
	 </table>
	 <a href="/book/add">添加</a>

</body>

</html>