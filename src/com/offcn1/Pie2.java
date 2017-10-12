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
	//1.�������ݼ�
	DefaultPieDataset dataset = new DefaultPieDataset();
	dataset.setValue("JAVA", 20);
	dataset.setValue("PHP", 12);
	dataset.setValue("WEB", 5);
	dataset.setValue("UI", 10);
	
	//2.����JFreeChart����
	JFreeChart chart = ChartFactory.createPieChart3D("ѧԱ����", dataset, true, true, false);
	//������
	chart.addSubtitle(new TextTitle("2017���"));
	PiePlot pieplot = (PiePlot) chart.getPlot();
	pieplot.setLabelFont(new Font("����",0,11));
	pieplot.setCircular(true);
	StandardPieSectionLabelGenerator standardPieIG =new StandardPieSectionLabelGenerator("{0}:({1}.{2})",NumberFormat.getNumberInstance(),NumberFormat.getPercentInstance());
	pieplot.setLabelGenerator(standardPieIG);
	pieplot.setExplodePercent("JAVA",0.23);
	
	//3.����ͼƬ
	FileOutputStream out = new FileOutputStream("d:\\chart\\pie1.jpg");
	ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
	System.out.println("ok....");
}
}
