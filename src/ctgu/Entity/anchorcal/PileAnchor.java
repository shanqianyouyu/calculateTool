package ctgu.Entity.anchorcal;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.Entity.anchorcal
 * @author: 拉布拉多
 */

public class PileAnchor {
	public Double a1;
	public Double c1;
	public Double N;
	public Double W;
	public Double res1;

	public Double btn1;

	public Double d1;
	public Double b1;
	public Double A;
	public Double T;
	public Double P;

	public Double btn2;

	public PileAnchor() {
		a1 = 0.0;
		c1 = 0.0;
		N = 0.0;
		W = 8190.0;// 选
		res1 = 0.0;// res
		d1 = 0.0;
		b1 = 0.0;
		A = 0.0;// 求
		T = 0.0;// 查
		P = 0.0;// res
		btn1 = 1.0;

		btn2 = 0.0;
	}

	public void calOne() {
		calT();
		res1 = N * (a1 + c1) / W;
	}

	public void calTwo() {

		P = T * b1 * d1 / A;
	}

	private void calT() {
		double[] t1 = { 1.70, 2.12, 2.55, 2.97 };
		double[] t2 = { 3.39, 4.24, 5.09, 5.94 };
		double[] t3 = { 5.09, 6.36, 7.64, 8.91 };
		double[] t4 = { 6.787, 8.484, 10.181, 11.878 };
		if (b1 <= 0.0) {
			return;
		} else if (b1 < 800) {

		}
	}

}
