<%--
  Created by IntelliJ IDEA.
  User: wanganda
  Date: 18-3-20
  Time: 下午2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/resources/js/jquery-3.3.1.js"></script>

<html>
<head>
    <title>功能开关</title>
</head>
<body>
<table align="center">
    <tr>
        <th>功能id</th>
        <th>功能名称</th>
        <th>状态</th>
        <th>更改</th>
    </tr>
    <c:forEach items="${functionControlList}" var="functionControl">
        <tr>
            <td id="${functionControl.id}">${functionControl.id}</td>
            <td>${functionControl.function.name}</td>
            <td id="status">${functionControl.status}</td>
            <td><input id="statusControl" type="button" name="statusControl" value=""/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

<script>

    $(document).ready(function () {
        $("input[id=statusControl]").each(function () {
            if($(this).parent().prev().text()==1){
                $(this).val('关闭');
            }else{
                $(this).val('打开');
            }
        })
    })

    $(document).on("click", "#statusControl", function () {

        var id = $(this).parent().parent().children().first().text();
        var url = "/functionControl/update";

        if($(this).parent().prev().text() == 1) {
            $.ajax({
                type:'post',
                url:url,
                contentType:'application/json;charset=utf-8',
                data:JSON.stringify({id:id, status:'0'}),
                success:function (data) {
                    $("#"+id).next().next().text(data.status);
                    $("#"+id).next().next().next().children().val('打开');
                }
            });

        }else {
            $.ajax({
                type:'post',
                url:url,
                contentType:'application/json;charset=utf-8',
                data:JSON.stringify({id:id, status:'1'}),
                success:function (data) {
                    $("#"+id).next().next().text(data.status);
                    $("#"+id).next().next().next().children().val('关闭');
                }
            });

        }
    });

</script>
