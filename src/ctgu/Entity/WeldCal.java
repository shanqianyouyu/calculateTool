package ctgu.Entity;

import ctgu.awt.frame.homepage.calFrame.weld.Review;

public class WeldCal {

	public double TWT;
	public double SDV;
	public double TOT;
	public double MFs;
	public double MFs1;
	public double ETo;
	public double CLw;
	public double Af;
	public double SLf;

	public double SOF;
	public double FFW;
	public double TFw;
	public double LOf;

	public double SOE;
	public double AWA;
	public double LB;
	public double e1;
	public double K1;
	public double K2;
	public double N;
	public double SFOf;
	public double m1;
	public double m2;
	public double LW;
	public double SAL;
	public double R1;
	public double IP;

	public double H1;
	public double FV;
	public double Me;
	public double AS;

	public double T1;
	public double WW;
	public double SW;
	public double IW;

	public double PWL;
	public double PTWL;
	public double SSW;
	public double IFB;
	public double N1;
	public double N2;
	public double L1;
	public double L2;
	public double NC;
	public double FM;
	public double AFM;
	public double AFM1;
	public double FFC;
	public double FOBS;
	public double FTBS;
	public double FTCS;
	public double FSCS;
	public double FT;
	public double FAT;
	public double FLT;
	public double FLTC;
	public double FNC;
	public double FNBS;
	public double FNCS;

	public double N3;

	public WeldCal(double tWT2, double sDV2, double tOT2, double mFs2, double mFs3, double eTo2, double cLw2,
			double af2, double sLf2, double sOF2, double fFW2, double tFw2, double lOf2, double sOE2, double aWA2,
			double lB2, double e12, double k12, double k22, double n3, double sFOf2, double m12, double m22, double lW2,
			double sAL2, double r12, double iP2, double h12, double fV2, double me2, double aS2, double t12, double wW2,
			double sW2, double iW2) {

		this.TWT = tWT2;
		this.SDV = sDV2;
		this.TOT = tOT2;
		this.MFs = mFs2;
		this.MFs1 = mFs3;
		this.ETo = eTo2;
		this.CLw = cLw2;
		this.Af = af2;
		this.SLf = sLf2;

		this.SOF = sOF2;
		this.FFW = fFW2;
		this.TFw = tFw2;
		this.LOf = lOf2;

		this.SOE = sOE2;
		this.AWA = aWA2;
		this.LB = lB2;
		this.e1 = e12;
		this.K1 = k12;
		this.K2 = k22;
		this.N = n3;
		this.SFOf = sFOf2;
		this.m1 = m12;
		this.m2 = m22;
		this.LW = lW2;
		this.SAL = sAL2;
		this.R1 = r12;
		this.IP = iP2;

		this.H1 = h12;
		this.FV = fV2;
		this.Me = me2;
		this.AS = aS2;

		this.T1 = t12;
		this.WW = wW2;
		this.SW = sW2;
		this.IW = iW2;

	}

	// 垂直于焊缝长度方向的应力
	public double setF1() {
		if(ETo == 0||CLw == 0)
			return 0;
		PWL = N / ETo * CLw;
		return PWL;
	}

	// 平行于焊缝长度方向的应力
	public double setF2() {

		if(ETo == 0||CLw == 0)
			return 0;
		PTWL = N / ETo * CLw;
		return PTWL;
	}

	// 正面角焊缝所承担的内力
	public double setF12() {

		IFB = SDV * SLf * ETo * SOE;
		return IFB;
	}
	
	// 侧面角焊缝的强度(三面围焊)
		public double setF13() {

			if(ETo == 0||SOE == 0)
				return 0;
			SSW = (N-IFB)/ETo * SOE;
			return SSW;
		}

	// 正面角焊缝所分担的轴心力
	public double setFn() {

		N3 = SOF * LB * SDV * SLf * 2 * 0.7;
		return N3;
	}

	// 角钢肢背承受的轴力
	public double setF21() {
		if(LB == 0)
			return 0;
		N1 = N * (LB - e1) / LB - N3 / 2;
		return N1;
	}

