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
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class Pie3 {

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
		
		PiePlot3D pieplot3d = (PiePlot3D) chart.getPlot();
		//设置开始角度
		pieplot3d.setStartAngle(120D);
		//设置方向为“顺时针方向”
		pieplot3d.setDirection(Rotation.CLOCKWISE);
		//设置透明度
		pieplot3d.setForegroundAlpha(0.75F);
		
		FileOutputStream out = new FileOutputStream("d:\\chart\\pie3.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 700);
		System.out.println("ok.....");
	}

}
