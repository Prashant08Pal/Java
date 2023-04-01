package lectureEx;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		int a,b,sum;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:  ");
		 a =sc.nextInt();
		System.out.println("enter the first number :  ");
		b=sc.nextInt();
		sum=a+b;
		avg=sum/2;
		System.out.println("the sum of wo number is :"+sum);
		System.out.println("the average of two number is :"+avg);
	
	
	}

}