	// 肢尖承受的轴力
	public double setF22() {

		if(LB == 0)
			return 0;
		N2 = N * e1 / LB - N3 / 2;
		return N2;
	}

	// 角钢肢背计算长度
	public double setFL1() {

		if(FFW == 0 ||SDV == 0)
			return 0;
		L1 = N1 / FFW * 2 * 0.7 * SDV;
		return L1;
	}

	// 角钢肢尖计算长度
	public double setFL2() {

		if(TFw == 0 ||SDV == 0)
		return 0;
		L2 = N2 / TFw * 2 * 0.7 * SDV;
		return L2;
	}

	// 角钢端部产生的轴心力
	public double setF23() {

		if(ETo == 0 ||CLw == 0)
			return 0;
		NC = N * Math.sin(AWA) / ETo * CLw;
		return NC;
	}

	// 弯矩M产生的应力
	public double setF24() {

		if(ETo == 0 ||CLw == 0)
			return 0;
		FM = 6 * N * e1 / ETo * CLw * CLw;
		return FM;
	}

	// A点垂直于焊缝方向的应力
	public double setF25() {

		if(ETo == 0 ||CLw == 0)
			return 0;
		AFM = N * Math.cos(AWA) / ETo * CLw * 2 + 3 * N * e1 / ETo * CLw * CLw;
		return AFM;
	}

	// 剪力Ny在A点处产生平行于焊缝长度方向的应力
	public double setF26() {

		if(ETo == 0 ||CLw == 0)
			return 0;
		AFM1 = N * Math.cos(AWA) / 2 * ETo * CLw;
		return AFM1;
	}

	// 焊缝的强度计算式
	public double setF27() {

		Review re = new Review();
		FFC = re.ReviewCaculate(AFM, SLf, AFM1, SDV);
		return FFC;
	}

	// 最大弯曲应力发生在翼缘焊缝的最外纤维处的应力
	public double setF31() {

		if(LW == 0)
			return 0;
		FOBS = m2 * H1 / LW * 2;
		return FOBS;
	}

	// 腹板焊缝承受两种应力的共同作用的弯曲应力
	public double setF32() {

		if(LW == 0)
			return 0;
		FTBS = m2 * H1 / LW * 2;
		return FTBS;
	}

	// 腹板焊缝承受两种应力的共同作用的剪应力
	public double setF33() {

		if(SAL == 0)
			return 0;
		FTCS = FV / SAL;
		return FTCS;
	}

	// 有效截面的任一点上所受切线方向的剪应力
	public double setF34() {

		if(IP == 0)
			return 0;
		FSCS = Me * R1 / IP;
		return FSCS;
	}

	// 在扭矩T作用下，A点（或点）的应力
	public double setF41() {

		if(IP == 0)
			return 0;
		FT = Me * R1 / IP;
		return FT;
	}

	// A点引起的应力
	public double setF42() {

		if(ETo == 0 || SOE == 0)
			return 0;
		FAT = FV / ETo * SOE;
		return FAT;
	}

	// 垂直于焊缝长度方向的应力
	public double setF43() {

		FLT = FT*Math.cos(AWA) + FAT;
		return FLT;
	}

	// A点的应力满足的强度条件
	public double setF44() {

		Review re = new Review();
		FLTC = re.ReviewCaculate(FLT,FT*Math.sin(AWA), AFM1, SDV);
		return FLTC;
	}

	// 轴心力作用的对接焊缝应力
	public double setF45() {

		if(T1 == 0 || CLw == 0)
			return 0;
		FNC = N/T1*CLw;
		return FNC;
	}

	// 轴心力作用的对接焊缝的正应力
	public double setF46() {

		if(WW == 0)
			return 0;
		FNBS = Me/WW;
		return FNBS;
	}

	// 轴心力作用的对接焊缝的剪应力
	public double setF47() {

		if(IW == 0 || T1 == 0)
			return 0;
		FNCS = FV*SW / T1*IW;
		return FNCS;
	}


}
