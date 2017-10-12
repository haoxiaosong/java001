package com.offcn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Collector.Characteristics;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class Bar2 {

	public static void main(String[] args) throws Exception {
	//1.�������ݼ���
		double data[][] ={{150},{90},{200},{190},{50}};
		String rowKeys[]={"ƻ��","�㽶","����","Ѽ��","����"};
		String columsKeys[]={"����"};
		
	    CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columsKeys, data);
	//2.���ù�������������״ͼ
	    JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "����", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
	//3.���ù���������ͼƬ
	    FileOutputStream out= new FileOutputStream("D:\\chart\\bar2.jsp");
	    ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
	    System.out.println("�����ɹ���������");
	}

}
