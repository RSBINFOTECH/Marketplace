package com.marketplace.MarketPlace;

public class primeno {
public static void main(String[] args) {
	
	
	int num=1;
	boolean flag=false;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			flag=true;
			break;
		}
	}
	if(!flag)
		System.out.println(num+"prime no");

	else
		System.out.println(num+"not prime number");
}
}
