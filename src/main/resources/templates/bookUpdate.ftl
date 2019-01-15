<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>hello</title>
</head>
<body>
	<form action="/book/doupdate" method="post">
		 <input type="hidden" name="id" value="${book.id?c}"/>
		 
		 图书名称：<input type="text" name="name" 
		 			value="${book.name}"/>
		 图书作者：<input type="text" name="author"
		 			value="${book.author}"/>
		 <input type="submit" value="登录"/>
	</form>
</body>
</html>
