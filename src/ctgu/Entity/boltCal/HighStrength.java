package ctgu.Entity.boltCal;

import java.text.DecimalFormat;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * Copyright © 2019 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.Entity.boltCal
 * @author: 拉布拉多
 */
@Data
public class HighStrength {

	/*
	 * 普通螺栓受剪力
	 */
	public Double nv1 = 0.0;
	public Double t1 = 0.0;
	public Double d1 = 0.0;
	public Double V1 = 0.0;
	public Double An1 = 0.0;
	public Double n1 = 0.0;
	public Double btn11 = 2.0;
	public Double btn12 = 1.0;
	public Double btn13 = 2.0;

	/*
	 * 普通螺栓抗拉剪
	 */
	public Double nv2 = 0.0;
	public Double t2 = 0.0;
	public Double d2 = 0.0;
	public Double V2 = 0.0;
	public Double N2 = 0.0;
	public Double n2 = 0.0;
	public Double btn21 = 1.0;
	public Double btn22 = 1.0;
	public Double btn23 = 2.0;

	/*
	 * 高强度螺栓计算
	 */
	public Double nv3 = 0.0;
	public Double t3 = 0.0;
	public Double d3 = 0.0;
	public Double V3 = 0.0;
	public Double N3 = 0.0;
	public Double n3 = 0.0;
	public Double btn31 = 1.0;
	public Double btn32 = 1.0;
	public Double btn33 = 2.0;

	public void calPartOne() {
		Double fbt, fbv, fbc;
		Double nbv, nbc, Nbmin;
		Double f;
		if (btn11 == 1.0) {
			fbt = 170.0;
			fbv = 140.0;
			if (btn12 == 1.0)
				fbc = 305.0;
			else
				fbc = 385.0;
		} else if (btn11 == 2.0) {
			fbt = 210.0;
			fbv = 190.0;

			//
			fbc = 405.0;
		} else {
			fbt = 400.0;
			fbv = 320.0;
			fbc = 510.0;
		}
		nbv = nv1 * (Math.PI * d1 * d1 / 4) * fbv;
		nbc = d1 * t1 * fbc;
		Nbmin = Math.min(nbv, nbc);
		n1 = Math.ceil(V1 / Nbmin);// 向上取整
		// 验算
		if (btn12 == 1.0)
			f = 215.0;
		else
			f = 310.0;
		if ((V1 / An1) < f) {
			btn13 = 1.0;
		} else
			btn13 = 2.0;

	}

	public void calPartTwo() {
		Double fbt, fbv, fbc;
		Double nbv, nbc, Nbmin;

		if (btn21 == 1.0) {
			fbt = 170.0;
			fbv = 140.0;
			if (btn22 == 1.0)
				fbc = 305.0;
			else
				fbc = 385.0;
		} else if (btn21 == 2.0) {
			fbt = 210.0;
			fbv = 190.0;

			//
			fbc = 405.0;
		} else {
			fbt = 400.0;
			fbv = 320.0;
			fbc = 510.0;
		}
		nbv = nv2 * (Math.PI * d2 * d2 / 4) * fbv;
		nbc = d2 * t2 * fbc;
		Nbmin = Math.min(nbv, nbc);

		System.out.println(n2);
		n2 = Math.ceil(N2 / Nbmin);// 向上取整

		// 验证
		Double de, nbt, nv, nt;
		de = 0.88 * d2;
		nbt = (Math.PI * de * de / 4) * fbt;
		nv = V2 / n2;
		nt = N2 / n2;
		if (nv <= nbc && Math.sqrt(Math.pow(nv / nbv, 2.0) + Math.pow(nt / nbt, 2.0)) <= 1) {
			btn23 = 1.0;
		} else {
			btn23 = 2.0;
		}

	}

	public void calPartThree() {
		Double fbt, fbv, fbc;
		Double nbv, nbc, Nbmin, nbt;
		if (btn11 == 1.0) {
			fbt = 400.0;
			fbv = 250.0;

			fbc = 470.0;
		} else {
			fbt = 500.0;
			fbv = 310.0;

			//
			fbc = 590.0;
		}
		nbv = nv3 * (Math.PI * d3 * d3 / 4) * fbv;
		nbc = d3 * t3 * fbc;
		Nbmin = Math.min(nbv, nbc);
		n3 = Math.ceil(V3 / Nbmin);// 向上取整
		// 验算不是很懂
		nbt = Math.PI * Math.pow(0.88 * d3, 2) / 4.0 * fbt;
		Double Nv = V3 / n3;
		Double nt = N3 / n3;
		Double vis = Math.sqrt(Math.pow(nv3 / nbv, 2) + Math.pow(nt / nbt, 2));
		if (vis <= 1.0 && Nv < (nbc / 1.2)) {
			btn33 = 1.0;
		} else {
			btn33 = 2.0;
		}

	}

}
