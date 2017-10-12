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
		
		PiePlot3D pieplot3d = (PiePlot3D) chart.getPlot();
		//���ÿ�ʼ�Ƕ�
		pieplot3d.setStartAngle(120D);
		//���÷���Ϊ��˳ʱ�뷽��
		pieplot3d.setDirection(Rotation.CLOCKWISE);
		//����͸����
		pieplot3d.setForegroundAlpha(0.75F);
		
		FileOutputStream out = new FileOutputStream("d:\\chart\\pie3.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 700);
		System.out.println("ok.....");
	}

}
