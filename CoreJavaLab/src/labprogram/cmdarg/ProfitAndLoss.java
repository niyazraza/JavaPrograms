package labprogram.cmdarg;

public class ProfitAndLoss {

	public static void main(String[] args) {
		double sellingprice=Double.parseDouble(args[0]);
		double costprice=Double.parseDouble(args[1]);
		
		 double profit=sellingprice-costprice;
		double  loss=costprice-sellingprice;
		  
		  double profitPercentage=(profit/costprice)*100;
		 double lossPercentage=(loss/costprice)*100;
		  
		 if(sellingprice>costprice) {
			 System.out.println("profit :"+profit);
			 System.out.println("profit percentage:"+profitPercentage);
		 }else {
		 
		
		  System.out.println("loss :"+loss);
		  
		  System.out.println("loss percentage:"+lossPercentage);
		 }
		
	}

}
