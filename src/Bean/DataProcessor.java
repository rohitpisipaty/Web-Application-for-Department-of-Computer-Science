package Bean;
/*
 * Developed By Rohit Pisipaty (G01084064)
 */

import java.lang.Math;
	
public class DataProcessor {
	
	 String str;
	 String[] num;
	 double mean;
	
	public DataProcessor(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
		num = str.split(",");
		str = str.replace("[", "");
		str = str.replace("]", "");
		str = str.replace("\"", "");
		str = str.replace(" ", "");
		str = str.trim();
		num = str.split(",");
	}

//	public double mean(String str)
	public double mean()
	{		
		double sum=0;
		
		for(int i=0; i<num.length; i++)
		{
			sum+=Integer.parseInt(num[i]);
		}
		mean = sum/num.length;
		return mean;
	}
	
	public double standDev()
	{
		double variance=0;
		
		for(int i=0; i<num.length; i++)
		{
			variance+= Math.pow((Integer.parseInt(num[i])-mean), 2);
		}
		
		variance = variance/num.length;
		return Math.sqrt(variance);
	}
}
