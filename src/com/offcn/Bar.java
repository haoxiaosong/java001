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
		dataset.setValue(100, "����", "ƻ��");
		dataset.setValue(90, "����", "�㽶");
		dataset.setValue(120, "����", "Ѽ��");
		dataset.setValue(190, "����", "����");
		
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ��", "����", dataset, PlotOrientation.HORIZONTAL, true, true, false);
		
		ChartUtilities.saveChartAsJPEG(new File("D:\\chart\\bar.jsp"), chart, 700, 500);
	
	}

}
