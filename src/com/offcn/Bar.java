package com.offcn;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Bar {

	public static void main(String[] args) throws Exception {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(100, "西安", "苹果");
		dataset.setValue(90, "西安", "香蕉");
		dataset.setValue(120, "西安", "鸭梨");
		dataset.setValue(190, "西安", "西瓜");
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset, PlotOrientation.HORIZONTAL, true, true, false);
		
		ChartUtilities.saveChartAsJPEG(new File("D:\\chart\\bar.jsp"), chart, 700, 500);
	
	}

}
