<%--
  Created by IntelliJ IDEA.
  User: haogaofeng
  Date: 2018/11/29
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/echarts.common.min.js"></script>
</head>
<body>
    <div id="show" style="height: 600px;width: 700px"></div>
    <script type="text/javascript">
        var charset = echarts.init(document.getElementById("show"));
        var option = {
            title:{
                text:'柴鸡蛋8月价格'
            },
            legend:{
                data:["最高","最低","平均"]
            },
            xAxis:{
                data:['2017/8/1',
                    '2017/8/2',
                    '2017/8/3',
                    '2017/8/4',
                    '2017/8/5',
                    '2017/8/6',
                    '2017/8/7',
                    '2017/8/8',]
            },
            yAxis:{},
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            series:[{
                name:'最高',
                type:'line',
                data:[10,10,10,10,10,10,10,10]
            },{
                name:'最低',
                type:'line',
                data:[4.32,4.2,3.2,4.1,1.9,3.2,4,5,4.1]
            },{
                name:'平均',
                type:'line',
                data:[7.16,7.2,7.14,7.12,7.0,7.2,7.1,7.2]
            }]
        }
        charset.setOption(option);
    </script>
</body>
</html>
