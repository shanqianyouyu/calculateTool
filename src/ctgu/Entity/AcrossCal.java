package ctgu.Entity;

import java.awt.print.Printable;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

/**
 * 
 * @author 陈煜昆
 *
 */
public class AcrossCal {

	private double WLD;
	private double WCSC;
	private double NOSR;
	private double WLAC;
	private double WS;
	private double PA;
	private double IC;
	
	private double PC;
	
	private double HP;
	private double MVD;
	private double VA;
	private double LS;
	private double CW;
	private double IWP;
	private double Ms;
	private double Hd;
	private double Mhd;


	private double RS;
	private double SC;
	private double HHP;
	private double RPL;
	private double ADP;
	private double ACB;
	private double OPL;
	private double MSD;
	private double SCD;
	
	private double DCL;
	private double HSt;
	private double SSC;
	private double LOPT;
	private double ULW;
	private double ULWL;
	private double DWG;
	private double WCTC;
		
	
	//结果
	private double WLS;
	private double ULWP;
	private double HLS;
	private double MHC;
	private double MWS;
	
	private double MSS;
	private double Rpl;
	private double TRpl;
	private double WDD;
	
	private double L1;
	private double L2;
	private double L3;
	
	public AcrossCal(double WLD,double WCSC,double NOSR,double WLAC,
			double WS,double PC,double PA,double IC,double HP,double MVD,double VA,double LS,
			double CW,double IWP,double Ms,double Hd,double Mhd,double RS
			,double SC,double HHP,double RPL,double ADP,double ACB,double OPL
			,double MSD,double SCD,double DCL,double HSt,double SSC,double LOPT,double ULW,double ULWL
			,double DWG,double WCTC){
		super();
		this.WLD = WLD;
		this.WCSC = WCSC;
		this.NOSR = NOSR;
		this.WLAC = WLAC;		
		this.WS = WS;
		this.PA = PA;
		this.IC = IC;
		this.PC = PC;
		this.HP = HP;
		this.MVD = MVD;
		this.VA = VA;
		this.LS = LS;
		this.CW = CW;		
		this.IWP = IWP;
		this.Ms = Ms;
		this.Hd = Hd;
		this.Mhd = Mhd;
		this.RS = RS;
		this.SC = SC;
		this.HHP = HHP;
		this.RPL = RPL;
		this.ADP = ADP;
		this.ACB = ACB;
		this.OPL = OPL;
		this.MSD = MSD;
		this.SCD = SCD;
		this.DCL = DCL;
		this.HSt = HSt;
		this.SSC = SSC;
		this.LOPT = LOPT;
		this.ULW = ULW;
		this.ULWL = ULWL;
		this.DWG = DWG;
		this.WCTC = WCTC;	
	}
	
	
	//垂直载荷计算
	public double setVerticalLoad(){
		WLS = 200*NOSR*WLD;
		return WLS;
	}
	
	
	//均匀载荷计算
	public double setUniformLoad(){
		ULWP = WLAC*WCSC*PA*WS*WS/1600; 
		System.out.println(WCSC);
		return ULWP;
	}
	
	//水平载荷计算
	public double setHorizontalLoad(){
		HLS = IC*WLS*PC;
		return HLS;
	}
	
	//跨越架的最小高度
	public double setMinimumHeight(){
		MHC = HP+MVD+VA;
		return MHC;
	}
	
	//跨越架的最小宽度
	public double setMinimumWidth(){
		MWS = (LS + 2*CW)/Math.sin(IWP);
		return MWS;
	}
	
	//跨越架的最小跨距
	public double setMinimumSpan(){
		MSS = (Hd + 2*Mhd)/Math.sin(IWP);
		return MSS;
	}
	
	//中间变量
	//拉线位置引起的跨距
	public double setSpanCaused(){
		L1 = (HHP-RPL)*Math.sin(ACB)/Math.tan(ADP)*Math.tan(IWP);
		return L1;
	}
	
	//拉线至运行线路最小安全距离要求的跨距
	public double setMinimumSafety(){
		L2 = MSD/Math.cos(ADP);
		return L2;
	}
	
	//拉线至运行线路最小安全距离要求的跨距
	public double setCrossingAngle(){
		L3 = (HHP-RPL)*Math.sin(ACB)/Math.tan(ADP);
		return L2;
	}
		
	//架外侧至运行电力线的水平距离为
	public double setHorizontalDistance(){
		RPL = L1+L2+L3;
		return RPL;
	}
	
	//两幅跨越架间的跨距
	public double setTwoSpan(){
		TRpl = (2*RPL + Hd)/Math.sin(IWP);
		return TRpl;
	}
	
	//风偏距离单位长度风荷重
	public double setWindLoad(){
		ULWL = DWG*WCTC*0.0613;
		return ULWL;
	}
	
	//风偏计算
	public double setWindDeviation(){
		WDD = ULWL*(DCL*(SSC-DCL)/2*HHP + LOPT / ULW);
		return WDD;
	}
	
}
