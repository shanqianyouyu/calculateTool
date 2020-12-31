package ctgu.Entity.anchorcal;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.Entity.anchorcal
 * @author: 拉布拉多
 */
@Data
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
	public Double res2;
	public Double res3;

	public Double btn2;
	public Double btn3;// 计算选型

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
		btn3 = 1.0;
	}

	public void calOne() {
//		calT();
		if (btn1 == 1.0) {
			W = 8190.0;
		} else {
			W = 9460.0;
		}
		res1 = N * (a1 + c1) / W;
	}

	public void calTwo() {
		Double vis;
		if (btn3 == 1.0) {
			vis = a1 / b1;
		} else {
			vis = a1 / P;
		}
		A = calA(vis);
		if (btn2 == 1.0) {
			T = 0.4;
		} else if (btn2 == 2.0) {
			T = 0.3;
		} else if (btn2 == 3.0) {
			T = 0.2;
		} else if (btn2 == 4.0) {
			T = 0.1;
		}
		if (btn3 == 1.0)
			res2 = Tool.forMat(T * b1 * d1 / A);
		else
			res3 = Tool.forMat(P * A / (T * d1));
	}

	private void calT() {
		double[] t1 = { 1.70, 2.12, 2.55, 2.97 };
		double[] t2 = { 3.39, 4.24, 5.09, 5.94 };
		double[] t3 = { 5.09, 6.36, 7.64, 8.91 };
		double[] t4 = { 6.787, 8.484, 10.181, 11.878 };
		if (b1 <= 0.0) {
			return;
		} else if (b1 < 800) {
			Tool.getPointWithPoints(800.0, 6.787, 1000.0, 8.484, b1, null);

		} else if (b1 == 800) {

		} else if (b1 > 800 && b1 < 1000) {

		} else if (b1 == 1000) {

		} else if (b1 > 1000 && b1 < 1200) {

		} else if (b1 == 1200) {

		} else if (b1 > 1200 && b1 < 1400) {

		} else if (b1 == 1400) {

		} else if (b1 > 1400) {

		}
	}

	private Double calA(Double vis) {
		Double A;
		if (btn3 == 1.0) {
			vis = a1 / b1;
		} else {
			vis = a1 / P;
		}
		if (vis == 0) {
			A = 5.0;
		} else if (vis > 0 && vis < 0.1) {
			A = Tool.getYWithTwoPoints(0.0, 5.0, 0.1, 6.0, vis);
		} else if (vis == 0.1) {
			A = 6.0;
		} else if (vis > 0.1 && vis > 0.2) {
			A = Tool.getYWithTwoPoints(0.1, 6.0, 0.2, 7.0, vis);
		} else if (vis == 0.2)
			A = 7.0;
		else if (vis > 0.2 && vis < 0.3) {
			A = Tool.getYWithTwoPoints(0.2, 7.0, 0.3, 8.0, vis);
		} else if (vis == 0.3) {
			A = 8.0;
		} else if (vis > 0.3 && vis < 0.4) {
			A = Tool.getYWithTwoPoints(0.3, 8.0, 0.4, 9.0, vis);
		} else if (vis == 0.4) {
			A = 9.0;
		} else if (vis > 0.4) {
			A = Tool.getYWithTwoPoints(0.3, 8.0, 0.4, 9.0, vis);
		} else {
			return -1.0;
		}
		return A;
	}

}
