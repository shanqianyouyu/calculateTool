package ctgu.Entity;

import java.math.BigDecimal;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * 
 * @author 陈煜昆
 *
 */
@Data
public class SquareDerrickCal {

	double a[] = { 1.000, 1.000, 1.000, 0.999, 0.999, 0.998, 0.998, 0.997, 0.996, 0.995, 0.994, 0.993, 0.992, 0.991,
			0.989, 0.988, 0.986, 0.985, 0.983, 0.981, 0.979, 0.977, 0.976, 0.974, 0.972, 0.970, 0.968, 0.966, 0.964,
			0.963, 0.961, 0.959, 0.957, 0.955, 0.952, 0.950, 0.948, 0.946, 0.944, 0.941, 0.939, 0.937, 0.934, 0.932,
			0.929, 0.927, 0.924, 0.921, 0.919, 0.916, 0.913, 0.910, 0.907, 0.904, 0.900, 0.897, 0.894, 0.890, 0.886,
			0.883, 0.879, 0.875, 0.871, 0.867, 0.863, 0.858, 0.854, 0.849, 0.844, 0.839, 0.834, 0.829, 0.824, 0.818,
			0.813, 0.807, 0.801, 0.795, 0.789, 0.783, 0.776, 0.770, 0.763, 0.757, 0.750, 0.743, 0.736, 0.728, 0.721,
			0.714, 0.706, 0.699, 0.691, 0.684, 0.676, 0.668, 0.661, 0.653, 0.645, 0.638, 0.630, 0.622, 0.615, 0.607,
			0.600, 0.592, 0.585, 0.577, 0.570, 0.563, 0.555, 0.548, 0.541, 0.534, 0.527, 0.520, 0.514, 0.507, 0.500,
			0.494, 0.488, 0.481, 0.475, 0.469, 0.463, 0.457, 0.451, 0.445, 0.440, 0.434, 0.429, 0.423, 0.418, 0.412,
			0.407, 0.402, 0.397, 0.392, 0.387, 0.383, 0.378, 0.373, 0.369, 0.364, 0.360, 0.356, 0.351, 0.347, 0.343,
			0.339, 0.335, 0.331, 0.327, 0.323, 0.320, 0.316, 0.312, 0.309, 0.305, 0.302, 0.298, 0.295, 0.292, 0.289,
			0.285, 0.282, 0.279, 0.276, 0.270, 0.267, 0.264, 0.262, 0.259, 0.256, 0.253, 0.251, 0.248, 0.246, 0.243,
			0.241, 0.238, 0.236, 0.233, 0.231, 0.229, 0.226, 0.224, 0.222, 0.220, 0.218, 0.215, 0.213, 0.211, 0.209,
			0.207, 0.205, 0.203, 0.201, 0.199, 0.198, 0.196, 0.194, 0.192, 0.190, 0.189, 0.187, 0.185, 0.183, 0.182,
			0.180, 0.179, 0.177, 0.175, 0.174, 0.172, 0.171, 0.169, 0.168, 0.166, 0.165, 0.164, 0.162, 0.161, 0.159,
			0.158, 0.157, 0.155, 0.154, 0.153, 0.152, 0.150, 0.149, 0.148, 0.147, 0.146, 0.144, 0.143, 0.142, 0.141,
			0.140, 0.139, 0.138, 0.136, 0.135, 0.134, 0.133, 0.132, 0.131, 0.130 };
	double b[] = { 1.000, 1.000, 1.000, 0.999, 0.998, 0.997, 0.996, 0.995, 0.994, 0.992, 0.991, 0.989, 0.987, 0.985,
			0.983, 0.981, 0.978, 0.976, 0.973, 0.970, 0.967, 0.963, 0.960, 0.957, 0.953, 0.950, 0.946, 0.943, 0.939,
			0.936, 0.932, 0.929, 0.925, 0.922, 0.918, 0.914, 0.910, 0.906, 0.903, 0.899, 0.895, 0.891, 0.887, 0.882,
			0.878, 0.874, 0.870, 0.865, 0.861, 0.856, 0.852, 0.847, 0.842, 0.838, 0.833, 0.828, 0.823, 0.818, 0.813,
			0.807, 0.802, 0.797, 0.791, 0.786, 0.780, 0.774, 0.769, 0.763, 0.757, 0.751, 0.745, 0.739, 0.732, 0.726,
			0.720, 0.714, 0.707, 0.701, 0.694, 0.688, 0.681, 0.678, 0.668, 0.661, 0.655, 0.648, 0.641, 0.625, 0.628,
			0.621, 0.614, 0.608, 0.601, 0.594, 0.588, 0.581, 0.575, 0.568, 0.561, 0.555, 0.549, 0.542, 0.536, 0.529,
			0.523, 0.517, 0.511, 0.505, 0.499, 0.493, 0.487, 0.481, 0.475, 0.470, 0.464, 0.458, 0.453, 0.447, 0.442,
			0.437, 0.432, 0.426, 0.421, 0.416, 0.411, 0.406, 0.402, 0.397, 0.392, 0.387, 0.383, 0.378, 0.374, 0.370,
			0.365, 0.361, 0.357, 0.353, 0.349, 0.345, 0.341, 0.337, 0.333, 0.329, 0.326, 0.322, 0.318, 0.315, 0.311,
			0.308, 0.304, 0.301, 0.298, 0.295, 0.291, 0.288, 0.285, 0.282, 0.279, 0.276, 0.273, 0.270, 0.267, 0.265,
			0.262, 0.259, 0.256, 0.254, 0.251, 0.249, 0.246, 0.244, 0.241, 0.239, 0.236, 0.234, 0.232, 0.229, 0.227,
			0.225, 0.223, 0.220, 0.218, 0.216, 0.214, 0.212, 0.210, 0.208, 0.206, 0.204, 0.202, 0.200, 0.198, 0.197,
			0.195, 0.193, 0.191, 0.190, 0.188, 0.186, 0.184, 0.183, 0.181, 0.180, 0.178, 0.176, 0.175, 0.173, 0.172,
			0.170, 0.169, 0.167, 0.166, 0.165, 0.163, 0.162, 0.160, 0.159, 0.158, 0.156, 0.155, 0.154, 0.153, 0.151,
			0.150, 0.149, 0.148, 0.146, 0.145, 0.144, 0.143, 0.142, 0.141, 0.140, 0.138, 0.137, 0.136, 0.135, 0.134,
			0.133, 0.132, 0.131, 0.130, 0.129, 0.128, 0.127, 0.126, 0.125, 0.124, 0.123 };
	double[][] c = new double[][] { { 30, 3, 1.749, 1.373, 1.460, 0.910, 1.150, 0.590, 0.850 },
			{ 40, 3, 2.359, 1.852, 3.590, 1.230, 1.550, 0.790, 1.090 },
			{ 40, 4, 3.086, 2.422, 4.600, 1.220, 1.540, 0.790, 1.130 },
			{ 45, 4, 3.486, 2.736, 6.650, 1.380, 1.740, 0.890, 1.260 },
			{ 45, 5, 4.292, 3.369, 8.040, 1.370, 1.720, 0.880, 1.300 },
			{ 50, 4, 3.897, 3.059, 9.260, 1.540, 1.940, 0.990, 1.380 },
			{ 50, 5, 4.803, 3.770, 11.210, 1.530, 1.920, 0.980, 1.420 },
			{ 56, 4, 4.390, 3.446, 13.180, 1.730, 2.180, 1.11, 1.530 },
			{ 56, 5, 5.415, 4.251, 16.020, 1.720, 2.170, 1.100, 1.570 },
			{ 63, 5, 6.143, 4.822, 23.170, 1.940, 2.450, 1.250, 1.740 },
			{ 63, 6, 7.288, 5.721, 27.120, 1.930, 2.430, 1.240, 1.780 },
			{ 70, 5, 6.875, 5.397, 32.210, 2.160, 2.730, 1.390, 1.910 },
			{ 70, 6, 8.160, 6.406, 37.770, 2.150, 2.710, 1.380, 1.950 },
			{ 70, 7, 9.424, 7.398, 43.090, 2.140, 2.690, 1.380, 1.990 },
			{ 75, 6, 8.797, 6.905, 46.910, 2.310, 2.900, 1.490, 2.070 },
			{ 75, 7, 10.160, 7.976, 53.570, 2.300, 2.890, 1.480, 2.110 },
			{ 80, 6, 9.397, 7.376, 57.350, 2.470, 3.110, 1.590, 2.190 },
			{ 80, 7, 10.860, 8.525, 65.580, 2.460, 3.100, 1.580, 2.230 },
			{ 80, 8, 12.303, 9.658, 73.500, 2.440, 3.080, 1.570, 2.270 },
			{ 90, 6, 10.637, 8.350, 82.770, 2.790, 3.510, 1.800, 2.440 },
			{ 90, 7, 12.301, 9.656, 94.830, 2.780, 3.500, 1.780, 2.480 },
			{ 90, 8, 13.944, 10.946, 106.470, 2.760, 3.480, 1.780, 2.520 },
			{ 100, 8, 15.639, 12.276, 148.240, 3.080, 3.880, 1.980, 2.760 },
			{ 100, 10, 19.261, 15.120, 179.510, 3.050, 3.840, 1.960, 2.840 },
			{ 110, 8, 17.239, 13.532, 199.460, 3.400, 4.280, 2.190, 3.010 },
			{ 110, 10, 21.261, 16.690, 242.190, 3.380, 4.250, 2.170, 3.090 },
			{ 125, 8, 19.750, 15.504, 297.030, 3.880, 4.880, 2.500, 3.370 },
			{ 125, 10, 24.373, 19.133, 361.670, 3.850, 4.850, 2.480, 3.450 },
			{ 125, 12, 28.912, 22.696, 423.160, 3.830, 4.830, 2.460, 3.610 },
			{ 140, 10, 27.373, 21.488, 514.460, 4.340, 5.460, 2.780, 3.820 },
			{ 140, 12, 32.512, 25.522, 603.680, 4.310, 5.430, 2.760, 3.900 },
			{ 140, 14, 37.567, 29.490, 688.810, 4.280, 5.400, 2.750, 3.980 } };

