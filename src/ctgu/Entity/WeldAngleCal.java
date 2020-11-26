package ctgu.Entity;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import ctgu.awt.frame.homepage.calFrame.weld.Review;
import ctgu.awt.util.Tool;

public class WeldAngleCal {

	//轴力，剪力，弯矩
	public double WM;
	public double WN;
	public double WV;
	
	//角焊缝强度设计值
	public double Wffw;
	
	//增大系数
	public double B1;
	
	//传入中间值
	public double R1;
	public double R2;
	public double R3;
	
	//截面模量，惯性矩，角焊缝有效截面面积
	public double Waf;
	public double WIW;
	public double WWFX;
	
	//应力计算结果
	public double WON;
	public double WOM;
	public double WOMAX;
	public double WTMAX;
	public double QJ;
	
	public double se;

	public WeldAngleCal(double WM, double WN, double WV, double Wffw, double R1, double R2, double R3,
			double B1){

		this.WM = WM;
		this.WN = WN;
		this.WV = WV;
		this.Wffw = Wffw;
		this.R1 = R1;
		this.R2 = R2;
		this.R3 = R3;
		this.B1 = B1;
		System.out.println(WM);
		System.out.println(WN);
		System.out.println(WV);
		System.out.println(R1);
		System.out.println(Wffw);
		System.out.println(R2);
		System.out.println(R3);
		System.out.println(B1);
	}

	
	//角焊缝有效截面面积
	public double setAngleS(){
		Waf = 0.7*R1;
		return Waf;
	}

	//拉力作用下应力
	public double setLF(){
		WON = Tool.forMat(WN/Waf);
		System.out.println(WON);
		return WON;
	}
	
	//惯性矩
	public double setGuanX(){
		WIW = Tool.forMat(0.7*R2/12);
		return WIW;
	}
	
	//截面模量
	public double setJMML(){
		WWFX = Tool.forMat(0.7*R3/12);
		return WWFX;
	}
	
	//弯矩作用下应力
	public double setWF(){
		WOM = Tool.forMat(WN/WWFX);
		return WOM;
	}
	
	//正应力
	public double setZYL(){
		WOMAX = WOM + WON;
		return WOMAX;
	}
	
	//剪应力
	public double setJYL(){
		WTMAX = Tool.forMat(WV/Waf);
		return WTMAX;
	}
	
	//验算
	public double setYS(){
		QJ = Tool.forMat(Math.sqrt(Math.pow((WOMAX/B1), 2)+Math.pow(WTMAX, 2)));
		return QJ;
	}
	
}
