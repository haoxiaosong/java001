package com.offcn1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Pie {
	public static void main(String[] args) throws Exception {
		DefaultPieDataset dataset =new DefaultPieDataset();
		dataset.setValue("JAVA", 20);
		dataset.setValue("WEB", 12);
		dataset.setValue("PHP", 11);
		dataset.setValue("UI", 2);
		dataset.setValue("SEQ", 5);
		
		JFreeChart chart = ChartFactory.createPieChart3D("学习课程人员比例", dataset, true, true, false);
		
		FileOutputStream out = new FileOutputStream("d:\\chart\\pie.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
	}
}
