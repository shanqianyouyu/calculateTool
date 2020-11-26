package ctgu.Entity.anchorcal;
/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：圆木地锚得数据
 * @Package: ctgu.Entity.anchorcal 
 * @author: 拉布拉多   
 */

import java.math.BigDecimal;

import org.junit.Test;

public class LogAnchor {
//	public BigDecimal A1 = new BigDecimal("0");// h
//	public BigDecimal A2 = new BigDecimal("0");// φ1
//	public BigDecimal A3 = new BigDecimal("0");// γ0
//	public BigDecimal A4 = new BigDecimal("0");// α
//	public BigDecimal A5 = new BigDecimal("0");// K
//	public BigDecimal A6 = new BigDecimal("0");// I
//	public BigDecimal A7 = new BigDecimal("0");// d
//
//	public BigDecimal AO1 = new BigDecimal("0");// Vb
//	public BigDecimal AO2 = new BigDecimal("0");// P
	public String A1 = "0";
	public String A2 = "0";
	public String A3 = "0";
	public String A4 = "0";
	public String A5 = "0";
	public String A6 = "0";
	public String A7 = "0";
	public String AO1 = "0";
	public String AO2 = "0";

	public static void main(String[] args) {

	}

	@Test
	public void calcu() {
		BigDecimal x = new BigDecimal(A7).multiply(new BigDecimal(A6));
		BigDecimal y = new BigDecimal(A7).add(new BigDecimal(A6)).multiply(new BigDecimal(A1))
				.multiply(new BigDecimal(Math.tan(Double.valueOf(A2))));
		BigDecimal z = new BigDecimal(A1)
				.multiply(new BigDecimal(Math.tan(Double.valueOf(A2)))
						.multiply(new BigDecimal(Math.tan(Double.valueOf(A2)))))
				.multiply(new BigDecimal("4")).divide(new BigDecimal("3"));
		// Vb
		BigDecimal r1 = x.add(y).add(z).multiply(new BigDecimal(A1)).setScale(4);
		AO1 = r1.toString();
		System.out.println(AO1);

	}

}
