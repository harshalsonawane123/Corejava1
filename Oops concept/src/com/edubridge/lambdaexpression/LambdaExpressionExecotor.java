package com.edubridge.lambdaexpression;
//implemented functional interface method with the lambda expressin

public class LambdaExpressionExecotor {

	public static void main(String[] args) {
		//lambda expression
		Product p=(price)->{
			System.out.println("price is:"+ price);
		};
		System.out.println(p.displayProductName());
		System.out.println(Product.ProductBrand());
		p.displayProductPrice(1500);

	}

}
