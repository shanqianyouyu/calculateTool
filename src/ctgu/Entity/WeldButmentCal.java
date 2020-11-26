package ctgu.Entity;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import ctgu.awt.frame.homepage.calFrame.weld.Review;
import ctgu.awt.util.Tool;

public class WeldButmentCal {

	public double LW;
	public double PA;
	public double H1;
	public double FZ;
	
	public double FTW;
	public double FVW;		
	
	public double ZF;
	public double JZ;

	public double FH;
	public double YH;
	public double FW;
	public double YW;
		
	public double M1;
	public double N1;
	public double V1;
	
	
	public double FFW1;
	public double FTW1;
	public double FVW1;
	
	public double SA;
	public double IX;
	public double WX;
	public double SW;
	public double SX;
	
	public double O1;
	public double T1;
	public double JF1;
	public double ZF1;
	public double OS;
	
	public double se1;
	public double se2;
	
	public WeldButmentCal(double LW,double PA,double H1,double FZ,double FH,double YH,double FW,double YW,double M1,double N1,double V1){
		
		this.LW = LW;
		this.PA = PA;
		this.H1 = H1;
		this.FZ = FZ;
		this.FH = FH;
		this.YH = YH;
		this.FW = FW;
		this.YW = YW;
		this.M1 = M1;
		this.N1 = N1;
		this.V1 = V1;
		
		System.out.println(LW);
		System.out.println(PA);
		System.out.println(H1);
		System.out.println(FZ);
		System.out.println(FH);
		System.out.println(YH);
		System.out.println(M1);
		System.out.println(N1);
		System.out.println(V1);
		
	}
	
	public double setXO1(){
		ZF = Tool.forMat(FZ*Math.sin(Math.toRadians(PA))/(LW*H1));
		return FTW;
	}
	
	public double setXT1(){
		JZ = Tool.forMat(FZ*Math.cos(Math.toRadians(PA))/(LW*H1));
		return FVW;
	}
	
	public double setIX(){
		System.out.println(Math.pow((FH-2*YW),3)*(YH-FW));
		IX = Tool.forMat((YH*FH*FH*FH - Math.pow((FH-2*YW),3)*(YH-FW))/12);
		return IX;
	}
	
	public double setWx(){
		WX = Tool.forMat((2*IX)/FH);
		System.out.println(WX);
		return WX;
	}
	
	public double setSa(){
		SA = Tool.forMat(2*YH*YW + (FH - 2*YW)*FW);
		System.out.println(SA);
		return SA;
	}
	
	public double setSw(){
		SW = Tool.forMat(YH*YW*((FH - YW)/2) + FW*Math.pow((FH - 2*YW), 2)/8);
		return SW;
	}
	
	public double setTmax(){
		ZF1 = Tool.forMat(V1*SW/IX*YW);
		return ZF1;
	}
	
	public double setOmax(){
		JF1 = Tool.forMat(M1/WX + N1/SA);
		return JF1;
	}
	
	public double setSx(){
		SX = Tool.forMat(YH*YW*((FH - YW)/2));
		return SX;					
	}
	
	
	public double setO2(){
		O1 = Tool.forMat(M1*(FH - 2*YW)/(FH*WX)) + Tool.forMat((N1/SA));
		return O1;
	}
	
	public double setT2(){
		T1 = Tool.forMat(V1*SX/(FH*FW));
		return T1;
	}
	
	public double setOzs(){
		OS = Tool.forMat(Math.sqrt(Math.pow(O1, 2)+3*Math.pow(T1, 2)));
		return OS;
	}
	

}
