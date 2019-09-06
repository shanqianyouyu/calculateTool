package ctgu.Entity;

import org.apache.poi.xslf.model.geom.SqrtExpression;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 
 * @author 陈煜昆
 *
 */
public class SquareCal {
	
	private double HM1;
	private double HM2;
	private double WM1;
	private double HD;
	private double PL;
	private double RL;

	private double DL;
	private double GXJ;
	private double DGXJ;
	private double SDZ;
	private double A;
	private double GL;
	private double WL;
	private double YX;
	private double YXX;
	private double SDc;

	private double WG;
	private double AL;
	private double AJ;
	private double ZG;

	private double N1;
	private double AX;
	private double ALA;
	private double AF;

	private double aWD;
	private double SAn;
	private double FY;

	private double Mj;
	private double MDk;
	private double PXj;

	private double WN;
	private double AFZ;
	private double AFQ;
	private double AKK;
	private double WG2;
	private double HV;

	private double ADb;
	private double ADn;
	private double BSg;
	private double AZz;
	private double ABt;

	private double BL;
	private double DBc;
	private double DBx;
	private double BBc;
	private double BBx;

	private double QG;
	private double FZ1;
	private double FZd;
	private double FQ1;
	private double FQ2;
	private double FD1;
	private double FL1;
	private double DL1;
	private double FZ2;
	private double FC1;
	private double FZ3;
	private double FM1;
	private double FAM1;
	private double FAY;
	private double FAZ;
	
	//分类参数
	private double FF1;

	public SquareCal(double HM1, double HM2, double WM1, double HD, double PL, double RL, double DL, double GXJ,
			double DGXJ, double SDZ, double A, double GL, double WL, double YX,double YXX,double SDc, double WG, double AL, double AJ,
			double ZG, double N1, double AX, double ALA, double AF, double aWD, double SAn, double FY, double Mj,
			double MDk, double PXj, double WN, double AFZ, double AFQ, double AKK, double WG2, double HV, double ADb,
			double ADn, double BSg, double AZz, double ABt) {
		super();
		this.HM1 = HM1;
		this.HM2 = HM2;
		this.WM1 = WM1;
		this.HD = HD;
		this.PL = PL;
		this.RL = RL;
		this.DL = DL;
		this.GXJ = GXJ;
		this.DGXJ = DGXJ;
		this.SDZ = SDZ;
		this.A = A;
		this.GL = GL;
		this.WL = WL;
		this.YX = YX;
		this.YXX = YXX;
		this.SDc = SDc;
		this.WG = WG;
		this.AL = AL;
		this.AJ = AJ;
		this.ZG = ZG;
		this.N1 = N1;
		this.AX = AX;
		this.ALA = ALA;
		this.AF = AF;
		this.aWD = aWD;
		this.SAn = SAn;
		this.FY = FY;
		this.Mj = Mj;
		this.MDk = MDk;
		this.PXj = PXj;
		this.WN = WN;
		this.AFZ = AFZ;
		this.AFQ = AFQ;
		this.AKK = AKK;
		this.WG2 = WG2;
		this.HV = HV;
		this.ADb = ADb;
		this.ADn = ADn;
		this.BSg = BSg;
		this.AZz = AZz;
		this.ABt = ABt;
	}

	//抱杆主材截面面积
	public double setS() {
		A = 4*SDZ;
		return A;
	}
	
	//(等截面)压杆截面惯性矩
	public double setDmomenToFinertia() {
		DBx = 4*(DGXJ + SDZ*(WL-2*GL)*(WL-2*GL)/4);
		return DBx;
	}

	//(等截面抱杆的长细比)
	public double setDslendernessRatio() {
		DBc = DL*YX/Math.sqrt(GXJ/A);
		return DBc;
	}

	//变截面抱杆长细比
	public double setBmomenToFinertia() {
		BBc = YX*DL*YX/Math.sqrt(GXJ/A);
		return BBc;
	}

	//四方形断面变截面抱杆的折算长细比
	public double setOneMomenToFinertia() {
		BBx = Math.sqrt(A*40/2*SDc + BBc*BBc);
		return BBx;
	}

	//中心压力的计算
	public double setCentralPressure() {
		FM1 = A*aWD*FY;
		return FM1;
	}

	//抱杆中部断面的抗弯断面系数
	public double setBendingSection(){
		MDk	= 2*WL/Mj;
		return MDk;
	}
	
