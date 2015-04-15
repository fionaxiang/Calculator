
public class CalculatorDriver {
	public static void main(String [] args){
		//array is a group of data that has the same type
		double [] num = new double [5];
		num[0]=10.0;
		num[1]=11.0;
		num[2]=12.0;
		num[3]=13.5;
		num[4]=14.5;
		System.out.println("The average of these numbers is  " + Calculator.getAverage(num));
		System.out.println("The sum of these numbers is " + Calculator.getSum(num));
	    System.out.println("The product is  " + Calculator.getProduct(num));
	    System.out.println("The factorial is " + Calculator.getFactorial(num));
		System.out.println("Rectangle area is  " + Calculator.getRectangleArea(5.0,15.0));
		
	}
	}



