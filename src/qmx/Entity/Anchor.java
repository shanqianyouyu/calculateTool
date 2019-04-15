package qmx.Entity;

/*
 * 底层输入
 * d	圆木地锚直径或钢板地锚宽度，厘米		0.5
 * Q	地锚容许抗拔力，公斤				51.76
 * l	圆木地锚或钢板地锚长度			1
 * n	地横木根数						1
 * H	立筋板高度，厘米					
 * b	槽形挡板上、下两侧弯边部分的高度，厘米	
 * t1	槽形挡板的厚度，厘米				+
 * t2	立筋板的厚度，厘米
 * Φ	U形环圆杆截面的直径，厘米
 * 
 * 转换中间值
 * W		地锚中部组合断面（包括槽形挡板与立筋板）的抗弯截面系数，厘米 
 * q		地锚槽型挡板单位长度上的载重，公斤/厘米
 * M		地锚槽形挡板U形环固定点的弯矩，公斤 厘米
 * (JN)1	槽型挡板对组合断面形心轴 的惯性矩，厘米 	
 * (JN)2 	单条立筋板对组合断面形心轴 的惯性矩，厘米 
 * y0		地锚中部组合断面的形心距离（对图中 轴），厘米
 * e1		槽形挡板的形心距离（对图中 轴），厘米
 * e2		立筋板的形心距离（对图中 轴），厘米
 * f1		槽形挡板截面积，厘米2
 * f2		单条立筋板截面积，厘米2	
*/

/**
 * 
 * @author 孙超
 *
 */
public class Anchor {

	private double d;
	private double Q;
	private double l;
	private double n;
	private double H;
	private double b;
	private double t1;
	private double t2;
	private double O;

	private double W;
	private double q;
	private double M;
	private double JN1;
	private double JN2;
	private double y0;
	private double e1;
	private double e2;
	private double f1;
	private double f2;

	public Anchor(double d, double q, double l, double n, double h, double b, double t1, double t2, double o) {
		super();
		this.d = d;
		this.Q = q;
		this.l = l;
		this.n = n;
		this.H = h;
		this.b = b;
		this.t1 = t1;
		this.t2 = t2;
		this.O = o;

		setM();
		setq();
		setW();
		setJN1();
		setJN2();
		setY0();
		setE1();
		setE2();
		setF1();
		setF2();
	}

	public void setM() {
		double m1 = l / 2 - 2 * O;
		M = Math.pow(m1, 2) / 2 * q;
	}

	public void setq() {
		q = Q / l;
	}

	public void setW() {
		W = (JN1 + 2 * JN2) / y0;
	}

	public void setJN1() {
		JN1 = d * Math.pow(t1, 3) / 12 + Math.pow(H + t1 / 2 - y0, 2) * d * t1
				+ 2 * (-t1 * Math.pow(b - t1, 3) / 12 + Math.pow(H - (b - t1) / 2 - y0, 2) * (b - t1) * t1);
	}

	public void setJN2() {
		JN2 = t2 * Math.pow(H, 3) / 12 + Math.pow(y0 - H / 2, 2) * H * t2;
	}

	public void setY0() {
		y0 = (f1 * e1 + 2 * f2 * e2) / (f1 + 2 * f2);
	}

	public void setE1() {
		e1 = (d * t1 * (H + t1 / 2) + 2 * (b - t1) * t1 * (H - (b - t1) / 2)) / (d * t1 + 2 * (b - t1) * t1);
	}

	public void setE2() {
		e2 = H / 2;
	}

	public void setF1() {
		f1 = d * t1 + 2 * (b - t1) * t1;
	}

	public void setF2() {
		f2 = H * t2;
	}

	public double getResult() {
		return M / W;
	}

//	public static void main(String[] args) {
//		Anchor anchor = new Anchor(d, q, l, n, h, b, t1, t2, o)
//	}
}