	double d[] = { 0, 0.92, 0.75, 0.59, 0.43, 0.25, 0.10 };

	public double G;
	public double p;
	public double K;

	public double FT;
	public double FK;

	public double N;
	public double MZ;

	public double FQ;
	public double DO;
	public double FH;

	public double Q;
	public double GO;

	public double JF;
	public double JGB;
	public double L;
	public double L0;
	public double S;
	public double J;
	public double Z;

	public double JYV;
	public double DZ;
	public double ZF;
	public double TS;
	public double FL;
	public double QH;
	public double M;

	public double DO1;
	public double GZ;
	public double FB;
	public double GN;
	public double TD;
	public double FC;

	public double IX1;
	public double Z0;
	public double Z01;
	public double AS;
	public double L1;

	public Double LL1;
	public Double LL2;
	public Double LL3;
	public Double LL4;

	public double IX;
	public double IR;
	public double W;
	public double YX;
	public double Y0X;

	public double w1;
	public double GA;

	public double AY;

	public double DZ1;

	public double JL;
	public double HR;
	public double XO;

	public double DCB;

	public double LJJ;

	public double ND;
	public double DW;
	public double DWA;

	public double C;
	public double P;
	public double FS;
	public double FQ1;

	public double LX;
	public double V1;
	public double V2;
	public double XCB;
	public double XAX;
	public double WA;

