package ctgu.Entity.anchorcal;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：钢板地锚的数据
 * 
 * @Package: ctgu.Entity.anchorcal
 * @author: 拉布拉多
 */

public class SteelAnchor {
	public Double h;
	public Double f1;
	public Double y0;
	public Double A;
	public Double K;
	public Double a;
	public Double b;
	public Double f;

	/**
	 * 两个按钮 btn1-地锚选型 btn2-土壤选型
	 */
	public Double btn1;
	public Double btn2;

	public Double checkValue;// 1.0 or 0.0

	public SteelAnchor() {
		h = 0.0;
		f1 = 30.0;// 默认 5t 特坚土选型
		y0 = 0.00000019;// 默认
		A = 0.0;
		K = 2.0;
		a = 0.0;
		b = 0.0;
		f = 0.0;
		btn1 = 1.0;// 默认5t
		btn2 = 1.0;// 默认特坚土

		checkValue = 0.0;
	}

	public void getRes() {
		Double x = Math.sin(A) * h * y0
				* (a * b + (a + b) * h * Math.tan(f1) + 4.0 / 3.0 * h * Math.pow(Math.tan(f1), 2));
		f = 9.81 / 2.0 / x;

	}

}
