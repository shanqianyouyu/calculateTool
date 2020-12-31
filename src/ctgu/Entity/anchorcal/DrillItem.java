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
public class DrillItem {
	public Double ht;
	public Double FT;
	public Double D;
	public Double hc;
	public Double c;
	public Double Y;
	public Double Gt;
	public Double A;
	public Double o1;
	public Double K1;

	public Double res1;
	public Double res2;
	public Double Fu;
	public Double Fmax;

	public Double btn1 = 1.0;
	public Double btn2 = 1.0;
	public Double btn3 = 1.0;

	public void calOne() {
		Double hc1 = hc * D;
		res1 = 0.5 * A * c * Math.pow(hc1, 2) + (A * Math.pow(hc1, 3) + (ht - hc1) * Math.PI * D * D / 4) * Y + Gt;
		cal();
		res1 = Tool.forMat(res1);

	}

	public void calTwo() {
		Double hc1 = hc * D;
		res2 = ((FT - Gt - 0.5 * A * c * hc * hc) / Y - A * hc1 * hc1 * hc1) * 4 / (Math.PI * D * D) + hc1;
		cal();
		res2 = Tool.forMat(res2);

	}

	private void cal() {
		if (btn1 == 1.0) {
			Fu = res1 / Math.sin(Math.toRadians(o1));
		} else {
			Fu = FT / Math.sin(Math.toRadians(o1));
		}
		Fmax = Fu / K1;
		Fu = Tool.forMat(Fu);
		Fmax = Tool.forMat(Fmax);
	}

}
