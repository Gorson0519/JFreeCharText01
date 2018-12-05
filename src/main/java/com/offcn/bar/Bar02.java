package com.offcn.bar;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

public class Bar02 {

    public static void main(String[] args) throws IOException {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(23210.77,"北京","北京");
        dataset.setValue(47013.00,"上海","上海");
        dataset.setValue(3145.38,"深圳","深圳");
        dataset.setValue(11664.61,"成都","成都");
        dataset.setValue(17512.91,"苏州","苏州");
        dataset.setValue(0.00,"杭州","杭州");
        dataset.setValue(16371.00,"南京","南京");
        dataset.setValue(25437.63,"东莞","东莞");

        StandardChartTheme theme = new StandardChartTheme("CN");
        theme.setExtraLargeFont(new Font("宋体",Font.BOLD,20));
        theme.setRegularFont(new Font("宋体",Font.BOLD,20));
        theme.setLargeFont(new Font("宋体",Font.BOLD,20));
        ChartFactory.setChartTheme(theme);

        JFreeChart jFreeChart = ChartFactory.createBarChart3D("全国主要城市房屋日成交量", "城市", "成交面积(m²)",dataset,PlotOrientation.VERTICAL,true,true,false);
        jFreeChart.addSubtitle(new TextTitle("统计时间：2017-08-28"));
        CategoryPlot plot = jFreeChart.getCategoryPlot();

        BarRenderer renderer = new BarRenderer();
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", NumberFormat.getNumberInstance()));
        renderer.setBaseItemLabelsVisible(true);
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
        renderer.setItemLabelAnchorOffset(10D);

        plot.setRenderer(renderer);

        ChartUtilities.saveChartAsJPEG(new File("/Users/haogaofeng/Downloads/JFreeChart/bar002.jpg"),jFreeChart,700,600);
        System.out.println("ok");
    }
}
