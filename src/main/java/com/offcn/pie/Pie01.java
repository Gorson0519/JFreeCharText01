package com.offcn.pie;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

public class Pie01 {

    public static void main(String[] args) throws IOException {
        DefaultPieDataset pieDataset = new DefaultPieDataset();

        pieDataset.setValue("奥迪Q5",9899);
        pieDataset.setValue("奔驰GLC",9006);
        pieDataset.setValue("奥迪Q3",7609);
        pieDataset.setValue("宝马X1",7451);
        pieDataset.setValue("奔驰GLA",6008);
        pieDataset.setValue("凯迪拉克XT5",3711);
        pieDataset.setValue("发现神行",3429);
        pieDataset.setValue("沃尔沃XC60",3300);
        pieDataset.setValue("揽胜极光",1518);
        pieDataset.setValue("讴歌CDX",1013);
        pieDataset.setValue("英菲尼迪QX50",518);

        StandardChartTheme theme = new StandardChartTheme("CN");
        theme.setExtraLargeFont(new Font("宋体", Font.BOLD,20));
        theme.setLargeFont(new Font("宋体", Font.BOLD,20));
        theme.setRegularFont(new Font("宋体", Font.BOLD,20));
        ChartFactory.setChartTheme(theme);

        JFreeChart pieChart3D = ChartFactory.createPieChart3D("2017年豪华汽车销量", pieDataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) pieChart3D.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:{1}--{2}", NumberFormat.getNumberInstance(),NumberFormat.getPercentInstance()));

        ChartUtilities.saveChartAsJPEG(new File("/Users/haogaofeng/Downloads/JFreeChart/pie001.jpg"),pieChart3D,800,800);
        System.out.println("ok");
    }
}
