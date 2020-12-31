package ctgu.Entity.anchorcal;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：钢板地锚的数据
 * 
 * @Package: ctgu.Entity.anchorcal
 * @author: 拉布拉多
 */
@Data
public class SteelAnchor {
	public Double h;
	public Double f1 = 30.0;
	public Double y0 = 1900.0;
	public Double A;
	public Double K;
	public Double a;
	public Double b;
	public Double res1;
	public Double res2;

	public Double f;

	/**
	 * 两个按钮 btn1-地锚选型 btn2-土壤选型 btn 计算选型
	 */
	public Double btn1 = 1.0;
	public Double btn2 = 1.0;
	public Double btn = 1.0;

	public Double checkValue = 0.0;// 1.0 or 0.0

	public SteelAnchor() {
		h = 0.0;
		f1 = 30.0;// 默认 5t 特坚土选型
		y0 = 1900.0;// 默认
		A = 0.0;
		K = 2.0;
		a = 0.0;
		b = 0.0;
		f = 0.0;
		btn1 = 1.0;// 默认5t
		btn2 = 1.0;// 默认特坚土
		btn = 1.0;
		
		checkValue = 0.0;
	}

	public void getResF() {
		Double x = Math.sin(Math.toRadians(A)) * h * y0
				* (a * b + (a + b) * h * Math.tan(Math.toRadians(f1)) + 4.0 / 3.0 * h * Math.pow(Math.tan(Math.toRadians(f1)), 2));
		res1 = 9.81 / 2.0 / x;
		res1 = Tool.forMat(res1);
	}

	public void getResH() {
		res2 = 9.81 / 2 / Math.sin(Math.toRadians(A)) * h * y0 * (a * b + (a + b) * Math.tan(Math.toRadians(f1)) + 4 / 3 * Math.pow(Math.tan(Math.toRadians(f1)), 2))
				/ f;
		res2 = Tool.forMat(res2);
	}

}