	public double b1;
	public double b2;

	public double I1;
	public double I11;
	public double I2;
	public double I21;

	Double c2;
	Double c3;
	double c4;
	double c5;

	Double c6;
	Double c7;
	Double c8;
	Double c9;

	Double c10;
	Double c11;
	Double c12;
	Double c13;

	Double index1;
	Double index2;

	public double A1;
	public double KG;
	public double IXI;
	public double IXK;

	public double IX0;
	public double IY0;
	public double ZO;

	public double A11;
	public double KG1;
	public double IXI1;
	public double IXK1;

	public double IX01;
	public double IY01;
	public double ZO1;

	public Double B;
	public Double btn1 = 1.0;
	public Double O1;

	public SquareDerrickCal(double K, double p, double Q, double TD, double N, double G, double L, double L0, double Z,
			double S, double J, double FS, double FQ1, double I1, double I2) {
		this.K = K;
		this.p = p;
		this.Q = Q;
		this.TD = TD;
		this.N = N;
		this.G = G;
		this.L = L;
		this.L0 = L0;
		this.Z = Z;
		this.S = S;
		this.J = J;
		this.FS = FS;
		this.FQ1 = FQ1;
		this.I1 = I1;
		this.I2 = I2;
//		System.out.println(K);
//		System.out.println(p);
//		System.out.println(Q);
//		System.out.println(TD);
//		System.out.println(N);
//		System.out.println(G);
//		System.out.println(L);
//		System.out.println(L0);
//		System.out.println(Z);
//		System.out.println(S);
//		System.out.println(J);
//		System.out.println(FS);
//		System.out.println(FQ1);
//		System.out.println(I1);
//		System.out.println(I2);

	}

