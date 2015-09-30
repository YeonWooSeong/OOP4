package bean;

import java.util.Scanner;

/**
 */
public class CountMoney {
	public String[] countmoney(int price) {
		

		int []moneyUnit = {50000,10000,5000,1000,500,100,50, 10};
		int []resultmoney = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		
		for (int i = 0; i < moneyUnit.length; i++) {
			resultmoney[i] = price / moneyUnit[i];
			price = price % moneyUnit[i];
			
			results[i] = moneyUnit[i] + "원 : " + resultmoney[i] + "매";
			
		}
		return results;
	}	
	
}
