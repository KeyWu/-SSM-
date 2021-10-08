<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: BrokenMyth
  Date: 2021/1/30
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>主页</title>
<%--    <link rel="stylesheet" href="../resources/css/A.css" />--%>
    <link rel="stylesheet" href="../css/A.css" />
    <!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <style>
        a {
            color: black;
            font-size: 15px;
        }
        a:hover {
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            background-color: #03e9f4;
            box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0 100px #03e9f4;
        }
    </style>
</head>

<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <ul class="breadcrumb" >
                <li><a href="${pageContext.request.contextPath}/book/AllBook">主页</a> <span class="divider">/</span></li>
                <li><a href="${pageContext.request.contextPath}/loginUI">登录页</a> <span class="divider">/</span></li>
                <li><a href="${pageContext.request.contextPath}/toUpdataPassword">修改密码</a> <span class="divider">/</span></li>
                <li><a href="${pageContext.request.contextPath}/logout">注销</a> <span class="divider">/</span></li>
            </ul>
            <div class="row-fluid">
                <div class="span4">
                    <a class="btn" style="font-weight: bold;" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
                    <a class="btn" style="font-weight: bold;" href="${pageContext.request.contextPath}/book/AllBook">显示全部书籍</a>
                    <div class="btn-group" style="float: right;">
                        <form class="form-search" action="${pageContext.request.contextPath}/book/QueryBook">
                                <select class="selectpicker" name="QueryBook">
                                    <option value="0">--请选择--</option>
                                    <option value="bookId">书籍编号</option>
                                    <option value="bookName">书籍名称</option>
                                    <option value="bookCounts">书籍数量</option>
                                    <option value="detail">书籍详情</option>
                                </select>
                            <input class="input-medium search-query" type="text" name="Value"/> <button type="submit" class="btn">查找</button>
                        </form>
                    </div>
                </div>
            </div>
            <table class="table">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${Books}">
                        <tr>
                            <td>${book.bookId}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/toUpdataBook?bookId=${book.bookId}">修改</a>
                                &nbsp;&nbsp;|&nbsp;&nbsp;
                                <a href="${pageContext.request.contextPath}/book/DeleteBook?bookId=${book.bookId}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>

</html>
