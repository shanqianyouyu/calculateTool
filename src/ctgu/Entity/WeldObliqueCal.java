package ctgu.Entity;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import ctgu.awt.frame.homepage.calFrame.weld.Review;
import ctgu.awt.util.Tool;

public class WeldObliqueCal {

	public double HF;
	public double HE;
	public double LW;
	public double O1;
	
	public double FZ;
	
	public double Wffw;
	
	//其他参数
	public double B1 = 1.0;	
	
	public double OT;
	public double OM;
	public double OMAX;
	public double JF1;
	public double ZF1;
	public double F3;
	
	public double se1;
	public double se;
	
	public WeldObliqueCal(double HF,double HE,double LW,double O1,double FZ,double Wffw){
		this.HF = HF;
		this.HE = HE;
		this.LW = LW;
		this.O1 = O1;
		this.FZ = FZ;
		this.Wffw = Wffw;
		
		
		System.out.println(HF);
		System.out.println(HE);
		System.out.println(LW);
		System.out.println(O1);
		System.out.println(FZ);
		System.out.println(Wffw);
		
	}
	
	
	//轴力作用下应力
	public double setZZF(){
		System.out.println(Math.cos(Math.PI/4-Math.toRadians(O1/2)));
		OT = Tool.forMat((FZ/(HE*LW))*Math.cos(Math.PI/4-Math.toRadians(O1/2)));
		return OT;
	}
	
	//正应力
	public double setOMAX(){
		OMAX = OT;
		return OMAX;
	}
	
	//剪应力分力二
	public double setJYL2(){
		ZF1 = Tool.forMat((FZ/(HE*LW))*Math.cos(Math.PI/4-Math.toRadians(O1/2)));
		return ZF1;
	}
	//角焊缝强度计算值
	public double setJJZ(){
		F3 = Tool.forMat((FZ/(HE*LW)));
		return F3;
	}
	//验算公式二
	public double setYS2(){
		if(Math.sqrt(Math.pow(OT, 2)+3*Math.pow(ZF1, 2)) <= Math.sqrt(3)*Wffw){
			se = 1;
		}
		else{
			se = 0;
		}
		return se;
	}
	

}
