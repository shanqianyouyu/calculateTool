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
public class AnglePileAnchor {
	public Double H;
	public Double y;
	public Double P;
	public Double W;
	public Double f1;

	public Double btn1 = 1.0;
	public Double btn2 = 1.0;
	public Double btn3 = 1.0;

	public void calPartOne() {
		f1 = Tool.forMat(P * (H + y) / W);
		if (btn2 == 1.0)
			btn3 = f1 <= 12850 ? 1.0 : 2.0;
		else
			btn3 = f1 <= 14850 ? 1.0 : 2.0;
	}

	public Double cT;
	public Double b;
	public Double H2;
	public Double T;

	public Double h;
	public Double p;

	public Double res1;
	public Double res2;
	public Double btn4 = 1.0;
	public Double btn5 = 1.0;
	public Double btn6 = 1.0;

	public void calPartTwo() {
		if (btn5 == 1.0) {
			Double A = calA(H2, h);
			res1 = cT * b * h / A;
			res1 = Tool.forMat(res1);
			if (cT <= T)
				btn6 = 1.0;
			else
				btn6 = 2.0;
		} else {
			
		}
	}

	public Double calA(Double H, Double h) {
		Double vis = H / h, A;
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
