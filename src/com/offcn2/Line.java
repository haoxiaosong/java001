package com.offcn2;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Line {

	public static void main(String[] args) throws Exception {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100, "北京", "香蕉");
		dataset.setValue(200, "上海", "香蕉");
		dataset.setValue(120, "西安", "香蕉");
		dataset.setValue(150, "北京", "鸭梨");
		dataset.setValue(80, "上海", "鸭梨");
		dataset.setValue(100, "西安", "鸭梨");
		dataset.setValue(130, "北京", "苹果");
		dataset.setValue(110, "上海", "苹果");
		dataset.setValue(60, "西安", "苹果");
		dataset.setValue(80, "北京", "菠萝");
		dataset.setValue(20, "上海", "菠萝");
		dataset.setValue(100, "西安", "菠萝");
		dataset.setValue(200, "北京", "木瓜");
		dataset.setValue(100, "上海", "木瓜");
		dataset.setValue(120, "西安", "木瓜");
		
		JFreeChart chart = ChartFactory.createLineChart("水果销量图", "水果","销量", dataset, PlotOrientation.VERTICAL, true, true,false);
		
		CategoryPlot plot = chart.getCategoryPlot();
		LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
	//	renderer.setItemLabelsVisible(true);
		renderer.setBaseItemLabelsVisible(true);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\line2.jsp"), chart, 700, 500);
		System.out.println("生成完毕。。。");
	}

}