	public double add(double value1) {
		b1 = value1;
		return b1;
	}

	public double cal(double value2) {
		c2 = Math.ceil(value2);
		c3 = Math.floor(value2);
		c4 = BigDecimal.valueOf(a[Double.valueOf(String.valueOf(c3)).intValue()] - a[Double.valueOf(String.valueOf(c2)).intValue()])
				.divide(BigDecimal.valueOf(c2 - c3), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
		c5 = c4 * (value2 - c3) + a[Double.valueOf(String.valueOf(c3)).intValue()];
//		System.out.println(c5);
		return c5;
	}

	public double cal1(double value3) {
		if (value3 > 250) {
			c9 = 0.123;
		} else {
			c6 = Math.ceil(value3);
			c7 = Math.floor(value3);
			c8 = BigDecimal.valueOf(b[Double.valueOf(String.valueOf(c7)).intValue()] - b[Double.valueOf(String.valueOf(c6)).intValue()])
					.divide(BigDecimal.valueOf(c6 - c7), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
			c9 = c8 * (value3 - c7) + b[Double.valueOf(String.valueOf(c7)).intValue()];
		}
		return c9;
	}

	public double cal2(double value4) {
		Double c13 = null;
		if (btn1 == 1.0) {
			if (value4 >= 0.6) {
				c13 = 0.1;
			} else if (value4 > 0.5 && value4 < 0.6) {
				c13 = Tool.getPointWithPoints(0.5, 0.25, 0.6, 0.10, value4, c13);
			} else if (value4 == 0.5)
				c13 = 0.25;
			else if (value4 > 0.4 && value4 < 0.5) {
				c13 = Tool.getPointWithPoints(0.5, 0.25, 0.4, 0.43, value4, c13);
			} else if (value4 == 0.4)
				c13 = 0.43;
			else if (value4 > 0.3 && value4 < 0.4) {
				c13 = Tool.getPointWithPoints(0.3, 0.59, 0.4, 0.43, value4, c13);
			} else if (value4 == 0.3)
				c13 = 0.59;
			else if (value4 > 0.2 && value4 < 0.3) {
				c13 = Tool.getPointWithPoints(0.3, 0.59, 0.2, 0.75, value4, c13);
			} else if (value4 == 0.2)
				c13 = 0.75;
			else if (value4 > 0.1 && value4 < 0.2) {
				c13 = Tool.getPointWithPoints(0.1, 0.92, 0.2, 0.75, value4, c13);
			} else if (value4 == 0.1)
				c13 = 0.92;
			else if (value4 > 0.0 && value4 < 0.1) {
				c13 = Tool.getPointWithPoints(0.1, 0.92, 0.0, 1.0, value4, c13);
			}
		} else {
			if (value4 >= 0.6) {
				c13 = 0.115;
			} else if (value4 > 0.5 && value4 < 0.6) {
				c13 = Tool.getPointWithPoints(0.5, 0.262, 0.6, 0.115, value4, c13);
			} else if (value4 == 0.5)
				c13 = 0.262;
			else if (value4 > 0.4 && value4 < 0.5) {
				c13 = Tool.getPointWithPoints(0.5, 0.262, 0.4, 0.4405, value4, c13);
			} else if (value4 == 0.4)
				c13 = 0.4405;
			else if (value4 > 0.3 && value4 < 0.4) {
				c13 = Tool.getPointWithPoints(0.3, 0.596, 0.4, 0.4405, value4, c13);
			} else if (value4 == 0.3)
				c13 = 0.596;
			else if (value4 > 0.2 && value4 < 0.3) {
				c13 = Tool.getPointWithPoints(0.3, 0.596, 0.2, 0.7575, value4, c13);
			} else if (value4 == 0.2)
				c13 = 0.7575;
			else if (value4 > 0.1 && value4 < 0.2) {
				c13 = Tool.getPointWithPoints(0.1, 0.9245, 0.2, 0.7575, value4, c13);
			} else if (value4 == 0.1)
				c13 = 0.9245;
			else if (value4 > 0.0 && value4 < 0.1) {
				c13 = Tool.getPointWithPoints(0.1, 0.92, 0.0, 1.0, value4, c13);
			}

		}
		this.c13 = c13;
		return c13;
	}

	// 滑轮组的拉力
	public double hualun() {
		FT = Tool.forMat(Math.cos(Math.toRadians(K)) * G / Math.cos(Math.toRadians(p + K)));
		return FT;
	}

	// 控制绳的张力
	public double kongzhi() {
		FK = Tool.forMat(Math.sin(Math.toRadians(p)) * G / Math.cos(Math.toRadians(p + K)));
		return FK;
	}

	// 牵引绳张力
	public double qianyin() throws Exception {
		MZ = 0.95;
		FQ = Tool.forMat(FT / N * Math.pow(MZ, N));//
		double n = N, vis = FQ;
		while (vis > 1500.0) {
			if (n == 20)
				throw new Exception("滑轮组的拉力过大");
			if (n < 7.0) {
				n = 7;
				vis = Tool.forMat(FT / n * Math.pow(MZ, n));
			} else {
				n++;
				vis = Tool.forMat(FT / n * Math.pow(MZ, n));
			}
			FQ = vis;
			N = n;
		}
		return FQ;
	}

	// 滑轮组及绳索重量
	public double zongzhong() {
		GO = 10 + (Tool.forMat(64.4 / 100 * (60 + Tool.forMat(60 * N / Math.cos(Math.toRadians(K))))));
//		System.out.println(GO);
		return GO;
	}

	// 顶滑轮的载荷
	public double dinghuaz() {
		FH = Tool.forMat(Math.sqrt(Math.pow(FT * Math.sin(Math.toRadians(p)) - FQ * Math.sin(Math.toRadians(Q)), 2)
				+ (GO + FQ * Math.sin(Math.toRadians(Q)) + FT * Math.cos(Math.toRadians(p)))));
//		System.out.println(FH);
		return FH;
	}

	// 顶滑轮的倾角
	public double dinghuao() {
		DO = Tool.forMat(Math.asin((FT * Math.sin(Math.toRadians(p)) - FQ * Math.sin(Math.toRadians(Q))) / FH));
		return DO;
	}

	// 查表,结构迎风面充实率，间隔比，总风力系数，构件垂直于风向的实体迎风面积，风力，风荷载，当风载作用于危险截面时弯矩
	public double chajie() {

//		A1 = c[index1][3];
//		KG = c[index1][4];
//		IXI = c[index1][5];
//		IXK = c[index1][6];
//
//		IX0 = c[index1][7];
//		IY0 = c[index1][8];
//		ZO = c[index1][9];
//
//		A11 = c[index2][3];
//		KG1 = c[index2][4];
//		IXI1 = c[index2][5];
//		IXK1 = c[index2][6];
//
//		IX01 = c[index2][7];
//		IY01 = c[index2][8];
//		ZO1 = c[index2][9];

		if (I2 == 0) {
			I21 = 30;
		} else if (I2 == 1) {
			I21 = 40;
		} else if (I2 == 2) {
			I21 = 40;
		} else if (I2 == 3) {
			I21 = 40;
		} else if (I2 == 4) {
			I21 = 45;
		} else if (I2 == 5) {
			I21 = 45;
		} else if (I2 == 6) {
			I21 = 50;
		} else if (I2 == 7) {
			I21 = 50;
		} else if (I2 == 8) {
			I21 = 56;
		} else if (I2 == 9) {
			I21 = 56;
		} else if (I2 == 10) {
			I21 = 63;
		} else if (I2 == 11) {
			I21 = 63;
		} else if (I2 == 12) {
			I21 = 70;
		} else if (I2 == 13) {
			I21 = 70;
		} else if (I2 == 14) {
			I21 = 70;
		} else if (I2 == 15) {
			I21 = 75;
		} else if (I2 == 16) {
			I21 = 75;
		} else if (I2 == 17) {
			I21 = 75;
		} else if (I2 == 18) {
			I21 = 80;
		} else if (I2 == 19) {
			I21 = 80;
		} else if (I2 == 20) {
			I21 = 80;
		} else if (I2 == 21) {
			I21 = 90;
		} else if (I2 == 22) {
			I21 = 90;
		} else if (I2 == 23) {
			I21 = 90;
		} else if (I2 == 24) {
			I21 = 100;
		} else if (I2 == 25) {
			I21 = 100;
		} else if (I2 == 26) {
			I21 = 110;
		} else if (I2 == 27) {
			I21 = 110;
		} else if (I2 == 28) {
			I21 = 125;
		} else if (I2 == 29) {
			I21 = 125;
		} else if (I2 == 30) {
			I21 = 125;
		} else if (I2 == 31) {
			I21 = 140;
		} else if (I2 == 32) {
			I21 = 140;
		} else if (I2 == 33) {
			I21 = 140;
		}

		if (I1 == 0) {
			I11 = 30;
		} else if (I1 == 1) {
			I11 = 40;
		} else if (I1 == 2) {
			I11 = 40;
		} else if (I1 == 3) {
			I11 = 40;
		} else if (I1 == 4) {
			I11 = 45;
		} else if (I1 == 5) {
			I11 = 45;
		} else if (I1 == 6) {
			I11 = 50;
		} else if (I1 == 7) {
			I11 = 50;
		} else if (I1 == 8) {
			I11 = 56;
		} else if (I1 == 9) {
			I11 = 56;
		} else if (I1 == 10) {
			I11 = 63;
		} else if (I1 == 11) {
			I11 = 63;
		} else if (I1 == 12) {
			I11 = 70;
		} else if (I1 == 13) {
			I11 = 70;
		} else if (I1 == 14) {
			I11 = 70;
		} else if (I1 == 15) {
			I11 = 75;
		} else if (I1 == 16) {
			I11 = 75;
		} else if (I1 == 17) {
			I11 = 75;
		} else if (I1 == 18) {
			I11 = 80;
		} else if (I1 == 19) {
			I11 = 80;
		} else if (I1 == 20) {
			I11 = 80;
		} else if (I1 == 21) {
			I11 = 90;
		} else if (I1 == 22) {
			I11 = 90;
		} else if (I1 == 23) {
			I11 = 90;
		} else if (I1 == 24) {
			I11 = 100;
		} else if (I1 == 25) {
			I11 = 100;
		} else if (I1 == 26) {
			I11 = 110;
		} else if (I1 == 27) {
			I11 = 110;
		} else if (I1 == 28) {
			I11 = 125;
		} else if (I1 == 29) {
			I11 = 125;
		} else if (I1 == 30) {
			I11 = 125;
		} else if (I1 == 31) {
			I11 = 140;
		} else if (I1 == 32) {
			I11 = 140;
		} else if (I1 == 33) {
			I11 = 140;
		}
		// 改
		JYV = Tool.forMat(I11 * 4 * Z * 2 + S * I21 * 2 + Math.sqrt(S * S + Z * Z) * I21 * 4 / S * Z * 4);
		return JYV;
	}

	public double gowind() {

		// 判断计算类型
		DZ = Tool.forMat(cal2(JYV));
		return DZ;
	}

	// 间隔比
	public double jiange() {
		return 1;
	}

	// 总风力系数C
	public double zongfengli() {
		ZF = Tool.forMat(1.7 * (1 + DZ));
		return ZF;
	}

	// A
	public double goujian() {
		if (S == J) {
			TS = 0;
		} else {
			TS = Tool.forMat((L0 * S / 1000000 + (J / 1000)
					+ S * 3.5 * Math.cos(Math.atan(Tool.forMat((L - L0) / (S - J)))) / 1000) * DZ);//
		}
		return TS;
	}

	public double fengli() {
		FL = Tool.forMat(ZF * 90 * TS);
		return FL;
	}

	public double fenghezai() {
		QH = Tool.forMat(FL / 10);
//		System.out.println(QH);
		return QH;
	}

	public double dangfengzai() {
		M = Tool.forMat(QH * L * L / 8.0);
//		System.out.println(M);
		return M;
	}

	// 中间变量L1,L2,L3,L4,FB,N
	public double middle1() {
		LL1 = Tool.forMat(L * Math.sin(Math.toRadians(DO + Q)));
//		System.out.println(LL1);
		return LL1;
	}

	public double middle2() {

		LL2 = Tool.forMat(L / 2);
//		System.out.println(LL2);
		return LL2;
	}

	public double middle3() {
		LL3 = Tool.forMat(Math.sin(Math.toRadians(90 - Q - B)));
//		System.out.println(LL3);
		return LL3;
	}

	public double middle4() {
		LL4 = Tool.forMat(L * Math.sin(Math.toRadians(Q)) / 2);
//		System.out.println(LL4);
		return LL4;
	}

	public void calGZ() {
		double a = c[(int) (I1 - 1)][3];
		double b = c[(int) (I2 - 1)][3];
		double L1 = Math.sqrt(Z * Z + Math.pow(J + (S - J) / 4, 2));
		double L2 = Math.sqrt(Z * Z + Math.pow(J + (S - J) / 2, 2));
		double L3 = Math.sqrt(Z * Z + Math.pow(J + 3 * (S - J) / 4, 2));
		double L4 = Math.sqrt(Z * Z + S * S);
		if (btn1 == 1.0)
			GZ = ((L - L0) / Math.cos(Math.asin((S - J) / (L - L0))) + L0) * 0.004 * a
					+ ((L1 + L2 + L3 + L4) * 16 + L4 * 4 * L0 / Z + 4 * L0 / Z * S + 16 * S + 20 * J) * 0.001 * b;
		else
			GZ = ((L - L0) / Math.cos(Math.asin((S - J) / (L - L0))) + L0) * 0.003 * a
					+ ((L1 + L2 + L3 + L4) * 12 + L4 * 3 * L0 / Z + 3 * L0 / Z * S + 12 * S + 15 * J) * 0.001 * b;
	}

	public double waizhangxian() {
//		System.out.println(LL1);
//		System.out.println(LL2);
//		System.out.println(LL3);
//		System.out.println(LL4);
		calGZ();
		FB = Tool.forMat((LL1 * FH + FL * LL2 + LL4 * GZ) / LL3);//
		return FB;
	}

	public double ganshen() {
		GN = Tool.forMat(Math.sqrt(Math.pow(FB * Math.cos(Math.toRadians(B)) - FH * Math.sin(Math.toRadians(DO)), 2)
				+ Math.pow(FB * Math.sin(Math.toRadians(B)) + FH * Math.cos(Math.toRadians(DO)), 2)));
		return GN;
	}

	// 承托绳最大张力
	public double zuida() {
		FC = Tool.forMat(N * Math.sin(Math.toRadians(Q + TD)) / Math.sin(Math.toRadians(2 * TD)));
		return FC;
	}

	// 计算长度
	public double jisuanlong() {
		L1 = L;
		return L1;
	}

	// 截面惯性矩
	public double jimianguanxin() {
		IX1 = c[(int) (I1 - 1)][4];
		AS = c[(int) (I1 - 1)][2];
		Z0 = c[(int) (I1 - 1)][8];
		Z01 = c[(int) (I2 - 1)][2];
		HR = c[(int) (I1 - 1)][6];
		if (btn1 == 1.0)
			IX = Tool.forMat(4.0 * (IX1 + AS * Math.pow((S / 20 - Z0), 2)));
		else
			IX = Tool.forMat(3.0 * (IX1 + AS * Math.pow((S / 10 - Z0), 2)));
		return IX;
	}

	// 回转半径
	public double huizhuan() {
		if (btn1 == 1.0)
			IR = Tool.forMat(Math.sqrt(IX / (4 * AS)));
		else
			IR = Tool.forMat(Math.sqrt(IX / (3 * AS)));
		return IR;
	}

	// 抗弯模量
	public double kangwan() {
		W = Tool.forMat(2 * IX / S);
		return W;
	}

	// 长细比
	public double changxi() {
		YX = Tool.forMat(L1 / IR);
		return YX;
	}

	// 换算长细比
	public double huansuan() {
		if (btn1 == 1.0)
			Y0X = Tool.forMat(Math.sqrt(Math.pow(L1 / IR, 2) + 40 * 4 * AS / Z01));
		else {
			Y0X = Tool.forMat(Math.sqrt(
					Math.pow(L1 / IR, 2) + 42 * 3 * AS / (Z01 * (1.5 - Math.pow(Math.cos(Math.toRadians(O1)), 2)))));
		}
		return Y0X;
	}

	// 稳定系数
	public double wendingxi() {
		w1 = cal1(Y0X);
		return w1;
	}

	// 安全系数
	public double anquan() {
		AY = Tool.forMat(FQ1 / (N / (4 * (AS / 10000) * w1) + M / (W / 1000000)));
		return AY;
	}

	// 斜缀条与柱轴线夹角
	public double xiezhuitiao() {
		XO = Tool.forMat(Math.atan(S / Z));
		return XO;
	}

	// 单肢长细比
	public double danzhi() {
		DCB = Tool.forMat((Z / 10.0) / HR);
		return DCB;
	}

	// 两槽钢净距
	public double liangcao() {
		LJJ = Tool.forMat(S - 20.0 * Z0);
		return LJJ;
	}

	// 单肢轴压力
	public double danzhizhou() {
		ND = Tool.forMat(N / 4.0 + M / (2.0 * LJJ));
		return ND;
	}

	// 单肢稳定系数
	public double danzhiwen() {
		DW = cal1(DCB);
		return DW;
	}

	// 单肢稳定安全系数
	public double danzhiwenan() {
		DWA = Tool.forMat(DW * AS * FQ1 / (ND * 10));
		return DWA;
	}

	// 计算长度lx
	public double jisuanlonglx() {
		LX = Tool.forMat((S / 10 - 2 * Z0) / Math.sin(XO));
		return LX;
	}

	// 风载引起的斜缀条剪力
	public double v1() {
		V1 = Tool.forMat(ZF * 90 * I21 * LX * LX / 100000000 * 2);
		return V1;
	}

	// 纵向弯曲引起的横向剪力
	public double v2() {
		V2 = Tool.forMat((4 * AS * 100 * FS * Math.sqrt(FQ1 / 235) / 85) / 1000);
		return V2;
	}

	// 斜缀条长细比
	public double xiezhuichangxibi() {
		XCB = Tool.forMat(LX / c[(int) (I2 - 1)][7]);
		return XCB;
	}

	// 斜缀条稳定系数
	public double xiewending() {
		XAX = cal1(XCB);
		return XAX;
	}

	// 斜缀条稳定安全系数
	public double xiewendingan() {
		WA = Tool.forMat(FQ1 * c[(int) (I2 - 1)][2] * XAX * (V1 + V2) / Math.sin(Math.toRadians(XO)));
		return WA;
	}

//    public void cal() {
//    	hualun();
//		kongzhi();
//		qianyin();
//		zongzhong();
//		dinghuaz();
//		dinghuao();
//		chajie();
//		gowind();
//		zongfengli();
//		goujian();
//		fengli();
//		fenghezai();
//		dangfengzai();
//		middle1();
//		middle2();
//		middle3();
//		middle4();
//		waizhangxian();
//		ganshen();
//		zuida();
//		jisuanlong();
//		jimianguanxin();
//		huizhuan();
//		kangwan();
//    }

}