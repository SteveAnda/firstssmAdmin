<%--
  Created by IntelliJ IDEA.
  User: wanganda
  Date: 18-3-30
  Time: ����5:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="GBK"  language="java" %>

<script type="text/javascript" src="/resources/js/jquery-3.3.1.js"></script>
<html>
<head>
    <title>ajax�ϴ��ļ�</title>
</head>
<body>
    <form id="fmUpload">
        <input id="upload" type="file" name="file" value=""/>
        <input id="btnUpload" type="button" value="�ϴ�"/>
    </form>
    <input name="test"/>
    <input id="btnTest" type="button" value="�ϴ�"/>
</body>
</html>
<script>
    $("#btnUpload").click(function () {
        var filename = $("#upload").val();
        var formData = new FormData(document.getElementById("fmUpload"));

        // if(filename != "" || filename.substring(filename.indexOf(".")) != -1 ){
        if(filename != "" && filename.lastIndexOf(".") != -1 ){
            $.ajax({
                url:"/upload/index",
                type:"post",
                data:formData,
                contentType:false,
                processData:false,
                success:function (data) {
                    console.log(data.version);
                    console.log(data.version);
                    alert("success");
                },
                error:function () {
                    alert("error");
                }

            })
        }
        else {
            alert("��ѡ����ȷ���ļ�");
        }
    })

    $("#btnTest").click(function () {
        var data = $("input[name='test']").attr("name");
        $.ajax({
            url:"/upload/index",
            type:"post",
            data:data,
            contentType:"text/html",
            success:function (result) {
                alert(result);
                alert("success");
            },
            error:function () {
                alert("error");
            }

        })
    });

</script>