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
		dataset.setValue(100, "����", "�㽶");
		dataset.setValue(200, "�Ϻ�", "�㽶");
		dataset.setValue(120, "����", "�㽶");
		dataset.setValue(150, "����", "Ѽ��");
		dataset.setValue(80, "�Ϻ�", "Ѽ��");
		dataset.setValue(100, "����", "Ѽ��");
		dataset.setValue(130, "����", "ƻ��");
		dataset.setValue(110, "�Ϻ�", "ƻ��");
		dataset.setValue(60, "����", "ƻ��");
		dataset.setValue(80, "����", "����");
		dataset.setValue(20, "�Ϻ�", "����");
		dataset.setValue(100, "����", "����");
		dataset.setValue(200, "����", "ľ��");
		dataset.setValue(100, "�Ϻ�", "ľ��");
		dataset.setValue(120, "����", "ľ��");
		
		JFreeChart chart = ChartFactory.createLineChart("ˮ������ͼ", "ˮ��","����", dataset, PlotOrientation.VERTICAL, true, true,false);
		
		CategoryPlot plot = chart.getCategoryPlot();
		LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
	//	renderer.setItemLabelsVisible(true);
		renderer.setBaseItemLabelsVisible(true);
		
		ChartUtilities.saveChartAsJPEG(new File("d:\\chart\\line2.jsp"), chart, 700, 500);
		System.out.println("������ϡ�����");
	}

}
