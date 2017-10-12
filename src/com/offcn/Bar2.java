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
	//1.创建数据集合
		double data[][] ={{150},{90},{200},{190},{50}};
		String rowKeys[]={"苹果","香蕉","橘子","鸭梨","榴莲"};
		String columsKeys[]={"西安"};
		
	    CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columsKeys, data);
	//2.调用工厂方法生成柱状图
	    JFreeChart chart = ChartFactory.createBarChart3D("水果销售图", "地区", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
	//3.调用工具类生成图片
	    FileOutputStream out= new FileOutputStream("D:\\chart\\bar2.jsp");
	    ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
	    System.out.println("创建成功。。。。");
	}

}
