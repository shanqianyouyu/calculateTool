package ctgu.Entity.Across;

import org.junit.experimental.max.MaxCore;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * 
 * @Package: ctgu.Entity.Across
 * @author: 拉布拉多
 */
@Data
public class Across {
	public Double n11;
	public Double q11;
	public Double u1s;
	public Double b1z;
	public Double V11;
	public Double A1s;
	public Double K11;
	public Double u10;

	public Double btn1 = 1.0;
	public Double W1c;
	public Double q1F;
	public Double P11;

	public void calPartOne() {
		W1c = 200 * n11 * q11;
		q1F = u1s * b1z * A1s * Math.pow(V11, 2) / 1600.0;
		P11 = K11 * u10 * W1c;

		W1c = Tool.forMat(W1c);
		q1F = Tool.forMat(q1F);
		P11 = Tool.forMat(P11);
	}

	public Double H2max;
	public Double a21;
	public Double f21;
	public Double B21;
	public Double M21;
	public Double b21;
	public Double B22;
	public Double D21;

	public Double btn2 = 1.0;
	public Double btn3 = 1.0;
	public Double btn4 = 1.0;
	public Double btn5 = 1.0;
	public Double h21;
	public Double b2;
	public Double L21;

	public void calPartTwo() {
		h21 = H2max + a21 + f21;
		b2 = (B21 + 2 * M21) / Math.sin(Math.toRadians(b21));
		L21 = (B22 + 2 * D21) / Math.sin(Math.toRadians(b21));

		h21 = Tool.forMat(h21);
		b2 = Tool.forMat(b2);
		L21 = Tool.forMat(L21);
	}

	public Double H3max;
//	public Double a31;
	public Double f31;
//	public Double L31;
//	public Double L32;
//	public Double L33;
	public Double H31;
	public Double h31;
	public Double A31;
	public Double y31;
//	public Double a32;
	public Double L30;
	public Double b31;
	public Double B32;

	public Double btn6;
	public Double btn7;
	public Double btn8;
	public Double h3;
	public Double L3b;
	public Double L3;

	public void calPartThree() {
		Double a = H31 - h31;
		h3 = H3max + a + f31;
		Double L1 = a / (Math.tan(Math.toRadians(A31)) * Math.tan(Math.toRadians(b31))) * Math.sin(Math.toRadians(y31));
		Double L2 = L30 / Math.cos(Math.toRadians(A31));
		Double L33 = a / Math.tan(Math.toRadians(A31)) * Math.sin(Math.toRadians(y31));
		L3b = L1 + L2 + L33;
		L3 = 2 * L3b + B32 / Math.sin(Math.toRadians(b31));

		h3 = Tool.forMat(h3);
		L3b = Tool.forMat(L3b);
		L3 = Tool.forMat(L3);
	}

	public Double x41;
	public Double H41;
	public Double l41;
	public Double y41;
	public Double W41;
	public Double d41;
	public Double K41;

	public Double W4410;
	public Double Z4x;

	public void calPartFour() {
		W4410 = 0.0613 * K41 * d41;
		Z4x = W4410 * (x41 * (l41 - x41) / (2.0 * H41) + y41 / W41);
		W4410 = Tool.forMat(W4410);
		Z4x = Tool.forMat(Z4x);

	}

}
