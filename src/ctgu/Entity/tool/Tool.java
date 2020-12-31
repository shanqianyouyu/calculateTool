package ctgu.Entity.tool;

import lombok.Data;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.Entity.tool
 * @author: 拉布拉多
 * @date: 2020年12月14日 下午2:04:31
 */
@Data
public class Tool {
	/*
	 * part1
	 */
	public Double R11 = 1.0;
	public Double R12 = 1.0;
	public Double F11 = 1.0;
	public Double t11 = 1.0;
	public Double n11 = 1.0;
	public Double n12 = 1.0;
	public Double btn1 = 1.0;

	public void calPartOne() {
		Double qs;
		if (btn1 == 1.0)
			qs = 215.0;
		else
			qs = 310.0;
		n11 = qs / (F11 / (2 * t11 * (R11 - R12)));
		n12 = qs / (F11 / (2 * t11 * R12));
		n11 = ctgu.awt.util.Tool.forMat(n11);
		n12 = ctgu.awt.util.Tool.forMat(n12);
	}

	/*
	 * part2
	 */
	public Double F21;
	public Double R21;
	public Double R22;
	public Double r21;
	public Double r22;
	public Double t21;
	public Double a21;
	public Double b21;
	public Double h21;

	public Double n21;
	public Double n22;
	public Double n23;
	public Double n211;
	public Double n2;

	public Double btn2 = 1.0;

	public void calPartTwo() {
		Double qs;
		if (btn1 == 1.0)
			qs = 215.0;
		else
			qs = 310.0;
		Double F2, F3;

		F2 = b21 / (a21 + b21) * F21;
		F3 = a21 / (a21 + b21) * F21;

		n21 = qs / (F21 / (2.0 * r21 * t21));
		n22 = qs / (F21 / (2.0 * r22 * t21) * b21 / (a21 + b21));
		n23 = qs / (F21 / (2.0 * r22 * t21) * a21 / (a21 + b21));

		n211 = qs / (F21 / (t21 * (R21 + R22 + h21 - 2 * r21)));
		Double vis = F21 / (t21 * R21 * R22 + h21 - 2 * r21)
				+ (a21 * b21 * F21 / (a21 + b21)) / ((a21 + b21) * h21 * h21 / 24);
		n2 = qs / vis;

		n21 = ctgu.awt.util.Tool.forMat(n21);
		n22 = ctgu.awt.util.Tool.forMat(n22);
		n23 = ctgu.awt.util.Tool.forMat(n23);
		n211 = ctgu.awt.util.Tool.forMat(n211);
		n2 = ctgu.awt.util.Tool.forMat(n2);
	}

	/*
	 * part3
	 */

	public Double F31;
	public Double F32;
	public Double f31;
	public Double R31;

	public Double n31;

	public Double btn3 = 1.0;

	public void calPartThree() {
		Double qs;
		if (btn3 == 1.0)
			qs = 215.0;
		else
			qs = 310.0;

		Double n = F31 / (0.25 * Math.PI * Math.pow(f31, 2));
		n31 = ctgu.awt.util.Tool.forMat(qs / n);
	}

	/*
	 * part4
	 */
	public Double F41;
	public Double O41;
	public Double n41;
	public Double btn4 = 1.0;

	public void calPartFour() {
		Double qs;
		if (btn4 == 1.0)
			qs = 215.0;
		else
			qs = 310.0;
		Double n = F41 / (0.25 * Math.PI * Math.pow(O41, 2));
		n41 = ctgu.awt.util.Tool.forMat(qs / n);
	}
}
