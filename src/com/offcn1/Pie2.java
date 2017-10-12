package com.offcn1;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class Pie2 {
public static void main(String[] args) throws Exception {
	//1.定义数据集
	DefaultPieDataset dataset = new DefaultPieDataset();
	dataset.setValue("JAVA", 20);
	dataset.setValue("PHP", 12);
	dataset.setValue("WEB", 5);
	dataset.setValue("UI", 10);
	
	//2.创建JFreeChart对象
	JFreeChart chart = ChartFactory.createPieChart3D("学员比例", dataset, true, true, false);
	//副标题
	chart.addSubtitle(new TextTitle("2017年度"));
	PiePlot pieplot = (PiePlot) chart.getPlot();
	pieplot.setLabelFont(new Font("宋体",0,11));
	pieplot.setCircular(true);
	StandardPieSectionLabelGenerator standardPieIG =new StandardPieSectionLabelGenerator("{0}:({1}.{2})",NumberFormat.getNumberInstance(),NumberFormat.getPercentInstance());
	pieplot.setLabelGenerator(standardPieIG);
	pieplot.setExplodePercent("JAVA",0.23);
	
	//3.生成图片
	FileOutputStream out = new FileOutputStream("d:\\chart\\pie1.jpg");
	ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
	System.out.println("ok....");
}
}