	//按压弯件中心压力的计算
	public double setPermissibleCentralPressure() {
		FAM1 = A*aWD*FY/(1 + (PXj/MDk)*A*aWD);
		return FAM1;
	}

	public double setHrodLength() {
		BL = 1.5*(HM1 + HM2);
		System.out.println(BL);
		return BL;
	}

	public double setHrodLengthCat() {
		BL = 4*WM1 + PL + HD;
		return BL;
	}
	
	public double setHrodLengthTen() {
		BL = (2/3)*RL + WM1 + PL;
		return BL;
	}
	
	//起吊重力
	public double setWeight() {
		QG = 9.81*WG*ZG/1000;
		return QG;
	}

	//攀根绳的静张力
	public double setPstatictension() {
		FZ1 = Math.sin(AL)*QG/Math.cos(AL+AJ);
		return FZ1;
	}

	//起吊和牵引绳
	public double setDstatictension() {
		FQ1 = Math.cos(AL)*QG/Math.cos(AL+AJ);
		return FQ1;
	}
	
	//牵引绳的静张力
	public double setQstatictension() {
		FQ2 = FQ1/N1*Math.pow(AF, N1);
		return FQ2;
	}

	//抱杆拉线的静张力
	public double setLstatictension1() {
		FL1 = FQ1*Math.sin(AX+AJ)/2*Math.sin(AFZ-AX)*Math.cos(AJ);
		return FL1;
	}
	
	public double setLstatictension2() {
		FL1 = FQ1*Math.sin(AJ)/2*Math.sin(AFZ)*Math.cos(AJ);
		return FL1;
	}
	
	public double setLstatictension3() {
		FL1 = FQ1*Math.sin(AX+AJ)/2*Math.sin(AFZ-AX)*Math.cos(AJ);
		FF1 = FL1;
		return FL1;
	}
	
	public double setLstatictension4() {
		FL1 = FQ1*Math.sin(AJ)/2*Math.sin(AFZ)*Math.cos(AJ);
		return FL1;
	}

	//向下增加的拉力
	public double setZstatictension1() {
		FAY = FQ2*Math.sin(AX)/2*Math.sin(AFZ-AX)*Math.cos(AJ);
		return FAY;
	}

	//综合拉力
	public double setZstatictensionZ() {
		FAZ = FF1 + FAY;
		return FAZ;
	}
	
	//吊装辅助拉线静张力
	public double setZwireTension() {
		DL1 = Math.sin(AJ)/2*Math.sin(AFZ/2)*Math.cos(AFZ/2)*FQ1;
		return DL1;
	}

	public double setZwireTension1() {
		DL1 = 0.2546*FQ1;
		return DL1;
	}

	//抱杆的轴心压力,AFZ变化
	public double setAxisPressure() {
		FZ2 = (FQ1*Math.cos(AFZ+AJ)+FQ2*Math.sin(AFZ))/2*Math.sin(AFZ-AX);
		return FZ2;
	}

	public double setAxisPressure1() {
		FZ2 = (FQ1*Math.cos(AFZ+AJ)+FQ2*Math.sin(AFZ))/2*Math.sin(AFZ);
		return FZ2;
	}
	
	//承托绳的静张力
	public double setCstatictension() {
		FC1 = (BSg + FZ2)*Math.sin(AX+ADb)/2*Math.sin(2*ADb)*Math.cos(ADn);
		return FC1;
	}

	public double setCstatictension1() {
		FC1 = (BSg + FZ2)*Math.sin(ADb)/2*Math.sin(2*ADb)*Math.cos(ADn);
		return FC1;
	}
	
	public double setYaxialPressure1() {
		FZ3 = Math.cos(AKK)*Math.sin(AFQ+ABt)*WG2/Math.cos(AKK+AFQ)*Math.sin(ABt);
		return FZ3;
	}

	public double setYaxialPressure2() {
		FZ3 = Math.cos(AKK)*Math.sin(AFQ+ABt+AX)*WG2/Math.cos(AKK+AFQ)*Math.sin(ABt);
		return FZ3;
	}

	public double setYaxialPressure3() {
		FZ3 = Math.cos(AKK)*Math.sin(AFQ+ABt)*WG2/Math.cos(AKK+AFQ)*Math.sin(ABt) + FQ2;
		return FZ3;
	}

	public double setYaxialPressure4() {
		FZ3 = Math.cos(AKK)*Math.sin(AFQ+ABt+AX)*WG2/Math.cos(AKK+AFQ)*Math.sin(ABt);
		return FZ3;
	}

}
