<%--
  Created by IntelliJ IDEA.
  User: haogaofeng
  Date: 2018/11/29
  Time: 10:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/echarts.common.min.js"></script>
</head>
<body>
    <div id="show" style="width: 700px;height: 500px"></div>
    <script type="text/javascript">
        var charset = echarts.init(document.getElementById("show"));
        var option = {
            title:{
                text:"国主要城市房屋日成交量"
            },
            legend:{
                data:['成交套数(套)','成交面积(m²)']
            },
            xAxis:{
                data:['北京','上海','深圳','成都','苏州','杭州','南京','东莞']
            },
            yAxis:{},
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            series:[{
                name:'成交套数(套)',
                type:'bar',
                data:[202,475,33,114,152,382,109,219]
            },{
                name:'成交面积(m²)',
                type:'bar',
                data:[23210.77,47013.00,3145.38,11664.61,17512.91,0.00,16371.00,25437.63]
            }]
        };
        charset.setOption(option);
    </script>
</body>
</html>
